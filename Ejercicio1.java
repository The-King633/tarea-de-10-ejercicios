import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        if (num >= 20 && num <= 50) {
            System.out.println("El número está dentro del rango.");
        }
    }
}
