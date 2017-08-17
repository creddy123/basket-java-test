package com.basket;


import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class BasketPriceCalculator {

    private static final MathContext MATH_CONTEXT = new MathContext(2);


    public static void main(String[] args) {
        Basket basket = new Basket();
        BasketCalculatorSer calc = new BasketCalculatorSer();
        basket.addItem(new Item(ItemDetail.APPLE));
        basket.addItem(new Item(ItemDetail.BANANA));
        basket.addItem(new Item(ItemDetail.PEACH));
        System.out.println("Total Price:" + calc.calculateBasketPrice(basket));
    }


}

