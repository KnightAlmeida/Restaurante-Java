package DesafioRestaurante;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(String nomePessoa, double pesoPessoa) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Ol� eu sou o " + nomePessoa + " e tenho " + pesoPessoa + " Kgs.";
	}
}
