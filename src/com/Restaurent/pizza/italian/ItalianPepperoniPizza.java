package com.Restaurent.pizza.italian;

import com.Restaurent.pizza.IPizza;

public class ItalianPepperoniPizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("preparing italian pepperoni pizza ");

    }

    @Override
    public void bake() {
        System.out.println("bake italian pepperoni pizza ");

    }

    @Override
    public void box() {
        System.out.println("box italian pepperoni pizza ");

    }
}
