package Repositorio;

import Entities.Veiculo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EntitieRepository <T extends Veiculo> {
	
	private long actualId=0;

	private Map <Long, T> map = new HashMap <Long, T>();
	
	public void save (T veic){
		veic.setId(actualId);
		map.put(veic.getId(), veic);
		actualId++;
		
	}
	
	public T findById(Long id){
		return map.get(id);
	}
	
	public void removeById(Long id){
		map.remove(id);
	}
	
	public void updateById(T veic){
		map.replace(veic.getId(), veic);
	}
	
	public Collection<T> getAll(){
		return map.values();
	} 
}
