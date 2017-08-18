package com.basket;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;

public class BasketCalculatorSer{

    private static final MathContext MATHCONTEXT = new MathContext(2);
    private Basket basket;

    public BigDecimal calculateBasketPrice() {
        if( basket == null || basket.getItemlist().isEmpty() ) {
            throw new RuntimeException("Basket is empty");
        }
        else {
            HashMap<Item,Integer> itemList = basket.getItemlist();
            BigDecimal basketPrice =  itemList.keySet().stream()
                    .map(item -> item.getItemDetail().getPrice().multiply(new BigDecimal(itemList.get(item), MATHCONTEXT)))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            return basketPrice;
        }
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}