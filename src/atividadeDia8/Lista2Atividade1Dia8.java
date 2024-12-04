package atividadeDia8;

import java.util.Scanner;

public class Lista2Atividade1Dia8 {

	public static void main(String[] args) {
		int idade, menores = 0, idade_mais = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
			
		while (idade > 0) {
			if((idade > 0) && (idade < 21)) {
				menores = menores + 1;
			}
			else if(idade > 50) {
				idade_mais = idade_mais + 1; 
			}
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
		}
		
		if(idade < 0){
			System.out.println("Total de pessoas menores de 21 anos: " + menores + "\nTotal de pessas maiores de 50 anos: " + idade_mais);
		}
		leia.close();

	}

}
