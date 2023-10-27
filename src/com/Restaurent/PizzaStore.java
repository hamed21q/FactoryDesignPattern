package com.Restaurent;

import com.Restaurent.factory.IPizzaFactory;
import com.Restaurent.pizza.IPizza;

public class PizzaStore {

    private final IPizzaFactory factory;

    public PizzaStore(IPizzaFactory factory) {
        this.factory = factory;
    }

    public void OrderPizza(String pizzaName) throws Exception {
        IPizza pizza = this.factory.createPizza(pizzaName);

        pizza.prepare();
        pizza.bake();
        pizza.box();
    }
}
