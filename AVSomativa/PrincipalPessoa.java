package AVSomativa;

public class PrincipalPessoa {

	public static void main(String[] args) {
		Fisica fisica = new Fisica("Giovana", "53335579852", "280372248-8");
		System.out.println("Nome: " + fisica.getNome());
		System.out.println("CPF: " + fisica.getCpf());
		System.out.println("RG: " + fisica.getRg());
	}
}
