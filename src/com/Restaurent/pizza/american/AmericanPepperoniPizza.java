package com.Restaurent.pizza.american;

import com.Restaurent.pizza.IPizza;

public class AmericanPepperoniPizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("preparing american pepperoni pizza ");

    }

    @Override
    public void bake() {
        System.out.println("bake american pepperoni pizza ");

    }

    @Override
    public void box() {
        System.out.println("box american pepperoni pizza ");

    }
}
