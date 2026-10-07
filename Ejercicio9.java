import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println("El número tiene tres cifras.");
        }
    }
}
