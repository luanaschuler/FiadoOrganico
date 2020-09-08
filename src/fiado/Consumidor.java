package fiado;

public class Consumidor {
	
	//declarei atributos 
	//PACKAGE
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private String telefone;
	
	//construtor
	public Consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int [10];
		this.telefone = telefone;
	}
	
	//GETTER and SETTER
	public String getNome( ) {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
		}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	}

