package com.engsofti.dados;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import sun.nio.cs.ext.ISCII91;


@Component
public class EmailSender {
	
	@Autowired
	private MailSender mailSender;
 
	
	private void sendMail(String from, String to, String subject, String msg) {
 
		SimpleMailMessage message = new SimpleMailMessage();
 
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		mailSender.send(message);	
	}
	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}	
	
	public Boolean verificaEnvio(Aluno aluno){
		DateTime hoje = new DateTime();
		for (Disciplina d : aluno.getDisciplinas()) {
			for(Atividade at : d.getAtividades()){
				if(compareDateTime(at.getData(),hoje)){
					sendMail("paulopagl@gmail.com",aluno.getEmail(),
							"Lembrete de Prova", 
							"Olá "+aluno.getNome()+", você tem "+ getNameInstance(at)+ " de "+d.getNome()+
							" amanhã as "+ at.getData().toString("HH:mm"));
				}
			}
		}
		return true;
	}
	
	public Boolean enviaBoasVindas(Aluno aluno){
		sendMail("paulopagl@gmail.com",aluno.getEmail(),
				"Boas-Vindas", 
				"Olá "+aluno.getNome()+". Você acaba de fazer um cadastro no gerenciador de tarefas " +
						"acadêmicas. Esperamos que tenha bons resultados. Seja bem-vindo!");
		return true;
	}
	
	public Boolean compareDateTime(DateTime dia, DateTime hoje){
		if(dia.getDayOfMonth() - 1 == hoje.getDayOfMonth() 
			&& dia.getMonthOfYear() == hoje.getMonthOfYear()
			&& dia.getYear() == hoje.getYear()){
			
			return true;
			
		}
		return false;
	}
	
	public String getNameInstance(Atividade at){
		if(at instanceof Prova){
			return "prova";
		}
		if(at instanceof Trabalho){
			return "trabalho";
		}
		return "relatório";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String hoje = new LocalDate().toString("dd/MM/yyyy");
		DateTime dt = new DateTime();
		System.out.println(dt.toString("HH:mm"));
	}

}
