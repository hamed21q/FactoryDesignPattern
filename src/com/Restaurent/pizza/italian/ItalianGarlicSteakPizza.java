package com.Restaurent.pizza.italian;

import com.Restaurent.pizza.IPizza;

public class ItalianGarlicSteakPizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("preparing italian steak pizza ");

    }

    @Override
    public void bake() {
        System.out.println("bake italian steak pizza ");

    }

    @Override
    public void box() {
        System.out.println("box italian steak pizza ");

    }
}
