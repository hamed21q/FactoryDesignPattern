package com.Restaurent.factory;

import com.Restaurent.pizza.IPizza;

public interface IPizzaFactory {
    public IPizza createPizza(String name) throws Exception;
}
