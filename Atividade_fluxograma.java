package projetos_LPA.aula04;

import java.util.Scanner;

public class Atividade_fluxograma {

		public static void main(String[] args) {
			// variaveis
			double horatrab, valorhora, salbruto, salliquido, inss ;
			// instaciar classe Scanner
			Scanner ler = new Scanner(System.in);

			// entrada de dados
			System.out.println("Informe hora de trabalho: ");
			horatrab = ler.nextDouble();

			System.out.println("Informe valor por hora: ");
			valorhora = ler.nextDouble();

			// processamento
			salbruto = horatrab * valorhora ;
			inss = salbruto * 0.12 ; 
			salliquido = salbruto - inss ;
			// saida
			System.out.println("O valor do salario bruto é : " + salbruto);
			System.out.println("O valor do salario liquido é : " + salliquido);
		}
}
