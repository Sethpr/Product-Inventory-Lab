package services;


import models.Pie;

import java.util.ArrayList;

public class PieService {
    private static int nextId = 1;

    private ArrayList<Pie> inventory = new ArrayList<>();


    public Pie create(String flavor, float circ, int qty, float price) {
        Pie newPie = new Pie(nextId++, flavor, circ, qty, price);

        inventory.add(newPie);

        return newPie;
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

    public Pie find(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getId() == id){
                return inventory.get(i);
            }
        }
        return null;
    }

    public Pie[] findAll() {
        return inventory.toArray(new Pie[0]);
    }
}
