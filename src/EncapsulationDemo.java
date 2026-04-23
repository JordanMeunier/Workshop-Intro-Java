public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("=== Encapsulation ===");

        CompteBancaire compte = new CompteBancaire("Alice", 100);
        compte.deposer(50);
        compte.retirer(30);

        System.out.println(compte);
    }
}

class CompteBancaire {
    private final String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        }
    }

    @Override
    public String toString() {
        return "Titulaire: " + titulaire + ", solde: " + solde + " €";
    }
}