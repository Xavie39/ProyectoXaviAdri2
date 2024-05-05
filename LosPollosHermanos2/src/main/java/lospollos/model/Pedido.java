package lospollos.model;

public class Pedido {
    private int IDPedido;
    private int IDUsuario;
    private int IDProducto;
    private int Cantidad;
    private double PrecioTotal;
    private int Estado;

    public Pedido(int IDPedido, int IDUsuario, int IDProducto, int Cantidad, double PrecioTotal, int Estado) {
        this.IDPedido = IDPedido;
        this.IDUsuario = IDUsuario;
        this.IDProducto = IDProducto;
        this.Cantidad = Cantidad;
        this.PrecioTotal = PrecioTotal;
        this.Estado = Estado;
    }

	public int getIDPedido() {
		return IDPedido;
	}

	public void setIDPedido(int iDPedido) {
		IDPedido = iDPedido;
	}

	public int getIDUsuario() {
		return IDUsuario;
	}

	public void setIDUsuario(int iDUsuario) {
		IDUsuario = iDUsuario;
	}

	public int getIDProducto() {
		return IDProducto;
	}

	public void setIDProducto(int iDProducto) {
		IDProducto = iDProducto;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public double getPrecioTotal() {
		return PrecioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		PrecioTotal = precioTotal;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}
    
}
