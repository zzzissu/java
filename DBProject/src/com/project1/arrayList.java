package com.project1;
public class arrayList {
    private String sell_name;   // 상품 이름
    private int sell_qty;      // 수량
    private int sell_price;      // 가격
      
      arrayList(String sell_name, int sell_qty, int sell_price) {
         this.sell_name = sell_name;
         this.sell_qty = sell_qty;
         this.sell_price = sell_price;
      }

      public arrayList() {
      }

      public String getSell_name() {
         return sell_name;
      }

      public void setSell_name(String sell_name) {
         this.sell_name = sell_name;
      }

      public int getSell_qty() {
         return sell_qty;
      }

      public void setSell_qty(int sell_qty) {
         this.sell_qty = sell_qty;
      }

      public int getSell_price() {
		return sell_price;
      }

      public void setSell_price(int sell_price) {
		this.sell_price = sell_price;
      }
      
}
