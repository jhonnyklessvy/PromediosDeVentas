import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ventas ventas = new Ventas();

        int opcion = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Registrar Cliente Vip.");
            System.out.println("2. Registrar Cliente Premium.");
            System.out.println("3. Registrar Cliente Regular.");
            System.out.println("4. Calcular promedio de ventas");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ventas.RegistrarClienteVip(scanner);   
                    break;
                case 2:
                    ventas.RegistrarClientePremium(scanner);
                    break;
                case 3:
                    ventas.registrarVentas(scanner);
                    break;
                case 4:
                    ventas.calcularPromedio();
                    break;
                case 5:
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