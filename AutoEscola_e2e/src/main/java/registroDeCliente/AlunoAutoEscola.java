package registroDeCliente;

public class AlunoAutoEscola {

	private String nomeCompleto;
	
	private int idade;
	
	private String Cidade;
	
	private String Bairro;
	
	private String rua;
	
	private int numeroCasa;
	
	private double cep;
	
	public void DadosPessoais(String nomeCompleto, int idade, String Cidade, String Bairro, String rua, int numeroCasa,
			double cep) {
		
		
		nomeCompleto = this.nomeCompleto;
		idade = this.idade;
		Cidade = this.Cidade;
		Bairro = this.Bairro;
		rua = this.rua;
		numeroCasa = this.numeroCasa;
		cep = this.cep;
		
		System.out.println("Nome: "+ nomeCompleto+" \nIdade: "+idade+" \nCidade: "+Cidade);
		
		}

	
	public void Cadastro (String nomeCompleto, int idade, String Cidade, String Bairro, String rua, int numeroCasa,
	double cep) {
		
		
		this.nomeCompleto = nomeCompleto;		
		this.idade = idade;
		
		
		
		this.Cidade = Cidade;
		
		
		
		this.Bairro = Bairro;
		
		
		
		this.rua = rua;
		
		
		
		this.numeroCasa = numeroCasa;
		
		
		
		this.cep = cep;
		
			
		
	}

	
	
	
	
}