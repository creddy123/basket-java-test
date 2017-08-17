package com.basket;

import java.math.BigDecimal;

public enum ItemDetail {

    APPLE("Apple", new BigDecimal(1)), BANANA("Banana", new BigDecimal(2)),LEMON("Lemon",new BigDecimal(3)), PEACH("Peach",new BigDecimal(4)), ORANGE("Orange",new BigDecimal(5.0)) ;

        private String name;
        private BigDecimal price;



    ItemDetail(String itemName, BigDecimal price) {
        this.name = itemName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}