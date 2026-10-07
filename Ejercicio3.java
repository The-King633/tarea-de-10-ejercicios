import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto de la compra: ");
        double monto = sc.nextDouble();

        if (monto >= 300) {
            System.out.println("Aplica descuento del 10%.");
        }
    }
}
