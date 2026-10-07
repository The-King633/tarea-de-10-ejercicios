import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        int nota = sc.nextInt();

        if (nota >= 17) {
            System.out.println("Alumno destacado.");
        }
    }
}
