import Entities.Automovel;
import Entities.Mota;
import Repositorio.AutomovelRepositorio;
import Repositorio.Motarepositorio;

public class Test {
	
	private static Motarepositorio repositorioMotas = new Motarepositorio();
	private static AutomovelRepositorio repositorioAutomovel = new AutomovelRepositorio();


	public static void main(String[] args){
		
		run();
	}
	
	public static void run() {
		Mota mota1=new Mota(2, 0, "Piaggio", 5, 250);
		
		repositorioMotas.save(mota1);
		String marcaMota=repositorioMotas.findById((long)0).getMarca();
		System.out.println(marcaMota);
		
		Automovel auto=new Automovel(4,2,"Ferrari", "RadioTech", 10);
		
		repositorioAutomovel.save(auto);
		
		String marca= repositorioAutomovel.findById((long)0).getMarca();
		
		System.out.println(marca);
		
		Object [] list = repositorioAutomovel.getAll().toArray();
		
		for (int i=0; i<list.length; i++){
			System.out.println(((Automovel)list[i]).getMarca());
			
		}
	}
}
