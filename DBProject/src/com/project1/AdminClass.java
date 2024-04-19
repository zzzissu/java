package com.project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AdminClass {

   public static void main(String[] args) {
      // 직원 관리 class
      Connection conn = null;
      Scanner sc = new Scanner(System.in);

      try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "ADAM";
            String pw = "1234";
            String sql = "SELECT * FROM employee_mem";
            conn = DriverManager.getConnection(url, user, pw);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
         
            String on_name = null;
            String on_num = null;
            String on_date = null;
            String date1 = null;      // 직원 조회에 사용하기 위해 전역변수로 초기화
            String date2 = null;
   
            String off_name = null;
            String off_num = null;
            String off_date = null;
            String date3 = null;
            String date4 = null;
             
            while (true) {
               System.out.println(" ┌────── 직원 관리 프로그램 ──────┐ ");
               System.out.println("    1. 출근");
               System.out.println("    2. 퇴근");
               System.out.println("    3. 직원 등록");
               System.out.println("    4. 직원 조회");
               System.out.println("    0. 프로그램 닫기/재시작");
               System.out.println(" └───────────────────────────┘ ");
               System.out.print(" >> ");
               int num = sc.nextInt();      //사용자가 번호로 기능 선택
               sc.nextLine();
            
               switch (num) {
               case 1:
                  // 출근 등록하기(no DB)
                  System.out.println(" = = 출근 등록 = =");
                  
                  System.out.print(" 이름: ");
                  on_name = sc.nextLine();
                  
               // 사원 정보에 이름이 존재하는지 확인
                  String checkName = "SELECT mem_name FROM employee_mem WHERE mem_name = '" + on_name + "'";
                  ResultSet nameCheck = st.executeQuery(checkName);
                  boolean nameBol = false;
                  
                  while (nameCheck.next()) {
                     nameBol = true;
                      break;
                  }
                  
                  if (!nameBol) {
                      System.out.println("입력하신 이름의 사원이 존재하지 않습니다.");
                      break; // 출근 등록 종료
                  }
                  
                  System.out.print("\n 사원번호(-포함): ");
                  on_num = sc.nextLine();
                  
                  System.out.print("\n 시간(hh:mm): ");
                  on_date = sc.nextLine();
                  date1 = on_date.substring(0,2);
                  date2 = on_date.substring(2);
                  
                  String checkOnMem = "SELECT mem_num, mem_name FROM employee_mem WHERE mem_num = '" + on_num + "' AND mem_name = '" + on_name + "'";
                  ResultSet onCheck = st.executeQuery(checkOnMem);
                  boolean found = false;
                  
                  while (onCheck.next()) {
                     String ONname = onCheck.getString("mem_name");
                     String ONnum = onCheck.getString("mem_num");
                     
                     if(ONname != null && ONnum != null && ONname.equals(on_name) && ONnum.equals(on_num)) {
                        System.out.printf("\n ** %s님 %s:%s 출근하셨습니다. **\n", on_name, date1, date2);
                        found = true;
                         break; // 이미 데이터를 찾았으므로 루프 종료
                     } 
                  }
                  if(!found) { // 데이터를 찾지 못한 경우
                     System.out.println("잘못된 입력입니다.");
                  }
                  break;
                  
               case 2:
                  // 퇴근 등록(no DB)
                  System.out.println(" = = 퇴근 등록 = =");

                  System.out.print(" 이름: ");
                  off_name = sc.nextLine();
                  
                  System.out.print("\n 사원번호(-포함): ");
                  off_num = sc.nextLine();
                  
                  System.out.print("\n 시간(hh:mm): ");
                  off_date = sc.nextLine();
                  date3 = off_date.substring(0,2);
                  date4 = off_date.substring(2);
                  
                  String checkOffMem = "SELECT mem_num, mem_name FROM employee_mem WHERE mem_num = '" + off_num + "' AND mem_name = '" + off_name + "'";
                  ResultSet offCheck = st.executeQuery(checkOffMem);
                  boolean found2 = false;
                  
                  while (offCheck.next()) {
                     String OFFname = offCheck.getString("mem_name");
                     String OFFnum = offCheck.getString("mem_num");
                     
                     if(on_name.equals(off_name) && on_num.equals(off_num) && OFFname.equals(off_name) && OFFnum.equals(off_num)) {
                        // 출근정보에 있는 사람만 퇴근이 가능하게
                        System.out.printf("\n ** %s님 %s:%s 퇴근하셨습니다. **\n", off_name, date3, date4);
                     } else {
                        System.out.println("출근 정보가 없습니다.");
                     }
                     
                  }
                  if (!found2) { // 데이터를 찾지 못한 경우
                      System.out.println("잘못된 입력입니다.");
                  }
                  
                  break;
                  
               case 3:
                  // 직원 등록(DB에 정보저장)
                  System.out.println(" = = 직원 등록 = =");
                  System.out.println("** 직원의 정보를 입력하세요. **");
                  
                  System.out.println("이름: ");
                  String memName = sc.nextLine();
                  
                  System.out.println("입사일(형식: yyyy-MM-dd): ");
                  String memHiredate = sc.nextLine();
                  SimpleDateFormat dateFormat  = new SimpleDateFormat("yyyy-MM-dd");
                  java.util.Date memHd = null;
                  try {
                     memHd = dateFormat.parse(memHiredate);
                  } catch (ParseException e) {
                      e.printStackTrace();
                  }
                  
                  System.out.println("직급: ");
                  String memPosition = sc.nextLine();
                  
                  System.out.println("사원번호(-생략): ");
                  String memNum = sc.nextLine();
                  String format_mn = formatEmpnum(memNum);
                  
                  mem_update(conn, memName, memHiredate, memPosition, format_mn);
                  break;
                  
               case 4:
                  // 직원확인
                  /* manager직급 이상만 조회가능 */
                  System.out.println("** manager 직급만 가능한 기능입니다. 본인 인증을 해주세요. **");
                  System.out.println("사원번호 입력(-포함): ");
                  System.out.println(" >> ");
                  String level = sc.nextLine();
                 
                  String sel_level = "SELECT mem_position FROM employee_mem WHERE mem_num = '" + level + "'";      // level에 입력받은 부분과 mem_num이 일치하는지 비교
                     ResultSet rs_level = st.executeQuery(sel_level);
                     String position = "";
                     while (rs_level.next()) {
                         position = rs_level.getString("mem_position");
                     }
                 
                  if(position.equals("Manager")) {
                     System.out.println(" ┌────── 직원 관리 프로그램 ──────┐ ");
                     System.out.println("   1. 전체 직원 조회");
                     System.out.println("   2. 근무 중인 직원 조회");
                     System.out.println(" └───────────────────────────┘ ");
                     int on_mem = sc.nextInt();
                     sc.nextLine();
                     
                        if(on_mem == 1) {
                           System.out.println("** 전체 직원의 정보를 조회합니다. **");
                           String sel_mem = "SELECT * FROM employee_mem ORDER BY mem_name";
                           
                           ResultSet sm = st.executeQuery(sel_mem);
                           while(sm.next()) {
                             String mn = sm.getString("mem_name");
                              String mh = sm.getString("mem_hiredate");
                              String mp = sm.getString("mem_position");
                              String mu = sm.getString("mem_num");
                              
                             System.out.println("이름: " + mn + " / 입사일: " + mh + " / 직급: " + mp +  " / 직원번호: " + mu);
                           }
                              System.out.println("** 전체 직원의 정보입니다. **");
                        
                        } else if(on_mem == 2) {
                           System.out.println("** 현재 근무중인 직원을 조회합니다. **");
                           
                           if(off_name != null && off_num != null) {      // 퇴근 한 직원이 있으면 근무중인 직원이 없다고 출력
                              System.out.println("** 현재 근무중인 직원이 없습니다. **");
                           } else if (on_name != null && on_num != null) {                // 출근한 직원 정보가 있을 때에만 출력
                               System.out.printf("이름: %s, 사원번호: %s, 출근시간: %s:%s", on_name, on_num, date1, date2);
                               System.out.println("\n ** 현재 근무중인 직원입니다. **\n");
                           } else {
                              System.out.println("** 현재 근무중인 직원이 없습니다. **");
                           }
                        }
                 } else {
                    System.out.println("** manager 권한이 필요합니다. **");
                 }
                    break;
                  
               case 0:
                  System.out.println("** 직원 관리 프로그램을 종료 하려면 Y, 재시작 하려면 N을 눌러주세요. **");
                  String exit = sc.nextLine();
                  if(exit.equals("Y")||exit.equals("y")) {
                     System.out.println("** 직원 관리 프로그램을 종료합니다. **");
                     sc.close();
                     System.exit(0);
                  } else if(exit.equals("N")||exit.equals("n")) {
                     System.out.println("** 프로그램을 재시작합니다. **");
                  } 
                  break;
                  }
               }
            } catch (ClassNotFoundException | SQLException e) {
                  e.printStackTrace();
            } finally {
                  try {
                     conn.close();
                  } catch (SQLException e) {
                     e.printStackTrace();
                  }
               }
            }
   public static String formatEmpnum(String employNum) {
       if(employNum.length() == 8) {
       String part1 = employNum.substring(0, 4);
       String part2 = employNum.substring(4);
       return part1 + "-" + part2;         // 사원번호 8자리를 입력하면 4자리씩 -로 구분하여 저장하기
       }
       return "** 다시 입력해주세요. **";
   }
         // 직원 등록 - DB에 저장하기

   public static void mem_update(Connection conn, String memName, String memHiredate, String memPosition, String memNum) throws SQLException {
      String sql = "INSERT INTO employee_mem (mem_name, mem_hiredate, mem_position, mem_num) VALUES ('" + memName + "', '" + memHiredate + "', '" + memPosition + "', '" + memNum + "')";
      
      Statement getmem = conn.createStatement();
      int update = getmem.executeUpdate(sql);
      if (update > 0) {
         System.out.println("** 직원 정보가 성공적으로 데이터베이스에 저장되었습니다. **");
      } else {
         System.out.println("** 직원 정보 저장에 실패했습니다. **");
      }
   }
}