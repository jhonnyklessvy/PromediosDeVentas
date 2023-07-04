import java.util.Scanner;

public class Ventas {

    Scanner scanner = new Scanner(System.in);

    private int semanasEnMes = 4; // Número de semanas en un mes
    private int totalSemanas = 0;
    private ClienteVip[] clientes1 = null;
    private ClientePremium[] clientes2 = null;
    private ClienteRegular[] clientes3 = null;
    private double[] ventasSemanales = null; // Arreglo para almacenar las ventas por semana

    public void RegistrarClientePremium(Scanner scanner){
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
        
        clientes2 = new ClientePremium[totalSemanas + 1];
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
            
            ClientePremium cliente2 = new ClientePremium(id, nombre, telefono, direccion);
            cliente2.setId(id);
            cliente2.setNombre(nombre);
            cliente2.setTelefono(telefono);
            cliente2.setDireccion(direccion);

            clientes2[semana] = cliente2; // Agregar el cliente Premium al arreglo clientes2
    }
}

public void RegistrarClienteVip(Scanner scanner){
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
        
        clientes1 = new ClienteVip[totalSemanas + 1];
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
            
            ClienteVip cliente1 = new ClienteVip(id, nombre, telefono, direccion); // Crear una instancia de Cliente
            cliente1.setId(id);
            cliente1.setNombre(nombre);
            cliente1.setTelefono(telefono);
            cliente1.setDireccion(direccion);

            clientes1[semana] = cliente1; // Agregar el cliente VIP al arreglo clientes1
    }
}
    
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

        clientes3 = new ClienteRegular[totalSemanas + 1];
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

            ClienteRegular cliente3 = new ClienteRegular(id, nombre, telefono, direccion); // C
            cliente3.setId(id);
            cliente3.setNombre(nombre);
            cliente3.setTelefono(telefono);
            cliente3.setDireccion(direccion);

            clientes3[semana] = cliente3; // Agregar el cliente Regular al arreglo clientes3
        }
    }

    public void calcularPromedio() {
        if (totalSemanas == 0) {
            System.out.println("Debe registrar las ventas por semana primero.");
        } else {
            System.out.println("----- PROMEDIO DE VENTAS -----");
            for (int semana = 1; semana <= totalSemanas; semana++) {
                double sumaVentasSemana = ventasSemanales[semana - 1]; // Obtener la suma de ventas de la semana desde el arreglo ventasSemanales
                double totalVentas = ventasSemanales[totalSemanas]; // Obtener la suma total de las ventas
    
                System.out.println("Semana " + semana + ":");
                System.out.println("Ventas realizadas: " + totalVentas);
                System.out.println("Pago total de ventas en la semana: " + sumaVentasSemana);
    
                double promedioSemanal = sumaVentasSemana / totalVentas;
                System.out.println("El promedio de ventas de la semana " + semana + " fue: " + promedioSemanal);
            }
    
            if (totalSemanas == semanasEnMes) {
                double sumaTotalVentas = 0;
                for (int i = 0; i < totalSemanas; i++) {
                    sumaTotalVentas += ventasSemanales[i];
                }
                double totalVentasMes = ventasSemanales[totalSemanas]; // Obtener la suma total de las ventas del mes
    
                double promedioTotal = sumaTotalVentas / totalVentasMes; // Calcular el promedio total dividiendo la suma total de ventas entre el total de ventas del mes
                System.out.println("El promedio total del mes fue: " + promedioTotal);
    
                System.out.println("Total de ventas en el mes: " + totalVentasMes);
            }
        }
    }
}