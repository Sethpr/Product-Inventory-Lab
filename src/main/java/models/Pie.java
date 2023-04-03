package models;

public class Pie{
        int id;
        String flavor;
        float circumference;
        int qty;
        float price;

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

        public float getCircumference() {
                return circumference;
        }

        public void setCircumference(float circumference) {
                this.circumference = circumference;
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
}
