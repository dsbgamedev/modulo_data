package cursojava_data;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		
		
		
		
		
		/*Modulo 15 - Aula 4 - comparando datas usando After e Before */
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataVencimentoBoleto = simpleDateFormat.parse("03/05/2022");
		Date dataAtualHoje =  simpleDateFormat.parse("04/05/2022");
		
		/*if(dataVencimentoBoleto.after(dataAtualHoje)) {//Compara se a data é posterior ou maior que a data atual
			
			System.out.println("Boleto nao vencido");
			
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}*/
		
		
		if(dataVencimentoBoleto.before(dataAtualHoje)) {//Se a data um e menor que a data 2
			
			System.out.println(" Boleto vencido - URGENTE");
			
		}else {
			System.out.println("Boleto nao vencido");
		}
	}

}
