package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		Consumidor consumidor = new Consumidor (nome);
		
		System.out.print("Informe o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);
		
		int total = consumidor.getFiado();
		
		System.out.print("Informe o valor do telefone do cliente: ");
		String telefone = scanner.nextLine();
		
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.getNome() + " gastou " + total + " reais e ganhou brinde! Ligar para avisar no telefone" + consumidor.getTelefone() + ".");
		} else {
			System.out.println("Cliente " + consumidor.getNome() + " gastou " + total + " reais.");
		}
		
		
	}
	
//	public static int somaWhile(int[] fiados) {
//		
//		int i = 0;
//		int total = 0;
//		while (i < fiados.length) {
//			total += fiados[i];
//			i++; //i += 1 ou i = i + 1
//		}
//		return total;
//	}
//	
//	public static int somaFor (int[] fiados) {
//		int total = 0;
//		for (int i = 0; i < fiados.length; i++) {
//			total += fiados[i];			
//		}
//		return total;
//	}
//	
//	public static int somaForache (int[] fiados) {
//		int total = 0;
//		for (int fiado : fiados) {
//			total += fiado;
//		}
//		return total;
//	}

}
