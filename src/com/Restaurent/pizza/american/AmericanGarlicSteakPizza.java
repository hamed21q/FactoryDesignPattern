package com.Restaurent.pizza.american;

import com.Restaurent.pizza.IPizza;

public class AmericanGarlicSteakPizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("preparing american steak pizza ");
    }

    @Override
    public void bake() {
        System.out.println("baking american steak pizza ");

    }

    @Override
    public void box() {
        System.out.println("boxing american steak pizza ");

    }
}
