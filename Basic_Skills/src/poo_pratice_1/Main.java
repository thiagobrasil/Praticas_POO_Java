package poo_pratice_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//assigning values to parameters
		Carro meuCarro = new Carro();
		meuCarro.setTipo("Hatch");
		meuCarro.setCor("Azul");
		meuCarro.setPlaca("MXX-3087");
		meuCarro.setNumPortas(4);
		
		//assigning values to parameters
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Thiago");
		pessoa.setIdade(30);
		
		//object pessoa using caro
		pessoa.setCarro(meuCarro);
		
		//actions
		pessoa.ligarCarro();
		pessoa.setCambio(1);
		pessoa.acelerarCarro();
		pessoa.setCambio(2);
		pessoa.acelerarCarro();
		pessoa.setCambio(3);
		pessoa.acelerarCarro();
		pessoa.setCambio(2);
		pessoa.acelerarCarro();
		pessoa.setCambio(3);
		pessoa.acelerarCarro();
		pessoa.setCambio(4);
		pessoa.acelerarCarro();
		pessoa.setCambio(3);
		pessoa.acelerarCarro();
		pessoa.setCambio(2);
		pessoa.frearCarro();
		pessoa.setCambio(1);
		pessoa.frearCarro();
		pessoa.desligarCarro();
		
		//print objects
		System.out.println("Informação sobre o veículo");
		System.out.println("\nTipo do carro: " + meuCarro.getTipo());
		System.out.println("Cor do carro: " + meuCarro.getCor());
		System.out.println("Placa do carro: " + meuCarro.getPlaca());
		System.out.println("Qtde Portas do Carro: " + meuCarro.getNumPortas());	
		System.out.println("Este carro pertence a: " + pessoa.getNome());
	}
}
