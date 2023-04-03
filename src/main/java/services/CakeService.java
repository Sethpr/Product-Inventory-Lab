package services;

import models.Cake;

import java.util.ArrayList;

public class CakeService {
    private static int nextId = 1;

    private ArrayList<Cake> inventory = new ArrayList<>();


    public Cake create(String flavor, int tiers, int qty, float price) {
        Cake newCake = new Cake(nextId++, flavor, tiers, qty, price);

        inventory.add(newCake);

        return newCake;
    }
}
