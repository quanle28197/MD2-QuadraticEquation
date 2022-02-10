import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double discrimiant = quadraticEquation.getDiscriminant();

        if ( a == 0) {
            System.out.println("This is not a quadatic equation because a = 0 ");
            return;
        }
        if (discrimiant  > 0) {
            System.out.println("Equation have two roots");
            System.out.println("Root1: " + quadraticEquation.getRoot1());
            System.out.println("Root2: " + quadraticEquation.getRoot2());
            return;
        }
        if ( discrimiant == 0) {
            System.out.println("Equation have one root");
            System.out.println(quadraticEquation.getRoot1());
            return;
        }
        System.out.println("Equation have no real roots");

    }
}
