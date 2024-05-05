package lospollos.model;

public class Producto {
    private int IDProducto;
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private int Stock;
    private String Imagen;

    public Producto(int IDProducto, String Nombre, String Descripcion, double Precio, int Stock, String Imagen) {
        this.IDProducto = IDProducto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Imagen = Imagen;
    }

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public int getIDProducto() {
		return IDProducto;
	}

	public void setIDProducto(int iDProducto) {
		IDProducto = iDProducto;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

    
}
