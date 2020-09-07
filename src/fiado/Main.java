package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//conjunto finito(no caso 10) e ordenado (zero a 9 posições)
		int[] fiados = new int[10];
//		fiados [0] = 12;
//		fiados [3] = 87;
		//command+I para corrigir indentação
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.print("Informe o valor da compra: ");
		fiados [0] = Integer.valueOf(scanner.nextLine());
		
		//criar variavel do total, recebendo o retorno do metodo criado
		int total = somaFor(fiados);
		
		//condicionais
		
		while (total < 0) {
			System.out.println("Valor negativo encontrado. Repita a operação.");
			System.out.print("Informe o valor da compra: ");
			fiados [0]= Integer.valueOf(scanner.nextLine());
		}
		if (total > 100) {
			System.out.println("Cliente " + nome + " gastou " + total + " reais e ganhou brinde");
		} else {
			System.out.println("Cliente " + nome + " gastou " + total + " reais.");
		}
		
		
	}
	
	public static int somaWhile(int[] fiados) {
		
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++; //i += 1 ou i = i + 1
		}
		return total;
	}
	
	public static int somaFor (int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];			
		}
		return total;
	}
	
	public static int somaForache (int[] fiados) {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}

}