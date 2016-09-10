package poo_pratice_1;

public class Carro {
	String tipo;
	String cor;
	String placa;
	int numPortas;
	int cambio;
	
	
	//generating constructor 
	public Carro() {
	}
	
	//generating getters and setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	public int getCambio() {
		return cambio;
	}

	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	//creating methods for carro
	void ligar(){
		System.out.println("O carro foi ligado");
	}
	void desligar(){
		System.out.println("O carro foi desligado");
	}
	void acelerar(){
		System.out.println("O carro está acelerando");
		if(cambio == 2){
			System.out.println("O carro está em Aproximadamente 40km/h");
		}else if(cambio == 3){
			System.out.println("O carro está em Aproximadamente 50km/h");
		}else if(cambio == 4){
			System.out.println("O carro está em Aproximadamente 60km/h");
		}else if(cambio == 5){
			System.out.println("O carro está em Aproximadamente 70km/h");
		}else{
			System.out.println("O carro está ganhando velocidade");
		}	
	}
	void frear(){
		System.out.println("O carro está freando");
	}
}
