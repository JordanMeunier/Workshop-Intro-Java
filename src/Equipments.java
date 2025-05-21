package src;

public class Equipments extends Item {
    private String type;

    public Equipments(String type, String name, int quantity) {
        super(name, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    //@Override
    //public String toString() {
    //    return "Item: " + getName() + " | " + "Quantity: " + getQuantity() + " | " + "Type: " + getType();
    //}
}
