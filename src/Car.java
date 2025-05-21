package src;

public class Car extends Item {
    private String marque;
    private String model;

    public Car(String marque, String model, String name, int quantity) {
        super(name, quantity);
        this.marque = marque;
        this.model = model;
    }

    public String getMarque() {
        return marque;
    }

    public String getModel() {
        return model;
    }

    //@Override
    //public String toString() {
    //    return "Item: " + getName() + " | " + "Quantity: " + getQuantity() + " | " + "Marque: " + getMarque() + " | " + "Model: " + getModel();
    //}
}
