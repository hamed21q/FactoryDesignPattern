package com.Restaurent;

import com.Restaurent.factory.AmericanPizzaFactory;
import com.Restaurent.factory.IFactory;
import com.Restaurent.factory.ItalianPizzaFactory;
import com.Restaurent.pizza.IPizza;
import com.Restaurent.pizza.italian.ItalianPepperoniPizza;

public class Main {

    public static void main(String[] args) throws Exception {
        IFactory italianFactory = new ItalianPizzaFactory();
        IFactory americanFactory = new AmericanPizzaFactory();


        PizzaStore americanStore = new PizzaStore(americanFactory);
        PizzaStore italianStore = new PizzaStore(italianFactory);

        americanStore.OrderPizza("pepperoni");

        italianStore.OrderPizza("steak");

        italianStore.OrderPizza("pepperoni");

    }
}
