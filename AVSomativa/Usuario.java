package AVSomativa;

public class Usuario {
	private int id;
	private String nome;
	private int Password;
	private String Permissao;
	private String Usuario;


	//Construtor sem argumento
	public Usuario () {};


	//Construtor com argumento
	public Usuario(int id, String nome, int password, String permissao, String usuario) {
		this.id = id;
		this.nome = nome;
		this.Password = password;
		this.Permissao = permissao;
		this.Usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	public String getPermissao() {
		return Permissao;
	}

	public void setPermissao(String permissao) {
		Permissao = permissao;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}


}
