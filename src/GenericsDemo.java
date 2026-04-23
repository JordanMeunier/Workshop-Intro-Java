public class GenericsDemo {
    public static void main(String[] args) {
        System.out.println("=== Généricité ===");

        Boite<String> boiteTexte = new Boite<>("Bonjour les étudiants");
        Boite<Integer> boiteNombre = new Boite<>(42);

        System.out.println("Boîte texte : " + boiteTexte.getContenu());
        System.out.println("Boîte nombre : " + boiteNombre.getContenu());
    }
}

class Boite<T> {
    private final T contenu;

    public Boite(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }
}