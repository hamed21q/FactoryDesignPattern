package com.Restaurent.factory;

import com.Restaurent.pizza.IPizza;

public interface IFactory {
    public IPizza createPizza(String name) throws Exception;
}
