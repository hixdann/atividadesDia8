package atividadeDia8;

import java.util.Scanner;

public class Lista1Atividade1Dia8 {

	public static void main(String[] args) {

		int num1, num2, contador;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();

		if (num1 < num2) {

			for (contador = num1; num1 < num2; num1 = num1 + 1) {
				if ((num1 % 3 == 0) && (num1 % 5 == 0)) {
					System.out.println(num1 + " é múltiplo de 3 e 5");
				}

				
			}
		}
		else {
			System.out.println("Intervalo inválido");
		}
		/*
		 * nome1 = leia.nextLine(); System.out.println("O " + contador + "° nome é: " +
		 * nome1);
		 */
	}

}
