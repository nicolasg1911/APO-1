Algoritmo farmacia
	Repetir
		Escribir 'ingrese dia del mes'
		Leer dia // entrada de tipo numerico
	Hasta Que 1<=dia Y dia<=31
	Escribir 'ingrese valor de compra'
	Leer valorNeto // entrada de tipo numerico
	Escribir 'ingrese metodo de pago'
	Leer metodoPago // entrada de characteres
	Si metodoPago='contado' Entonces
		valorTotal <- valorNeto-(valorNeto*0.05)
		Escribir 'su descuento es: ',valorNeto*0.05
		Escribir 'el total a pagar es: ',valorTotal
	SiNo
		valorTotal <- valorNeto+(valorNeto*0.03)
		Escribir 'su costo adicional es: ',valorNeto*0.03
		Escribir 'el total a pagar es: ',valorTotal
	FinSi
	Si dia=6 O dia=9 O dia=24 Entonces
		Si dia=6 Entonces
			Repetir
				Escribir 'ingrese ultimo digito de su cedula:'
				Leer cedula
			Hasta Que cedula<10 Y 0<cedula
			Si cedula MOD 2=0 Entonces
				Escribir 'gano un gel antibacterial'
			SiNo
				Escribir 'gano un sobre de dolex'
			FinSi
		SiNo
			Si dia=9 Entonces
				Repetir
					Escribir 'ingrese ultimo digito de su cedula: '
					Leer cedula
				Hasta Que cedula<10 Y cedula>0
				Escribir 'gano un descuento del 9% en su proxima compra'
			SiNo
				Repetir
					Escribir 'ingrese ultimo digito de su cedula: '
					Leer cedula
				Hasta Que cedula>0 Y cedula<10
				Si cedula MOD 2=0 Entonces
					Escribir 'gano una botella de te de durazno'
				SiNo
					Escribir 'gano una cocacola de 750ml'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
