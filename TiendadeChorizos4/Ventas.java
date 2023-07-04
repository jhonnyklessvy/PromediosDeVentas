import java.util.Scanner;
public class Ventas {

    Scanner scanner = new Scanner(System.in);

    private int semanasEnMes = 4; // Número de semanas en un mes
    private int totalSemanas = 0;
    private Cliente[] clientes = null;
    private double[] ventasSemanales = null; // Arreglo para almacenar las ventas por semana

    public void registrarVentas(Scanner scanner) {
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

        clientes = new Cliente[totalSemanas + 1];
        ventasSemanales = new double[totalSemanas + 1]; // Inicializar el arreglo de ventas semanales

        for (int semana = 1; semana <= totalSemanas; semana++) {
            double totalVentas = 0; // Reiniciar el total de ventas

            double sumaVentas = 0; // Suma de ventas para cada semana

            System.out.println("Semana " + semana);
            System.out.println("Digite cuántas ventas de chorizos hizo en esta semana:");
            int ventasSemana = scanner.nextInt();

            for (int i = 1; i <= ventasSemana; i++) {
                System.out.println("Ingrese el valor de la venta:");
                double venta = scanner.nextDouble();
                totalVentas++;
                sumaVentas += venta; // Agregar la venta a la suma total de la semana
            }

            ventasSemanales[semana - 1] = sumaVentas; // Guardar la suma de ventas en el arreglo de ventas semanales
            ventasSemanales[totalSemanas] = totalVentas; // Guardar la suma total de las ventas en la última posición del arreglo

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
            cliente.setId(id);
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setDireccion(direccion);

            clientes[semana - 1] = cliente; // Agregar el cliente al arreglo
        }
    }

    public void calcularPromedio() {
        if (totalSemanas == 0) {
            System.out.println("Debe registrar las ventas por semana primero.");
        } else {
            double sumaTotalVentas = 0;
    
            System.out.println("----- PROMEDIO DE VENTAS -----");
            for (int semana = 1; semana <= totalSemanas; semana++) {
                double ventasSemana = ventasSemanales[semana - 1]; // Obtener las ventas de la semana desde el arreglo ventasSemanales
    
                System.out.println("Semana " + semana + ":");
                System.out.println("Ventas realizadas: " + ventasSemanales[semana]); // Corregir aquí
    
                double promedioSemana = ventasSemana / ventasSemanales[semana]; // Calcular el promedio de ventas de la semana
                System.out.println("El promedio de ventas fue: " + promedioSemana);
    
                sumaTotalVentas += ventasSemana; // Sumar las ventas de la semana a la suma total de ventas
            }
    
            if (totalSemanas == semanasEnMes) {
                double promedioTotal = sumaTotalVentas / totalSemanas;
                System.out.println("El promedio total del mes fue: " + promedioTotal);
            }
        }
    }
}
