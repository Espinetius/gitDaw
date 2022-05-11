import javax.swing.text.BadLocationException;

public class Admin extends User{
	protected boolean admin;
	protected final String passAdmin="1234admin4321";
	 public Admin() {
		 super();
		 admin=true;
	 }
	 public Admin(String user, String pass) {
		 super(user, pass);
		 admin=true;
	 }
	 public boolean acceso(String password){
		 if(password.equalsIgnoreCase(passAdmin)) {
			 admin=true;
		 } else {
			 admin=false;
		 }
		 return admin;
	 }
}
