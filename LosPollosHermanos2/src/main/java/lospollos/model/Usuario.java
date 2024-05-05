package lospollos.model;

public class Usuario {
    private int IDUsuario;
    private String Username;
    private String Email;
    private String Password;
    private int Telefono;
    private String Prefijo;
    private String Rol;

    public Usuario(int IDUsuario, String Username, String Email, String Password, int Telefono, String Prefijo, String Rol) {
        this.IDUsuario = IDUsuario;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Telefono = Telefono;
        this.Prefijo = Prefijo;
        this.Rol = Rol;
    }

	public int getIDUsuario() {
		return IDUsuario;
	}

	public void setIDUsuario(int iDUsuario) {
		IDUsuario = iDUsuario;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public String getPrefijo() {
		return Prefijo;
	}

	public void setPrefijo(String prefijo) {
		Prefijo = prefijo;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

    
}
