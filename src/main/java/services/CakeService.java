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

    public boolean delete(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getId() == id){
                inventory.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cake find(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getId() == id){
                return inventory.get(i);
            }
        }
        return null;
    }

    public Cake[] findAll() {
        return inventory.toArray(new Cake[0]);
    }

    @Override
    public String toString() {
        return "CakeService{" +
                "inventory=" + inventory.toString() +
                '}';
    }
}
