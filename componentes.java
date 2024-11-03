package Simulador;

import java.util.Scanner;

public class componentes {
	Scanner sc = new Scanner(System.in);
	tabela obj = new tabela();
private String Times;
private int Pontos;
private int Vitórias;
private int GolsPro;
private int GolsContra;


public componentes(String Times, int Pontos, int Vitórias, int GolsPro, int GolsContra) {

	 this.Times= Times;
	 this.Pontos = Pontos;
	 this.Vitórias = Vitórias;
	 this.GolsPro = GolsPro;
	 this.GolsContra = GolsContra;
}

public componentes() {
	
}








public void vitoria(String nomeTime) {
	for(componentes c :obj.getTab()) {
		if(c.getTimes().equals(nomeTime)) {
			c.Pontos +=3;
		}
	}
}

public void empate(String TimeCasa,String TimeFora) {
	for(componentes c : obj.getTab()) {
		if(c.getTimes().equals(TimeCasa)) {
			c.Pontos += 1;
		}
		
		if(c.getTimes().equals(TimeFora)) {
			c.Pontos += 1;
		}
	}
}





public void jogo(String TimeCasa,String TimeFora) {
	System.out.println(TimeCasa + " X " + TimeFora);
	int GolsCasa = sc.nextInt();	
	int GolsFora = sc.nextInt();
	if(GolsCasa> GolsFora) {
		vitoria(TimeCasa);
	}else if(GolsFora> GolsCasa) {
		vitoria(TimeFora);
	}else {
	empate(TimeCasa,TimeFora);
	}
}




public String getTimes() {
	return Times;
}



public int getPontos() {
	return Pontos;
}


public int getVitórias() {
	return Vitórias;
}



public int getGolsPro() {
	return GolsPro;
}



public int getGolsContra() {
	return GolsContra;
}



public void LimpaConsole() {
	for(int i = 0;i<50;i++) {
		System.out.println();
	}
}




}
