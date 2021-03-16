/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventory;

/**
 *
 * @author Andrew
 */
public class Item {
    private String name;
    private int barcode;
    private int qty;
    private float price;
    
    
    public Item(int barcode, String name, float price, int qty){
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    
     public Item(){
        
    }
    
     
     //SETTER
     public void setName(String itemName){
         this.name = itemName;
     }
     public void setPrice(float itemPrice){
         this.price = itemPrice;
     }
     public void setQty(int itemQty){
         this.qty = itemQty;
     }
     public void setBarcode(int itemBarcode){
         this.barcode = itemBarcode;
     }
     
     //GETTER
     public String getName(){
         return this.name;
     }
     public float getPrice(){
         return this.price;
     }
     public int getQty(){
         return this.qty;
     }
      public int getBarcode(int itemBarcode){
         return this.barcode;
     }
     
}
