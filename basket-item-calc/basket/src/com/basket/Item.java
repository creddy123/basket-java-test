package com.basket;

public class Item {

    private ItemDetail itemDetail;


    public ItemDetail getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(ItemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }

    public Item(ItemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }
}