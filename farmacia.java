import java.util.Scanner;
public class farmacia{
	public static void main(String[] args){
	System.out.println("ingrese el dia del mes: ");
	Scanner dia=new Scanner(System.in);//entrada de tipo numerico
	int numDia=dia.nextInt();//entrada de tipo numerico
	System.out.println("ingrese cantidad a pagar: ");//salida de caracteres
	Scanner valPagar=new Scanner(System.in);
	double valorNeto=valPagar.nextDouble();//decimales con , ; entrada de tipo numerico
	System.out.println("ingrese metodo de pago: ");//salida de caracteres
	Scanner metodoIn=new Scanner(System.in);
	String metodoPago=metodoIn.next();//entrada de caracteres
	String lower=metodoPago.toLowerCase();
	if (lower.equals("contado")){
		double descuento=valorNeto*0.05;
		double valorTotal=valorNeto-descuento;
		System.out.println("su descuento es de: "+descuento);//salida de datos procesados
		System.out.println("su total a pagar es: "+valorTotal);//salidos de datos procesados
	}
	else{
	double recargo=valorNeto*0.03;
	double valorTotal=valorNeto+recargo;
	System.out.println("su recargo es de: "+recargo);//salida de datos procesados
	System.out.println("su total a pagar es: "+valorTotal);//salidas de datos procesados
	}
	if (numDia==6||numDia==9||numDia==24){
		if(numDia==6){
			System.out.println("ingrese ultimo digito de su cedula: ");//salida de caracteres
			Scanner numCedula=new Scanner(System.in);
			int cedula=numCedula.nextInt();//entrada numerica
			if(cedula%2==0){
				System.out.println("ha ganado una botella de te de durazno");//salida de resultado
			}
			else{
				System.out.println("ganaste una cocacola de 750ml");//salida de resultado
			}
		}
		else{
			
		}
		if(numDia==9){
				System.out.println("ganaste un 9% de descuento en tu proxima compra");
			}
			else{
				
			}
		if(numDia==24){
				System.out.println("ingrese ultimo digito de su cedula: ");//salida de caracteres
			Scanner numCedula=new Scanner(System.in);
			int cedula=numCedula.nextInt();//entrada numerica
			if(cedula%2==0){
				System.out.println("gano un gel antibacterial");
				
			}
			else{
				System.out.println("gano un sobre de dolex");
			}
			}
			}
		
		}
	
	}
