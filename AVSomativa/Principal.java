package AVSomativa;

public class Principal  {

	//Criando uma Pessoa

	public static void main(String[] args) {


		Usuario usuario = new Usuario(1, "Giovana", 12345, "aceito", "estudante");
		System.out.println("Pessoa: "+ usuario.getId());
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("Password: " + usuario.getPassword());
		System.out.println("Permissao: " + usuario.getPermissao());
		System.out.println("Usuario: " + usuario.getUsuario());

	}
}


