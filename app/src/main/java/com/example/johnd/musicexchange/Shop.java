package com.example.johnd.musicexchange;

import java.util.ArrayList;

/**
 * Created by JohnD on 03/11/2017.
 */

public class Shop {


    private  ArrayList<Sellable> inventory;
    private String shopName;

    Shop(String ShopName, ArrayList inventory){
        this.inventory = inventory;
        this.shopName = ShopName;
        }

        public String getShopName(){
        return this.shopName;
        }

    public ArrayList<Sellable> getInventory() {
        return inventory;
    }

    public void addToArrayList(Sellable sellable){
          inventory.add(sellable);
    }
}
