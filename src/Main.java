// But -> Découvrir syntaxe de base de Java
//
// Rapide overview de 4 grands principes de la POO Java
//
// Encapsulation, Héritage, Abstraction, Polymorphisme

package src;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item1 = new Item("Villa", 10);
        Item item2 = new Item("Apple", 25);

        // Equipments equipments = new Equipments("Claymore", "Sword", 1);

        // Car car = new Car("Porsche", "GT3RS", "Car", 5);

        inventory.addItem(item1);
        inventory.addItem(item2);
        // inventory.addItem(equipments);
        // inventory.addItem(car);

        inventory.displayInventory();
    }
}
