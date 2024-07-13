package registroDeCliente;

import java.util.Scanner;

import carrosRegistrados.CarroRegistro;

public class CadastroDeAulo {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		
		System.out.println("****************************************************************************");
		System.out.println("******************** Bem vindo ao istema de cadastro ***********************");
		System.out.println("*************************** Auto Escola E2E ********************************");
		System.out.println("****************************************************************************");
		
		boolean nextRegister =  false;
		boolean City = false;
		boolean Registrado = false;
		boolean validName = false;
		boolean validAge = false;
		boolean district = false;
		boolean Street = false;
		boolean nHome = false;
		boolean CEp = false;
		String response ="";
		String Nome;
		int idade =0;
		String Cidade;
		String Bairro;
		String Rua;
		int Ncasa;
		int cep;
		
		
		
		//AlunoAutoEscola aluno = new AlunoAutoEscola();
		CarroRegistro carroOne = new CarroRegistro();
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Digite o nome: ");
		
		
	 while(!validName && !validAge && !City && !district && !Street && !nHome && !CEp) {
		 
		while(!validName) { // enquanto o nome for invalido o metodo não irá fechar até o usuario infrmar um nome valido
			
			String ApenasLetras = "^[a-zA-Z\\s]+$"; // Essa String contem valor verifica se ha apenas letras e espaços no nome.
			
				String NomeLupi = keyboard.nextLine();
				if(!NomeLupi.matches(ApenasLetras) || NomeLupi.isBlank() || NomeLupi.isEmpty()) {
					System.out.println("Nome invalido, digite novamente: ");	
					} else {
						Nome = NomeLupi;
						validName = true;
						System.out.println("Nome registrado");								
				    }	
		}
		
		
		
		System.out.println(""); // quebra de linha 
		System.out.println("Digite a idade do aluno: ");
		while(!validAge) {
            try {
                String ValorDeEntrada = keyboard.nextLine();
                if (ValorDeEntrada.matches("-?\\d+") ) { // "-?\\d+" Verifica se a entrada é um número inteiro
                    idade = Integer.parseInt(ValorDeEntrada);
                    if(idade <= 17 || idade >=100) {
                    	System.err.println("Idade invalida, isira novamente: ");
                    }else{
                    validAge = true;
                    System.out.println("Idade registrada com sucesso.");
                    }
                    
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Insira valores interios para continuar: ");
            }
			
		}
		
		
		
		System.out.println(""); // quebra de linha 
		System.out.println("Cidade: ");
		while(!City) {
			String ApenasLetras = "^[a-zA-Z\\s]+$";
			try {
				String city = keyboard.nextLine();
				if (city.matches(ApenasLetras)) {
					Cidade = city;
					System.out.println("Cidade registrada");
					City = true;
				} else {
					throw new Exception("Nome invladido, contens numeros e caracteres especiais");
				}
				} catch (Exception e) {
					System.out.println("Tipo de nome invalido, verifique");
				}
			
			
		}
		
		
		
		System.out.println(""); // quebra de linha 
		System.out.println("Bairro: ");
		while(!district) {
			String ApenasLetras = "^[a-zA-Z\\s]+$";
			try {
				String city = keyboard.nextLine();
				if (city.matches(ApenasLetras)) {
					Bairro = city;
					System.out.println("Bairro registrada");
					district = true;
				} else {
					throw new Exception("Nome invladido, contens numeros e caracteres especiais");
				}
				} catch (Exception e) {
					System.out.println("Tipo de nome invalido, verifique");
				}
			
			
		}
		
		
		
		System.out.println(""); // quebra de linha 
		System.out.println("Rua: ");
		while(!Street) {
			String ApenasLetras = "^[a-zA-Z\\s]+$";
			try {
				String city = keyboard.nextLine();
				if (city.matches(ApenasLetras)) {
					Rua = city;
					System.out.println("Rua foi registrada");
					Street = true;
				} else {
					throw new Exception("Nome invladido, contens numeros e caracteres especiais");
				}
				} catch (Exception e) {
					System.out.println("Tipo de nome invalido, verifique");
				}
			
			
		}
		
		
		
		System.out.println(""); // quebra de linha 
		System.out.println("Digite o N° da casa: ");
		while(!nHome) {
            try {
                String ValorDeEntrada = keyboard.nextLine();
                if (ValorDeEntrada.matches("-?\\d+")) { // "-?\\d+" Verifica se a entrada é um número inteiro
                    Ncasa = Integer.parseInt(ValorDeEntrada);
                    if(Ncasa <= 0 || Ncasa >=8000) {
                    	System.err.println("Idade invalida, isira novamente: ");
                    }else{
                    nHome = true;
                    System.out.println("N° casa registrada com sucesso.");
                    }
                    
                } else {
                    throw new NumberFormatException("valor invalido ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Insira valores interios para continuar: ");
            }
			
		}
		
		
		
		System.out.println(""); // quebra de linha 
		System.out.println("Digite cep: ");
		while(!CEp) {
            try {
                String ValorDeEntrada = keyboard.nextLine();
                if (ValorDeEntrada.matches("-?\\d+")) { // "-?\\d+" Verifica se a entrada é um número inteiro
                    cep = Integer.parseInt(ValorDeEntrada);
                    if(cep <= 1000000 || cep >=99999999) {
                    	System.err.println("Cep invalido, isira novamente: ");
                    }else{
                    CEp = true;
                    System.out.println("CEP registrado com sucesso.");
                    }
                    
                } else {
                    throw new NumberFormatException("valor invalido ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Insira um formato de CEP valido para finalizar seu cadastro: ");
            }
			
		}
	 }	// fim do do registro do aluno
	 
	 
	 
	 System.out.println("***********************************************************************************");
	 System.out.println("*************** Parabéns Aluno cadastrado com sucesso *****************************");
	 System.out.println("***********************************************************************************");
	 System.out.println();
	 System.out.println("Você quer cadastrar carro: Sim oou Não");
	 
	 response = keyboard.nextLine();
	
	 
	 while(response.trim().equalsIgnoreCase("Sim")) {
	 
	 switch (response) {	 
	 
	 case "sim":
		
		 System.out.println("Insira os dados do carro");
		 boolean valid = false;
		 System.out.println(""); // quebra de linha 
		 System.out.println("Digite o ano do caroo: ");
		 String ano = keyboard.nextLine();
		 
		 
		 while(!valid) {
		 if (ano.matches("-?\\d+")){ 
			 
			 int year = Integer.parseInt(ano);
			 carroOne.InsertYear(year);
			 valid = true;
		 } else {
			 
			 System.out.println("Dado invalido");
			 
		 }
				 
		 } 
		
	//   seleniun - UI 
	//	 restassure - API 
	//	 cucumber- Documentação 
	//	 jUnit - teste unitario
	 
	 
	 }
	 }
	 
	 } 
	 
	 
			
	
	
	
}
