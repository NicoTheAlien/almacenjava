
public class articulo {
		private int codigo;
		private String descripcion;
		private int precioCompra;
		private int precioVenta;
		private int stock;
	public articulo (int codigo, String descripcion, int precioCompra, int precioVenta, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}
	public int getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String toString() {
		String cadena = "-----------------------------------";
		cadena+="\nCodi: " + this.codigo;
		cadena+="\nDescripcion: "+ this.descripcion;
		cadena+="\nPrecio de compra: "+ this.precioCompra;
		cadena+="\nPrecio de venta: "+ this.precioVenta;
		cadena+="\nStock: "+ this.stock;
		cadena+="\n---------------------------------------";
		return cadena;
	}
	
}
