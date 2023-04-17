package models;

public class Cake {
    int id;
    String flavor;
    int tiers;
    int qty;
    float price;

    public Cake(int id, String flavor, int tiers, int qty, float price) {
        this.id = id;
        this.flavor = flavor;
        this.tiers = tiers;
        this.qty = qty;
        this.price = price;
    }

    public Cake(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "id=" + id +
                ", flavor='" + flavor + '\'' +
                ", tiers=" + tiers +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
