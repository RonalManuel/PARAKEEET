package pe.edu.upc.entity;

import java.sql.Date;

public class Alquiler {

	private int CAlquiler;
	private int SMonto;
	private Date DFechaInicio;
	private  Date DFechaFin;
	private int QAlquiler;
	public int getCAlquiler() {
		return CAlquiler;
	}
	public void setCAlquiler(int cAlquiler) {
		CAlquiler = cAlquiler;
	}
	public int getSMonto() {
		return SMonto;
	}
	public void setSMonto(int sMonto) {
		SMonto = sMonto;
	}
	public Date getDFechaInicio() {
		return DFechaInicio;
	}
	public void setDFechaInicio(Date dFechaInicio) {
		DFechaInicio = dFechaInicio;
	}
	public Date getDFechaFin() {
		return DFechaFin;
	}
	public void setDFechaFin(Date dFechaFin) {
		DFechaFin = dFechaFin;
	}
	public int getQAlquiler() {
		return QAlquiler;
	}
	public void setQAlquiler(int qAlquiler) {
		QAlquiler = qAlquiler;
	}
	
}
