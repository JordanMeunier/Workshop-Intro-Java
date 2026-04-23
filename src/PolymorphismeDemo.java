public class PolymorphismeDemo {
    public static void main(String[] args) {
        System.out.println("=== Polymorphisme ===");

        AnimalPoly[] animaux = { new ChienPoly("Rex"), new ChatPoly("Mimi") };

        for (AnimalPoly animal : animaux) {
            animal.crier();
        }
    }
}

class AnimalPoly {
    protected final String nom;

    public AnimalPoly(String nom) {
        this.nom = nom;
    }

    public void crier() {
        System.out.println(nom + " fait un bruit.");
    }
}

class ChienPoly extends AnimalPoly {
    public ChienPoly(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println(nom + " dit: Wouf !");
    }
}

class ChatPoly extends AnimalPoly {
    public ChatPoly(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println(nom + " dit: Miaou !");
    }
}