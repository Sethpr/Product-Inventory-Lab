package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import models.Cake;
import models.Pie;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CakeService implements Serializable {
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

    public void writer(){
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("src/main/resources/cake.json"), inventory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void reader(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.inventory = (ArrayList<Cake>) objectMapper.readValue(new File("src/main/resources/cake.json"), new TypeReference<List<Cake>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "CakeService{" +
                "inventory=" + inventory.toString() +
                '}';
    }
}
