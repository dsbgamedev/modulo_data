package cursojava_data;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		
		/*Modulo 15 - Aula 13 - data, anos, dias, meses e parcelas com LocalDate*/
		
		
		
        /************************************************************************************/
		
		/*Modulo 15 - Aula 12 - Faixa de tempo com objeto periodo*/
		
		/*
		LocalDate dataAntiga = LocalDate.of(2020, 6, 7);
		
		LocalDate dataNova = LocalDate.of(2021, 8, 7);
		
		
		
		
		System.out.println("Data antiga e maior que data nova " + dataAntiga.isAfter(dataNova));
		*/		
		
        /************************************************************************************/
		
		/*Modulo 15 - Aula 11 - Tempo de processo instant*/
		
		
		/*Instant inicio = Instant.now();
		
		Thread.sleep(2000);//Processo em tempo qualquer
		
		Instant iFinal = Instant.now();
		
		Duration duration = Duration.between(inicio, iFinal );
		
		System.out.println(" Duração em nano segundo " + duration.toNanos());
		*/
		
		/************************************************************************************/
		
		/*Modulo 15 - Aula 8 9 10 - Nova API de Data e Hora do Java a partir do Java 8*/
		/*
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora Atual " + horaAtual);
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		*/
		
		
		
		/************************************************************************************/
		/*Modulo 15 - Aula 7 - Gerando parcelas mensais*/
		/*
		Date dataInicial =   new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for(int parcela = 1; parcela <= 5 ; parcela++ ) {
			calendar.add(Calendar.MONDAY, 1);
			System.out.println("Parcela de numero " + parcela + " Vencimento eh em " + new SimpleDateFormat().format(calendar.getTime()) );
		}*/
		
		
		/**********************************************************************************/
		/*Modulo 15 - Aula 6 - Faixa de tempo com ChronoUnit*/
		
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2022");
		
		/*long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-05-01"), LocalDate.now());//Between(ente)Metodo Between retorno um long
		
		/System.out.println("Possui " + dias + " dias entre a faixa da data ");*/
		
		
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
