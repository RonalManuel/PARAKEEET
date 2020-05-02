package pe.edu.upc.entity;

public class Producto {
private int CProducto;
private String NProducto;
private String Stock;
private String Descripcion;
private String Imagen;
private float Precio;
public int getCProducto() {
	return CProducto;
}
public void setCProducto(int cProducto) {
	CProducto = cProducto;
}
public String getNProducto() {
	return NProducto;
}
public void setNProducto(String nProducto) {
	NProducto = nProducto;
}
public String getStock() {
	return Stock;
}
public void setStock(String stock) {
	Stock = stock;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}
public String getImagen() {
	return Imagen;
}
public void setImagen(String imagen) {
	Imagen = imagen;
}
public float getPrecio() {
	return Precio;
}
public void setPrecio(float precio) {
	Precio = precio;
}

}
