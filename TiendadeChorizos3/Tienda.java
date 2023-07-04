import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int semanasEnMes = 4; // Número de semanas en un mes
        int totalSemanas = 0;
        int cantidadVentas = 0; // Cantidad total de ventas
        double totalVentas = 0;
        double venta;
        double promedioSemanal;
        double promedioTotal;

        System.out.println("Digite cuántas semanas desea calcular (máximo 4 semanas):");
        totalSemanas = scanner.nextInt();

        // Validar que el número de semanas sea válido
        while (totalSemanas > semanasEnMes || totalSemanas < 1) {
            if (totalSemanas > semanasEnMes) {
                System.out.println("El número de semanas ingresado excede el máximo de 4 semanas en un mes.");
            } else {
                System.out.println("El número de semanas ingresado es menor a 1.");
            }
            System.out.println("Por favor, ingrese un número válido de semanas:");
            totalSemanas = scanner.nextInt();
        }

        // Arreglo para almacenar la información de los clientes
        Cliente[] clientes = new Cliente[totalSemanas];

        for (int semana = 1; semana <= totalSemanas; semana++) {
            double sumaVentas = 0; // Suma de ventas para cada semana

            System.out.println("Semana " + semana);
            System.out.println("Digite cuántas ventas de chorizos hizo en esta semana:");
            int ventasSemana = scanner.nextInt();

            System.out.println("Ingrese los datos del cliente:");
            System.out.println("ID:");
            int id = scanner.nextInt();
            System.out.println("Nombre:");
            String nombre = scanner.next();
            System.out.println("Teléfono:");
            String telefono = scanner.next();
            System.out.println("Dirección:");
            String direccion = scanner.next();

            Cliente cliente = new Cliente(id, nombre, telefono, direccion); // Crear una instancia de Cliente

            for (int i = 1; i <= ventasSemana; i++) {
                System.out.println("Ingrese el valor de la venta:");
                venta = scanner.nextDouble();
                totalVentas += venta;
                sumaVentas += venta; // Agregar la venta a la suma total de la semana
                cantidadVentas++; // Incrementar la cantidad total de ventas
            }

            promedioSemanal = sumaVentas / ventasSemana;
            System.out.println("El promedio de ventas de la semana " + semana + " fue: " + promedioSemanal);

            clientes[semana - 1] = cliente; // Agregar el cliente al arreglo
        }

        if (totalSemanas == semanasEnMes) {
            promedioTotal = totalVentas / cantidadVentas;
            System.out.println("El promedio total del mes fue: " + promedioTotal);
        }
    }
}
