package AVSomativa;

public class Desafio4 {

	//Modificador de acesso alterado: era "public", modifiquei para "private"
	private String nome; 
	private int idade;
	
	//Construtor
	public Desafio4(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	} 
}
