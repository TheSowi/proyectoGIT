import java.util.Scanner;

public class PedirOperacion{

		
	public static void main (String[]args) {

	Scanner teclado = new Scanner (System.in);

	int numero1, numero2, operacion, resultado;

	System.out.print("Introduce el primer numero : ");
	numero1 = teclado.nextInt();
	System.out.print("Introduce el segundo numero : ");
	numero2 = teclado.nextInt();

	System.out.println("\n¿Que operación quieres realizar?\n");
	System.out.println("Si es 1, los números se suman");
	System.out.println("Si es 2, los números se restan");
	System.out.println("Si es 3, los números se multiplican");
	System.out.println("Si es 4, los números se dividen");
	System.out.println("Calquier otra opción es incorrecta");
	operacion = teclado.nextInt();

	switch (operacion){
		case 1:resultado = numero1 + numero2;
			System.out.println("Si es 1, la suma es " + resultado);
		break;
		case 2:resultado = numero1 - numero2;
			System.out.println("Si es 2, la resta es " + resultado);
		break;
		case 3:resultado = numero1 * numero2;
			System.out.println("Si es 3, la multiplicación es " + resultado);
		break;
		case 4:resultado = numero1 / numero2;
			System.out.println("Si es 4, la división es " + resultado);
		break;
		default:System.out.println("ERROR");
}

	}
}
