package com.Restaurent.pizza.builders;

import com.Restaurent.enums.Crust;
import com.Restaurent.enums.Sauce;
import com.Restaurent.enums.Size;
import com.Restaurent.enums.Topping;

import java.util.List;

public class Pizza{
    protected Size size;
    protected Crust crust;
    protected Sauce sauce;
    protected List<Topping> toppings;

    public void PrintDetail(){
        System.out.println("Size: " + this.size);
        System.out.println("Crust: " + this.crust);
        System.out.println("Sauce: " + this.sauce);
        for (Topping t: this.toppings) {
            System.out.println("Topping: " + t);
        }
    }

    public Pizza(PizzaBuilder builder){
        this.toppings = builder.toppings;
        this.sauce = builder.sauce;
        this.crust = builder.crust;
        this.size = builder.size;
    }
}
