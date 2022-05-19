public class User {
	protected String usuario;
	protected String pass;
	public static final String passAdmin="1234admin4321";

	 public User() {
		 this("Introduce Usuario", "Introduce contraseña");

	 }
	 public User(String usuario, String pass) {
		 this.usuario=usuario;
		 this.pass=pass;

	 }
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "El usuario -"+ usuario+"- tiene la contraseña -"+ pass+"-";
	}
}
