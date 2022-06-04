package day17_custom_class;

public class Item {

    public String name;
    public double unitPrice;
    private int quantity;


    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calCost(){

        return unitPrice*quantity;

    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total price=" + calCost()+
                '}';
    }
}
