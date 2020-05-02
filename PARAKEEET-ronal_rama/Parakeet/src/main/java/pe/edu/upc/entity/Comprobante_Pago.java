package pe.edu.upc.entity;

import java.sql.Date;

public class Comprobante_Pago {
private int CComprobante;
private Date DFechaEmision;
public int getCComprobante() {
	return CComprobante;
}
public void setCComprobante(int cComprobante) {
	CComprobante = cComprobante;
}
public Date getDFechaEmision() {
	return DFechaEmision;
}
public void setDFechaEmision(Date dFechaEmision) {
	DFechaEmision = dFechaEmision;
}

}
