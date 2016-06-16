package com.pei.headfirst.designpatterns.iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
        waitress.printMenu();
    }
}
