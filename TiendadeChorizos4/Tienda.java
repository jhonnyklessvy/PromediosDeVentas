import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ventas ventas = new Ventas();

        int opcion = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Registrar ventas por semana");
            System.out.println("2. Calcular promedio de ventas");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opción:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ventas.registrarVentas(scanner);
                    break;
                case 2:
                    ventas.calcularPromedio();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese un número válido.");
                    break;
            }
        }
    }
}