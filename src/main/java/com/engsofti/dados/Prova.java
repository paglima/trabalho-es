package com.engsofti.dados;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

@Component
public class Prova extends Atividade{

	
	public Prova(){
		
	}
	
	public Prova(String nome,DateTime data,Double nota,Integer peso,String conteudo){
		super.setNome(nome);
		super.setData(data);
		super.setNota(nota);
		super.setPeso(peso);
		super.setConteudo(conteudo);
	}

	@Override
	public String toString() {
		return super.getData()+" - "+super.getNota()+" - "+super.getPeso()+"";
	}
	
	
}