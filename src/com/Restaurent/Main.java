package com.Restaurent;

import com.Restaurent.factory.AmericanPizzaFactory;
import com.Restaurent.factory.IPizzaFactory;
import com.Restaurent.factory.ItalianPizzaFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        IPizzaFactory italianFactory = new ItalianPizzaFactory();
        IPizzaFactory americanFactory = new AmericanPizzaFactory();


        PizzaStore americanStore = new PizzaStore(americanFactory);
        PizzaStore italianStore = new PizzaStore(italianFactory);

        americanStore.OrderPizza("pepperoni");

        italianStore.OrderPizza("steak");

        italianStore.OrderPizza("pepperoni");

    }
}
