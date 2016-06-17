package com.pei.headfirst.designpatterns.iterator;

import java.util.*;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public Iterator createIterator() {
        return menuItems.iterator();
    }

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&M`s Pancake Breakfast", "Pancake with scrambled aggs and toast", 2.99, true);
        addItem("Regular Pancake Breakfast", "Pancake with fried aggs, sausage", 2.99, false);
        addItem("Blueberry Pancakes", "Pancake made with fresh blueberries", 3.49, true);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", 3.59, true);

    }

    public void addItem(String name, String description, double price, boolean vegetarian) {
        menuItems.add(new MenuItem(description, name, vegetarian, price));
    }
}
