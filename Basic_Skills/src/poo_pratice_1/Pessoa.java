package poo_pratice_1;

public class Pessoa {
	String nome;
	int idade;
	Carro carro;
	
	//constructor for pessoa
	public Pessoa() {
		super();
	}
	
	//generating getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	//methods interacting with the carro class
	void ligarCarro(){
		carro.ligar();
	}
	void desligarCarro(){
		carro.desligar();
	}
	void acelerarCarro(){
		carro.acelerar();
	}
	void frearCarro(){
		carro.frear();
	}
	void setCambio(int marcha){
		carro.setCambio(marcha);
	}

}
