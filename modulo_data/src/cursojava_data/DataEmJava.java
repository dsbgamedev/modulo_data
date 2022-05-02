package cursojava_data;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		/************************************************************************************/
		/*Modulo 15 - Aula 7 - Gerando parcelsa mensais*/
		
		
		
		
		
		
		/**********************************************************************************/
		/*Modulo 15 - Aula 6 - Faixa de tempo com ChronoUnit*/
		
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2022");
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-05-01"), LocalDate.now());//Between(ente)Metodo Between retorno um long
		
		System.out.println("Possui " + dias + " dias entre a faixa da data ");
		
		
		/***********************************************************************************/
		/*Modulo 15 - Aula 5 - Calculando dia, ano e mes com Calendar */
		
		/*
		Calendar calendar = Calendar.getInstance();/*essa instancia pega a data atual*/
		
		//Simular a data que vem do banco de dados
		/*
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("02-05-2022"));/*Definindo uma data qualquer*/
		
		/*calendar.add(Calendar.DAY_OF_MONTH, -5);//Somando o dia
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		*/
		
		/***************************************************************************/
		/*Modulo 15 - Aula 4 - comparando datas usando After e Before */
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//Date dataVencimentoBoleto = simpleDateFormat.parse("03/05/2022");
		//Date dataAtualHoje =  simpleDateFormat.parse("04/05/2022");
		
		/*if(dataVencimentoBoleto.after(dataAtualHoje)) {//Compara se a data é posterior ou maior que a data atual
			
			System.out.println("Boleto nao vencido");
			
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}*/
		
		
		/*if(dataVencimentoBoleto.before(dataAtualHoje)) {//Se a data um e menor que a data 2
			
			System.out.println(" Boleto vencido - URGENTE");
			
		}else {
			System.out.println("Boleto nao vencido");
		}*/
	}

}
