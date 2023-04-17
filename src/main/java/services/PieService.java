package services;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import models.Pie;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PieService implements Serializable {
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

    public void writer(){
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("src/main/resources/pie.json"), inventory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void reader(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.inventory = (ArrayList<Pie>) objectMapper.readValue(new File("src/main/resources/pie.json"), new TypeReference<List<Pie>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "PieService{" +
                "inventory=" + inventory.toString() +
                '}';
    }
}
