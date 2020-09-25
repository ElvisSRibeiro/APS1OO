package aps1POO;

public class Data {
	//representando datas
	public int mes;	//1 - 12
	public int dia;	//1 - 31 dependendo do mes
	public int ano;	//qualquer ano
	
	//getters e setters
	public int getDia() {
		return this.dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Data
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	//validador
	public boolean validaData() {

		if(ano >= 0) {

			if((mes >= 1) && (mes <=12)) {
				
				if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					if (dia >= 1 && dia <= 31) {
						return true;
					}
					else {
						return false;
					}
				}
				else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {

					if (dia >= 1 && dia <= 30) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
				//mês de fevereiro
					if(ano % 4 != 0) { //ano não é bissexto

						if(dia >= 1 && dia <= 28) {
							return true;
						} else {
							return false;
						}
					}
					else if(ano % 4 == 0) {//ano pode ser bissexto

						if(ano % 100 != 0) { //ano bissexto

							if(dia >= 1 && dia <= 29) {
								return true;
							}
							else {
								return false;
								}
						}
						else {

							if(ano % 400 == 0) {
								return true;
							}
							else {
								return false;
							}
						}
					}
				} 
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		return true;
	}
	
	//calcular o proximo dia
	public void avancarDia(){
        dia++;
        if(dia == 31){dia = 1; mes++;}
        if(mes == 13){mes = 1; ano++;}
    }
	
	
	//toString
	@Override
	public String toString(){
        return getDia() + "/" + getMes() + "/" + getAno();
    }
	
	//mostrar o dia
	//esse está funcionando mas o toString nao está funcionando
	public void mostrarData() {
		if(validaData()) {
			System.out.println(this.dia+"/"+this.mes+"/"+this.ano);	
		}
		else {
			System.out.println("Data não é válida.");
		}
		
	}
	
	//Aqui começa o MAIN.
	//Eu não consegui fazer funcionar pegando a data
	//do sistema.
	public static void main(String[] args) {

		Data dataAtual = new Data(25,9,2020);
		dataAtual.validaData();
		dataAtual.mostrarData();
		dataAtual.avancarDia();
		dataAtual.toString();
		//System.out.println(dataAtual.toString());
		System.out.println("Amanhã será dia: " + dataAtual.toString());
				
	} 
	
	
}
