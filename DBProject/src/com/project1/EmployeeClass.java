package com.project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmployeeClass {

   public void managerOrder() {
      // 매장 관리 class 
     Connection conn = null;
     Scanner sc = new Scanner(System.in);
         
     try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           String url = "jdbc:oracle:thin:@localhost:1521:xe";
           String user = "ADAM";
           String pw = "1234";
           conn = DriverManager.getConnection(url, user, pw);
           Statement st = conn.createStatement();
        
           while(true) {
        // 직원확인(staff, manager 직급만 발주 가능)
           System.out.println("** Intern 직급은 사용할 수 없는 기능입니다. 본인 인증을 해주세요. **");
           System.out.println(" ┌─── 매장 관리 프로그램 ───┐ ");
           System.out.println("         직원 확인");
           System.out.println(" └─────────────────────┘");
           System.out.println("본인의 이름을 입력하세요.");
           System.out.println(" >> ");
           String mem_name = sc.nextLine();         // 저장할 필요 없음
           
           System.out.println("사원번호를(-포함) 입력하세요.");
           System.out.println(" >> ");
           String mem_ps = sc.nextLine();            // 사원번호로 직급을 조회하여 비교
           String position = getPosition(conn, mem_ps);   // 직급확인
           
           String sel_level = "SELECT mem_position FROM employee_mem WHERE mem_num = '" + mem_ps + "'";      // level에 입력받은 부분과 mem_num이 일치하는지 비교
           ResultSet rs_level = st.executeQuery(sel_level);
           while (rs_level.next()) {
                position = rs_level.getString("mem_position");
           }
           
           label : while (true) {
              if(position.equals("Manager") || position.equals("Staff")) {
                 System.out.println(" ┌───── 매장 관리 프로그램 ─────┐ ");
                 System.out.println("   1. 매출 조회");
                 System.out.println("   2. 보유 재고 수량 조회");
                 System.out.println("   3. 발주");
                 System.out.println("   0. 프로그램 닫기/재시작");
                 System.out.println(" └─────────────────────────┘");
                 System.out.print(" >> ");
                 int num = sc.nextInt();
                 sc.nextLine();
                 
                 switch (num) {
                 case 1:
               // 매장의 총 매출액 확인
                    int sales = 0;
                    String tp = "SELECT SUM(TO_PRICE) as TOPRICE FROM totalsales";
                    ResultSet tp2 = st.executeQuery(tp);
                    while (tp2.next()) {
                        sales = tp2.getInt("TOPRICE");
                    }
                    System.out.println("총 매출액은 👛" + sales + "원 입니다.");
                    break;
                    
                 case 2:
                    // 매장의 재고 확인
                    checkCart(conn);
                    break;
                    
                 case 3:
                    // 발주하기
                    while (true) {
                       
                      System.out.println(" ┌────────── 발주 ──────────┐ ");
                      System.out.println("   1. 발주 가능 물품/수량 보기");
                      System.out.println("   2. 발주하기");
                      System.out.println("   0. 뒤로가기");
                      System.out.println(" └─────────────────────────┘");
                      System.out.print(" >> ");
                      int no = sc.nextInt();
                      sc.nextLine();
                          
                      switch(no) {
                      case 1:
                         // 발주 가능한 물품확인
                         System.out.println(" = = = = = = = = 발주 가능 물품 = = = = = = = = ");
                         System.out.println(" ");
                         
                         String prodAll = "SELECT * FROM PROD";
                         ResultSet rs2 = st.executeQuery(prodAll);
                        while (rs2.next()) {
                         String pc = rs2.getString("PROD_CODE");
                         String pn = rs2.getString("PROD_NAME");
                         int pp = rs2.getInt("PROD_PRICE");
                         int pq = rs2.getInt("PROD_QTY");
                         
                         System.out.printf(" [ 상품코드: %s ] [ 상품명: %s ] [ 단가: %d ] [ 수량: %d ]\n", pc, pn, pp, pq);
                         }
                         System.out.println(" ");
                         System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");
                         
                      break;
                      
                      case 2:
                         // 발주
                         System.out.println("** 주문 할 상품의 이름과 수량을 입력하세요. **");
                        System.out.println(" 상품명: ");
                        String orderName = sc.nextLine();
                        System.out.println(" 수량: ");
                        int orderQty = sc.nextInt();
                        sc.nextLine();
                         
                       // 상품 가격 가져오기
                        String prodPrice = "SELECT prod_price FROM PROD WHERE prod_name = '" + orderName + "'";
                        ResultSet PP = st.executeQuery(prodPrice);
                        int pPrice = 0;
                        if (PP.next()) {
                           pPrice = PP.getInt("prod_price");
                        }
                      
                         // 상품명이 일치하면 prod테이블에서 물품 가져오기 -> cart테이블로 이동
                        processOrder(conn, orderName, orderQty);
                        addToCart(conn, orderName, orderQty, pPrice);
                        break;
                      
                      case 0:
                         // 매장관리 프로그램 화면으로 돌아가기
                         System.out.println("이전 단계로 돌아갑니다.");
                         continue label;
                      
                      }   // switch
                }   //while
                    
                 case 0:
                    System.out.println("매장 관리 프로그램을 종료 하려면 Y, 재시작 하려면 N을 눌러주세요.");
                    String exit = sc.nextLine();
                    if(exit.equals("Y")||exit.equals("y")) {
                       System.out.println("매장 관리 프로그램을 종료합니다.");
                       sc.close();
                       System.exit(0);
                    } else if(exit.equals("N")||exit.equals("n")) {
                       System.out.println("프로그램을 재시작합니다.");
                    } 
                    break;
                }
              } else {
                 System.out.println("권한이 없습니다. 다른 직급의 사원 접근이 필요합니다.");
                 System.out.println(" ");
                 break;
              }
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
  private static String getPosition(Connection conn, String mem_ps) throws SQLException {
     // 직급 확인
     String sel_level = "SELECT mem_position FROM employee_mem WHERE mem_num = ?";
       PreparedStatement stmt = conn.prepareStatement(sel_level);
       stmt.setString(1, mem_ps);
       ResultSet rs = stmt.executeQuery();

       if (rs.next()) {
           return rs.getString("mem_position");
       }
       return "";
  }
      
  public static void processOrder(Connection conn, String orderName, int orderQty) throws SQLException {
       // 상품 재고 조회
       String orderSql = "SELECT prod_qty FROM prod WHERE prod_name = '" + orderName + "'";      // 상품명에 대한 수량 불러오기
       
       Statement getcart = conn.createStatement();
       ResultSet gcResult = getcart.executeQuery(orderSql);
       
       if (gcResult.next()) {
           int nowQty = gcResult.getInt("prod_qty");
           
           if (nowQty >= orderQty) {
               // 주문이 가능한 경우에만  주문 후 재고를 업데이트 하기
               int updatedQty = nowQty - orderQty;
               String updateSql = "UPDATE prod SET prod_qty = " + updatedQty + " WHERE prod_name = '" + orderName + "'";
               
               Statement updateProd = conn.createStatement();
               updateProd.executeUpdate(updateSql);
            
               System.out.println("발주 완료 😉👌");
               
           } else {
               System.out.println("재고가 부족합니다. 재고 확인 후 다시 주문해주세요.");
           }
       } else {
           System.out.println("주문할 상품이 존재하지 않거나 잘못된 입력입니다.");
       }
   }
      
  public static void addToCart(Connection conn, String orderName, int orderQty, int pPrice) {
     // cart클래스에 물품저장
       try {
           // 랜덤 주문번호 생성
           Random random = new Random();
           int orderNumber = random.nextInt(9999);
           // 현재 날짜 가져오기
           LocalDate nowDate = LocalDate.now();
           boolean isCartNo = isCartNoExist(conn, orderNumber);
           
           if(!isCartNo) {
              // cart 테이블에 새로운 레코드 삽입을 위한 SQL 쿼리 작성
               String insertQuery = "INSERT INTO cart (CART_NO, CART_QTY, CART_DATE, PROD_NAME, CART_PRICE) VALUES (?, ?, ?, ?, ?)";
               PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
               insertStatement.setInt(1, orderNumber);
               insertStatement.setInt(2, orderQty);
               insertStatement.setDate(3, java.sql.Date.valueOf(nowDate));
               insertStatement.setString(4, orderName);
               insertStatement.setInt(5, pPrice);
               
               // 쿼리 실행
               insertStatement.executeUpdate();
           } 
       }catch (SQLException e) {
           e.printStackTrace();
       }
   }
      
  public static boolean isCartNoExist(Connection conn, int orderNumber) {
     int count = 0;
     try {
        // 주문번호 중복 검사
           String insertQuery = "select count(*) as cnt from cart where cart_no = ? ";
           PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
           insertStatement.setInt(1, orderNumber);
           
           ResultSet rs = insertStatement.executeQuery();
           
           while(rs.next()) {
              count = rs.getInt("cnt");
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
     return (count > 0) ? true : false;
  }
      
  private static void checkCart(Connection conn) throws SQLException {
     // 재고 확인
      try {
          System.out.println(" = = = = = = = = = = = = 매장 재고 = = = = = = = = = = = = ");
          System.out.println(" ");

          String inventoryQuery = "SELECT * FROM cart";
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(inventoryQuery);

          while (rs.next()) {
              String prodName = rs.getString("prod_name");
              int prodQty = rs.getInt("cart_qty");
              System.out.println(" [ 상품명: " + prodName + " ] [ 재고량: " + prodQty + " ]");
          }

          System.out.println(" ");
          System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = ");

      } catch (SQLException e) {
          e.printStackTrace();
      }
  }
}