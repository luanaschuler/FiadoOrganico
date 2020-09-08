package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Consumidor consumidor = new Consumidor();
		consumidor.fiados = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		consumidor.nome = scanner.nextLine();
		System.out.print("Informe o valor da compra: ");
		consumidor.fiados [0] = Integer.valueOf(scanner.nextLine());
		
		int total = somaFor(consumidor.fiados);
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.nome + " gastou " + total + " reais e ganhou brinde");
		} else {
			System.out.println("Cliente " + consumidor.nome + " gastou " + total + " reais.");
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
