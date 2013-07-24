package com.engsofti.factory;

import com.engsofti.dados.Atividade;
import com.engsofti.dados.Prova;
import com.engsofti.dados.Relatorio;
import com.engsofti.dados.Trabalho;

public class AtividadeFactory {
	
	public static Atividade criaAtividade(String tipo) throws Exception{
		if(tipo.equals("Prova")){
			return new Prova();
		}else if(tipo.equals("Relatorio")){
			return new Relatorio();
		}else if(tipo.equals("Trabalho")){
			return new Trabalho();
		}else
			throw new Exception("");
	}
}