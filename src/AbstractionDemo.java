public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstraction ===");

        Forme[] formes = {
            new Cercle(3),
            new Rectangle(4, 5)
        };

        for (Forme forme : formes) {
            System.out.println(forme.decrire());
        }
    }
}

abstract class Forme {
    public abstract double aire();

    public String decrire() {
        return getClass().getSimpleName() + " - aire = " + aire();
    }
}

class Cercle extends Forme {
    private final double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }
}

class Rectangle extends Forme {
    private final double longueur;
    private final double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double aire() {
        return longueur * largeur;
    }
}
