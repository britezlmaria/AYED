package tp1.ejercicio2;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para obtener los primeros múltiplos: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] multiplos = obtenerMultiplos(n);

        System.out.print("Los primeros " + n + " múltiplos de " + n + " son: ");
        for (int i = 0; i < multiplos.length; i++) {
            System.out.print(multiplos[i]);
            if (i < multiplos.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int[] obtenerMultiplos(int n) {
        int[] multiplos = new int[n];
        for (int i = 0; i < n; i++) {
            multiplos[i] = (i + 1) * n;
        }
        return multiplos;
    }
}
