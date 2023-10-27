package com.Restaurent.factory;

import com.Restaurent.pizza.IPizza;
import com.Restaurent.pizza.italian.ItalianGarlicSteakPizza;
import com.Restaurent.pizza.italian.ItalianPepperoniPizza;

public class ItalianPizzaFactory implements IFactory{

    @Override
    public IPizza createPizza(String name) throws Exception {
        if ("pepperoni".equals(name)) {
            return new ItalianPepperoniPizza();
        } else if ("steak".equals(name)) {
            return new ItalianGarlicSteakPizza();
        }
        throw new Exception();
    }
}
