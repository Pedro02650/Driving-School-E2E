package registroDeCliente;

public class ClienteDados {

	private String NomeComleto;
	private int idade;
	private int diaDeNascimento;
	private int mesDeNascimento;
	private int anoDeNascimento;
	private int cep;
	private String estado;
	private String Cidade;
	private String Bairro;
	private String Rua;
	private int nCasa;

	public void ColetaDeDados(String nome, int idade, int a, int b, int c, int cep, String A, String B, String C,
			String d, int Ncasa) {

		this.NomeComleto = nome;
		this.idade = idade;
		this.diaDeNascimento = a;
		this.mesDeNascimento = b;
		this.anoDeNascimento = c;
		this.cep = cep;
		this.estado = A;
		this.Cidade = B;
		this.Bairro = C;
		this.Rua = d;
		this.nCasa = Ncasa;

	}

}
