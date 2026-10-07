import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la temperatura: ");
        double temp = sc.nextDouble();

        if (temp > 35) {
            System.out.println("Temperatura extrema.");
        }
    }
}
