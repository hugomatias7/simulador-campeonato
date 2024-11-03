package Simulador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class tabela {
	public static List<componentes> tab = new ArrayList<>();

	public static void main(String[] args) {
		componentes jogo = new componentes();
		Scanner sc =new Scanner(System.in);
		
		tab.add(new componentes("Botafogo",64,19,49,26));
		tab.add( new componentes ("Palmeiras",61,18,53,25));		 
		tab.add( new componentes ("Fortaleza",57,16,41,32));	
		tab.add( new componentes ("Flamengo",55,16,50,37));	
		tab.add( new componentes ("Internacional",53,14,42,28));		
		tab.add( new componentes ("São Paulo",51,15,42,33));
		tab.add( new componentes ("Bahia",46,13,42,37));
		tab.add( new componentes ("Cruzeiro",44,12,36,33));
		tab.add( new componentes ("Vasco",43,12,36,43));
		tab.add( new componentes ("Atlético-MG",41,10,42,45));
		tab.add( new componentes ("Grêmio",38,11,36,39));
		tab.add( new componentes ("Criciuma",37,9,38,44));
		tab.add( new componentes ("Fluminense",36,10,26,32));
		tab.add( new componentes ("Vitória",35,10,35,45));
		tab.add( new componentes ("Corinthians",35,8,35,40));
		tab.add( new componentes ("Athletico-PR",34,9,32,37));
		tab.add( new componentes ("Bragantino",34,8,34,40));
		tab.add( new componentes ("Juventude",34,8,38,48));
		tab.add( new componentes ("Cuiabá",27,6,25,41));
		tab.add( new componentes ("Atlético-GO",22,5,23,50));
		
		System.out.println("Rodada 32 ");
		jogo.jogo("Fluminense","Grêmio");
		jogo.jogo("Bragantino", "Cuiabá");
		jogo.jogo("Athletico-PR", "Vitória");
		jogo.jogo("Juventude", "Fortaleza");
		jogo.jogo("Corinthians", "Palmeiras");
		jogo.jogo("Internacional", "Criciuma");
		jogo.jogo("Bahia", "São Paulo");
		jogo.jogo("Botafogo", "Vasco");
		jogo.jogo("Cruzeiro", "Flamengo");
		jogo.jogo("Atlético-GO", "Atlético-MG");
		
		jogo.LimpaConsole();
		
		System.out.println("Rodada 33 ");
		jogo.jogo("Internacional", "Fluminense");
		jogo.jogo("Palmeiras", "Grêmio");
		jogo.jogo("Vitória", "Corinthians");
		jogo.jogo("Botafogo", "Cuibá");
		jogo.jogo("Cruzeiro", "Criciuma");
		jogo.jogo("Fortaleza", "Vasco");
		jogo.jogo("Atlético-GO", "Bragantino");
		jogo.jogo("Juventude", "Bahia");
		jogo.jogo("São Paulo", "Athletico-PR");
		jogo.jogo("Flamengo", "Atlético-MG");
		
		jogo.LimpaConsole();
		
		System.out.println("Rodada 34 ");
		jogo.jogo("Grêmio", "Juventude");
		jogo.jogo("Atlético-MG", "Botafogo");
		jogo.jogo("Bahia", "Palmeiras");
		jogo.jogo("Fluminense", "Fortaleza");
		jogo.jogo("Vasco", "Internacional");
		jogo.jogo("Corinthians", "Cruzeiro");
		jogo.jogo("Bragantino", "São Paulo");
		jogo.jogo("Athletico-PR", "Atlético-GO");
		jogo.jogo("Cuiabá", "Flamengo");
		jogo.jogo("Criciuma", "Vitória");

		jogo.LimpaConsole();
				
		System.out.println("rodada 35 ");		
		jogo.jogo("Internacional", "Bragantino");
		jogo.jogo("Cruzeiro", "Grêmio");
		jogo.jogo("Bahia", "Athletico-PR");
		jogo.jogo("Fluminense", "Criciuma");
		jogo.jogo("Botafogo", "Vitória");
		jogo.jogo("Corinthians", "Vasco");
		jogo.jogo("São Paulo", "Atlético-MG");
		jogo.jogo("Atlético-GO", "Palmeiras");
		jogo.jogo("Juventude", "Cuibá");
		jogo.jogo("Fortaleza", "Flamengo");
				
		jogo.LimpaConsole();
		
		System.out.println("Rodada 36 ");
		jogo.jogo("Grêmio", "São Paulo");
		jogo.jogo("Atlético-MG", "Juventude");
		jogo.jogo("Vitória", "Fortaleza");
		jogo.jogo("Flamengo", "Internacional");
		jogo.jogo("Vasco", "Atlético-GO");
		jogo.jogo("Palmeiras", "Botafogo");
		jogo.jogo("Bragantino", "Cruzeiro");
		jogo.jogo("Athletico-PR", "Fluminense");
		jogo.jogo("Cuiabá", "Bahia");
		jogo.jogo("Criciuma", "Corinthians");
		
		jogo.LimpaConsole();
		
		System.out.println("Rodada 37 ");
		
		jogo.jogo("Internacional", "Botafogo");
		jogo.jogo("Cruziero", "Palmeiras");
		jogo.jogo("Vitória", "Grêmio");
		jogo.jogo("Fluminense", "Cuibá");
		jogo.jogo("Vasco", "Atlético-MG");
		jogo.jogo("Corithians", "Bahia");
		jogo.jogo("São Paulo", "Juventude");
		jogo.jogo("Athletico-PR", "Bragantino");
		jogo.jogo("Atlético-GO", "Fortaleza");
		jogo.jogo("Criciuma", "Flamengo");
		
		jogo.LimpaConsole();
		
		System.out.println("Rodada 38 ");
		
		jogo.jogo("Grêmio", "Corinthians");
		jogo.jogo("Atlético-MG", "Athletico-PR");
		jogo.jogo("Bahia", "Atlético-GO");
		jogo.jogo("Flamengo", "Vitória");
		jogo.jogo("Botafogo", "São Paulo");
		jogo.jogo("Palmeiras", "Fluminense");
		jogo.jogo("Criciuma", "Bragantino");
		jogo.jogo("Fortaleza", "Internacional");
		jogo.jogo("Cuiabá", "Vasco");
		jogo.jogo("Juventude", "Cruzeiro");
		
		jogo.LimpaConsole();
		
		tab.sort(Comparator.comparingInt(componentes::getPontos).reversed());
		
		
		
		for(componentes c: tab) {
			System.out.println (c.getTimes() + " " +c.getPontos());
		}


	}
	public static List<componentes> getTab(){
		return tab;
	}
}
