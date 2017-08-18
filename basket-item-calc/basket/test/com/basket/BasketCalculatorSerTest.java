package com.basket;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BasketCalculatorSerTest {

    BasketCalculatorSer basketCalculatorSer = new BasketCalculatorSer();

    @Test(expected = RuntimeException.class)
    public void testEmptyBasket() {
        Basket basket = new Basket();
        basketCalculatorSer.setBasket(basket);
        basketCalculatorSer.calculateBasketPrice();
    }

    @Test
    public void testSingleItemOfEachFruitInBasket() {
        Basket basket = new Basket();
        basket.addItem(new Item(ItemDetail.APPLE));
        basket.addItem(new Item(ItemDetail.BANANA));
        basket.addItem(new Item(ItemDetail.PEACH));
        basket.addItem(new Item(ItemDetail.LEMON));
        basket.addItem(new Item(ItemDetail.ORANGE));
        basketCalculatorSer.setBasket(basket);
        assertEquals(new BigDecimal(15),basketCalculatorSer.calculateBasketPrice());
    }

    @Test
    public void testSingleItemInBasket() {

        Basket basket = new Basket();
        basket.addItem(new Item(ItemDetail.APPLE));
        basketCalculatorSer.setBasket(basket);
        assertEquals(new BigDecimal(1),basketCalculatorSer.calculateBasketPrice());

    }

    @Test
    public void testMultipleItemsOfFruitsInBasket() {
        Basket basket = new Basket();
        basket.addItem(new Item(ItemDetail.APPLE));
        basket.addItem(new Item(ItemDetail.APPLE));
        basket.addItem(new Item(ItemDetail.BANANA));
        basket.addItem(new Item(ItemDetail.BANANA));
        basket.addItem(new Item(ItemDetail.PEACH));
        basket.addItem(new Item(ItemDetail.PEACH));
        basket.addItem(new Item(ItemDetail.PEACH));
        basket.addItem(new Item(ItemDetail.PEACH));
        basket.addItem(new Item(ItemDetail.LEMON));
        basket.addItem(new Item(ItemDetail.LEMON));
        basket.addItem(new Item(ItemDetail.ORANGE));
        basket.addItem(new Item(ItemDetail.ORANGE));
        basket.addItem(new Item(ItemDetail.ORANGE));
        basket.addItem(new Item(ItemDetail.ORANGE));
        basket.addItem(new Item(ItemDetail.ORANGE));
        basketCalculatorSer.setBasket(basket);
        assertEquals(new BigDecimal(53),basketCalculatorSer.calculateBasketPrice());
    }

}