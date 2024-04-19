package com.project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerClass {
   
   public static void main(String[] args) {
      // 주문 class
      Connection conn = null;
      Scanner sc = new Scanner(System.in);
      ArrayList<arrayList> Ary = new ArrayList<>();
      arrayList orderItem = new arrayList();
//      totalSales ts = new totalSales();
            
     try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "ADAM";
        String pw = "1234";
        String sql = "SELECT * FROM cart";
        conn = DriverManager.getConnection(url, user, pw);
        
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        String name = null;
        int qty = 0;
        int totalSell = 0;
        int roundpp = 0;
        int pp = 0;
        int prQ = 0;
        int prP = 0;
        String prN = null;
        
        System.out.println(" ┌────────────────────────────────────────┐ ");
        System.out.println("     🍪        🍩                   🥨");
        System.out.println("");
        System.out.println("   어서오세요 ~（＾∀＾●）ﾉｼ     🥐 ");
        System.out.println("         🥖        지수당 입니다 ~ (●'◡'●) ");
        System.out.println("");
        System.out.println("   🍰               🍞                  🎂");
        System.out.println(" └────────────────────────────────────────┘");
        
        // 주문 정보 입력 받기
            while (true) {
              System.out.println(" ┌─────────────────────────┐ ");
              System.out.println("   1. 메뉴 보기 ");
              System.out.println("   2. 메뉴 담기 ");
              System.out.println("   3. 계산 ");
              System.out.println("   4. 🔒직원 전용 프로그램 실행🔒 ");
              System.out.println("   0. 나가기 ");
              System.out.println(" └─────────────────────────┘");
              System.out.println(" >> ");
              int choice = sc.nextInt();
              sc.nextLine();
              
              switch(choice) {
              case 1:
                 // 메뉴 조회
                 Menu(conn);
                 break;
              case 2:
                 // 주문하기
                 boolean cart = true;
                 label : while(cart) {
                   System.out.println("** 주문 할 상품의 이름과 수량을 입력하세요. **");
                    System.out.println(" 상품명: ");
                    name = sc.nextLine();         // nextLine 대신 next를 사용하여 개행문자를 제거
                    
                 // cart 정보에 이름이 존재하는지 확인
                    String checkName = "SELECT prod_name FROM cart WHERE prod_name = '" + name + "'";
                    ResultSet nameCheck = st.executeQuery(checkName);
                    boolean nameBol = false;
                    
                    while (nameCheck.next()) {
                       nameBol = true;
                        break;
                    }
                    if (!nameBol) {
                        System.out.println("입력하신 이름의 상품이 존재하지 않습니다.");
                        break; // 출근 등록 종료
                    }
                    nameCheck.close();
                    
                    System.out.println(" 수량: ");
                    qty = sc.nextInt();
                    sc.nextLine();
                    
                 // 주문한 상품의 재고 수량 확인
                    ResultSet have = st.executeQuery("SELECT cart_qty FROM cart WHERE prod_name = '" + name + "'");
                    if (have.next()) {
                       int haveQty = have.getInt("cart_qty");
                       if (haveQty < qty) {
                           System.out.printf(" 재고가 부족하여 최대 %d개까지 주문 가능합니다./(ㄒoㄒ)/ \n", haveQty);
                           have.close();
                           continue; // 재고가 부족하면 주문 초기화면으로 다시 돌아가기
                       }
                    }
                    have.close();
                    
                    // 금액 가져오기
                    ResultSet buy = st.executeQuery("SELECT * FROM cart WHERE prod_name = '" + name + "'");
                    while (buy.next()) {
                        String pn = buy.getString("prod_name");
                        if (pn.equals(name)) {
                            pp = buy.getInt("cart_price");
                            break;
                        }
                    }
                    roundpp = (int) Math.round(pp * 1.1);
                    
                    // 장바구니에 같은 상품이 있으면 합쳐서 출력
                    boolean updated = false;
                    for (arrayList item : Ary) {
                        if (item.getSell_name().equals(name)) {
                            item.setSell_qty(item.getSell_qty() + qty);
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                    // 상품을 장바구니에 저장
                       orderItem = new arrayList(name, qty, roundpp);
                       Ary.add(orderItem);
                    }
                    buy.close();

                    // 중복이 있으면 돌아가기
                    int Qty = 0;
                    ResultSet cartQty = st.executeQuery("SELECT cart_qty FROM cart WHERE prod_name = '" + name + "'");
                    if(cartQty.next()) {
                       Qty = cartQty.getInt("cart_qty");
                    }
                    for (arrayList item : Ary) {
                    prQ = item.getSell_qty();
                       if(prQ > Qty) {
                          System.out.println(" 주문량이 재고수량보다 많습니다. 다시 선택해주세요.");
                          Ary.clear();      // 장바구니를 비우고 다시 선택
                          continue label;
                       } else {
                          System.out.println(" 🛒 주문하신 상품이 장바구니에 담겼습니다 O(∩_∩)O 🛒 ");
                          System.out.println(" = = = = = = = = = = = = = = = = = ");
                          System.out.println(" ");
                          System.out.println(" 계속 주문하시겠습니까?(1. 예 | 2. 아니오)");
                          System.out.println(" >> ");
                          int ing = sc.nextInt();
                          sc.nextLine();
                          
                         if(ing == 2) {
                             cart = false;      // 아니오를 선택하면 종료
                             break;
                         } else if (ing != 1 && ing != 2){
                             System.out.println("잘못된 입력입니다.");
                         }
                       }         
                    }
                 }
                 break;
                 
              case 3:
                 // 결제하기
                System.out.println(" ┌─────────────── 장바구니 ───────────────┐ ");
                 for (arrayList item : Ary) {
                    prN = item.getSell_name();
                    prQ = item.getSell_qty();
                    prP = item.getSell_price();
                    totalSell += prQ * prP;
                         
                         // 장바구니에 저장된 내용 가져오기
                         System.out.printf("    [ %s - %d개 ] \n", prN, prQ);
                            
                       // 주문 후 cart 업데이트
                         cart_buy (conn, prQ, prN, totalSell);
                 }
                      System.out.println("    ---------------------------------");
                      System.out.println("              총 금액: " + totalSell + "원");
                      System.out.println(" └──────────────────────────────────────┘");
                      System.out.println("");
                      System.out.println("장바구니의 상품을 모두 결제하겠습니다.");
                      System.out.println("🔦삐-빅🔦");
                      System.out.println("결제가 완료 되었습니다. 감사합니다🤗\n");
                      
                      // 결제 금액을 총매출액에 추가
                      ResultSet ts = st.executeQuery("UPDATE totalsales SET to_price = to_price +" + totalSell);
                      
                      // 주문 후에 메뉴판에서 재고가 0인 상품을 제거
                      soldOut(conn, prN);
                       // 결제 후 장바구니 비우기
                      Ary.clear();
                      totalSell = 0;
                      break;
                       
               case 4:
                 
                  System.out.println(" ┌───── 🔒 직원 전용 프로그램 🔒 ─────┐ ");
                   System.out.println("      사원 번호를(-포함) 입력하세요.");
                   System.out.println(" └──────────────────────────────┘");
                   System.out.println(" >> ");
                   String empl = sc.nextLine();
                   
                // 데이터베이스에서 해당 사원 번호가 있는지 확인
                   if (emplCheck(conn, empl)) {
                       // 사원 번호가 데이터베이스에 존재하면 cart 클래스 실행
                      EmployeeClass ct = new EmployeeClass();
                      ct.managerOrder();
                   } else {
                       System.out.println("사원 번호가 일치하지 않습니다.");
                   }
                   break;
                    
              case 0:
                System.out.println("프로그램을 종료 하려면 Y, 재시작 하려면 N을 눌러주세요.");
                String exit = sc.nextLine();
                if(exit.equals("Y")||exit.equals("y")) {
                   System.out.println("프로그램을 종료합니다.");
                   sc.close();
                   System.exit(0);
                } else if(exit.equals("N")||exit.equals("n")) {
                   System.out.println("프로그램을 재시작합니다.");
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
   public static void cart_buy (Connection conn, int prQ, String prN, int totalSell) throws SQLException {
      String buy = "SELECT cart_qty FROM cart WHERE prod_name = '" + prN + "'";
  
      Statement buycart = conn.createStatement();
      ResultSet buyResult = buycart.executeQuery(buy);
      if (buyResult.next()) {
         int nowQty = buyResult.getInt("cart_qty");
        
         if (nowQty >= prQ) {
            // 주문이 가능한 경우에만  주문 후 재고를 업데이트 하기
            int updatedQty = nowQty - prQ;
            String updateCart = "UPDATE cart SET cart_qty = " + updatedQty + " WHERE prod_name = '" + prN + "'";
            
            Statement udCart = conn.createStatement();
            udCart.executeUpdate(updateCart);
            
            
         } else {
           System.out.println("재고가 부족합니다. 재고 확인 후 다시 주문해주세요.");
         }
      } else {
       System.out.println("주문할 상품이 존재하지 않거나 잘못된 입력입니다.");
      }
   }
   
   private static void soldOut(Connection conn, String prN) throws SQLException {
      // 재고가 0인 상품 cart에서 내역 제거하기
      String deleteQuery = "DELETE FROM cart WHERE cart_qty = 0 AND prod_name = '" + prN + "'";
       Statement st = conn.createStatement();
       st.executeUpdate(deleteQuery);
       st.close();
   }

   private static void Menu(Connection conn) throws SQLException {
       Statement st = conn.createStatement();
       ResultSet rs = st.executeQuery("SELECT * FROM cart");
   
      System.out.println(" = = = = = = = = = = = 메뉴판 = = = = = = = = = = = ");
      System.out.println(" ");
      while (rs.next()) {
          String pn = rs.getString("prod_name");
          int pp = rs.getInt("cart_price");
          int roundpp = (int) Math.round(pp * 1.1); // 부가세 반올림하기
          int count = rs.getInt("cart_qty");
          System.out.printf(" [ 상품명: %s ] [ 가격: %s ] [ 개수: %d개 ]\n", pn, roundpp, count);
      }
      System.out.println(" ");
      System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = ");
   //       rs.close();
   //       st.close();
   }
   
   private static boolean emplCheck(Connection conn, String empNumber) throws SQLException {
      // 사원 확인
      String query = "SELECT COUNT(*) AS count FROM employee_mem WHERE mem_num = ?";
      PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setString(1, empNumber);
      ResultSet rs = pstmt.executeQuery();
      if (rs.next()) {
          int count = rs.getInt("count");
              return (count > 0) ? true : false;
       }
       return false;
   }
}
