# Ejercicio Base:
En tu labor como programador de software, has sido elegido para el desarrollo de una aplicación que se necesita para calcular el promedio de ventas de chorizos en una semana y el promedio total en un mes para un puesto de venta en un mercado. El objetivo es que el vendedor pueda tener un seguimiento de sus ventas y obtener información sobre el rendimiento de su negocio.

La aplicación requerirá que el vendedor registre las ventas de chorizos realizadas en cada semana y calcule el promedio de ventas para esa semana en particular. Además, se calculará el promedio total de ventas de chorizos en el mes.
## Aclaraciones:
- La aplicación se enfoca en calcular el promedio de ventas de chorizos en una semana específica y el promedio total en un mes.
- No es necesario implementar un sistema de almacenamiento persistente para los datos.
- No se requiere validación ni verificación de la calidad de los datos ingresados.

# Caso de uso

![UseCaseDiagram1](https://github.com/jhonnyklessvy/PromediosDeVentas/assets/89560229/44bab350-1b67-4897-9cd8-e604ec2380e0)

# Diagrama de flujo

![PromediodeVentasChorizos ddf](https://github.com/jhonnyklessvy/PromediosDeVentas/assets/89560229/cb4cfca5-be0b-492e-a70b-93690874b7d6)

# Historia de usuario

![TC boad1](https://github.com/jhonnyklessvy/PromediosDeVentas/assets/89560229/18c6b67f-53de-47bd-ba56-16827501f5e2)
![TC board2](https://github.com/jhonnyklessvy/PromediosDeVentas/assets/89560229/d065258f-0786-473a-9fb4-ce47653b65a8)

# Seudocodigo

    Algoritmo PromediodeVentasChorizos
    	 Definir sumaVentas,semanasEnMes,totalSemanas,totalVentas,venta,promedioSemanal,promedioTotal Como Real
    	 Escribir 'Digite cuántas semanas desea calcular (máximo 4 semanas):'
    	 Leer totalSemanas
    	 Mientras totalSemanas>4 O totalSemanas<1 Hacer
    		 Si totalSemanas>4 Entonces
    			 Escribir 'El número de semanas ingresado excede el máximo de 4 semanas en un mes.'
    		 SiNo
    			 Escribir 'El número de semanas ingresado es menor a 1.'
    		 FinSi
    		 Escribir 'Por favor, ingrese un número válido de semanas:'
    		 Leer totalSemanas
    	 FinMientras
    	 totalVentas <- 0
    	 Para semana<-1 Hasta totalSemanas Hacer
    		 sumaVentas <- 0
    		 Escribir 'Semana ',semana
    		 Escribir 'Digite cuántas ventas de chorizos hizo en esta semana:'
    		 Leer ventasSemana
    		 Para i<-1 Hasta ventasSemana Hacer
    			 Escribir 'Ingrese el valor de la venta:'
    			 Leer venta
    			 totalVentas <- totalVentas+venta
    			 sumaVentas <- sumaVentas+venta
    		 FinPara
    		 promedioSemanal <- sumaVentas/ventasSemana
    		 Escribir 'El promedio de ventas de la semana ',semana,' fue: ',promedioSemanal
    	 FinPara
    	 Si totalSemanas=4 Entonces
    		 promedioTotal <- totalVentas/(totalSemanas*4)
    		 Escribir 'El promedio total del mes fue: ',promedioTotal
    	 FinSi
    FinAlgoritmo
