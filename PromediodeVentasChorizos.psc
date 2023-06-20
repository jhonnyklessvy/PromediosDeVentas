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
