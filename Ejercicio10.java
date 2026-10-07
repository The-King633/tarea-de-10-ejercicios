import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota de Matemática: ");
        int mat = sc.nextInt();
        System.out.print("Ingrese la nota de Comunicación: ");
        int com = sc.nextInt();

        if (mat >= 11 && com >= 11) {
            System.out.println("Postulante apto.");
        }
    }
}
