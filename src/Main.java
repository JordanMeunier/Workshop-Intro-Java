public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Welcome");
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}


// javac Main.java
// java Main