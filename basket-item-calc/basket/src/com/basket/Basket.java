package com.basket;

import java.util.HashMap;
public class Basket {


    private HashMap<Item,Integer> itemlist = new HashMap<>();

    public void addItem(Item item){
        if(item == null){
            throw new IllegalArgumentException("Invalid input");
        }
        if(item.getItemDetail().getName() == null) {
            throw new IllegalArgumentException("Invalid Item Name");
        }
        if (itemlist.containsKey(item)) {
            itemlist.replace(item, itemlist.get(item) + 1);
        } else {
            itemlist.put(item,1);
        }
    }



    public HashMap<Item, Integer> getItemlist() {
        return itemlist;
    }

    public void setItemlist(HashMap<Item, Integer> itemlist) {
        this.itemlist = itemlist;
    }
}
