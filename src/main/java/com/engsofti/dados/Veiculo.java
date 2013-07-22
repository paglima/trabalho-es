package com.engsofti.dados;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;


@Entity
@Component
public class Veiculo {
	
	@Id
	@SequenceGenerator( name = "sequence", sequenceName = "sequence" )
    @GeneratedValue( generator = "sequence", strategy = GenerationType.AUTO )
	private Long id;
	
	private String marca;

	private String modelo;
	
	private Double preco;
	
	private String tipoDeCombustivel;
	
	private String tipoDeVeiculo;
	
	private String placa;
	
	private String status;

	private String fotos;

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public String getTipoDeVeiculo() {
		return tipoDeVeiculo;
	}
	
	public void setTipoDeVeiculo(String tipoDeVeiculo) {
		this.tipoDeVeiculo = tipoDeVeiculo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}
}
