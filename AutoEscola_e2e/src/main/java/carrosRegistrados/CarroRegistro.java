package carrosRegistrados;

public class CarroRegistro {
	
	private int quilometragem;
	private int ano;
	private int portas;
	
	public void InsertQuilometragem(int Km) {
		
		quilometragem = Km;
		
	}
	
	public void InsertYear (int year) {
			ano = year;
		
	}
	
	public void InsertDoors (int door) {
		portas = door;
		
	}
	
}
