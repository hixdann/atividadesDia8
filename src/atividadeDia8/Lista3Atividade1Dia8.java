package atividadeDia8;

import java.util.Scanner;

public class Lista3Atividade1Dia8 {

	public static void main(String[] args) {

		int soma = 0, contador;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número inteiro: ");
			contador = leia.nextInt();
			if((contador !=0) && (contador > 0)) {
				
			soma += contador;		
			}
			
		}

		while (contador != 0);
		
		if(contador == 0) {
			
			System.out.println("A soma dos números positivos é: " + soma );
		}
		
		leia.close();

	}

}
