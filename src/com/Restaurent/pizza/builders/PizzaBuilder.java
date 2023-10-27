package com.Restaurent.pizza.builders;

import com.Restaurent.enums.Crust;
import com.Restaurent.enums.Sauce;
import com.Restaurent.enums.Size;
import com.Restaurent.enums.Topping;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    public Crust crust = Crust.THIN;
    public Sauce sauce = Sauce.ALFREDO;
    public Size size = Size.BIG;
    public List<Topping> toppings = new ArrayList<Topping>();

    public PizzaBuilder SetCrust(Crust crust){
        this.crust = crust;
        return this;
    }

    public PizzaBuilder SetSauce(Sauce sauce){
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder SetSize(Size size){
        this.size = size;
        return this;
    }

    public PizzaBuilder AddTopping(Topping topping){
        this.toppings.add(topping);
        return this;
    }

    public void Reset(){
        this.crust = Crust.THIN;
        this.sauce = Sauce.ALFREDO;
        this.size = Size.BIG;
        this.toppings = new ArrayList<Topping>();
    }

    public Pizza Build(){
        return new Pizza(this);
    }
}
