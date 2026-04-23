public class HeritageDemo {
    public static void main(String[] args) {
        System.out.println("=== Héritage ===");

        AnimalHeritage chien = new ChienHeritage("Rex");
        AnimalHeritage chat = new ChatHeritage("Mimi");

        System.out.println(chien.sePresenter());
        System.out.println(chat.sePresenter());
    }
}

class AnimalHeritage {
    protected final String nom;

    public AnimalHeritage(String nom) {
        this.nom = nom;
    }

    public String sePresenter() {
        return "Je suis un animal nommé " + nom;
    }

    public void crier() {
        System.out.println(nom + " fait un bruit.");
    }
}

class ChienHeritage extends AnimalHeritage {
    public ChienHeritage(String nom) {
        super(nom);
    }
}

class ChatHeritage extends AnimalHeritage {
    public ChatHeritage(String nom) {
        super(nom);
    }
}