package com.armada.fuerza.vehiculos;

import com.armada.fuerza.Vehiculo;
import com.armada.fuerza.interfaces.HidroAvion;

public class VehiculoHidroAvion extends Vehiculo implements HidroAvion {

	private Double profundidad;
	private Double altura;
	
	public VehiculoHidroAvion(int codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad=0.0;
		this.altura=0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}

}
