package com.Restaurent.factory;

import com.Restaurent.pizza.IPizza;
import com.Restaurent.pizza.american.AmericanGarlicSteakPizza;
import com.Restaurent.pizza.american.AmericanPepperoniPizza;

public class AmericanPizzaFactory implements IPizzaFactory {

    @Override
    public IPizza createPizza(String name) throws Exception {
        if ("pepperoni".equals(name)) {
            return new AmericanPepperoniPizza();
        } else if ("steak".equals(name)) {
            return new AmericanGarlicSteakPizza();
        }
        throw new Exception();
    }
}
