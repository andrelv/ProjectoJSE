package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Entity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


abstract class EntityRepository <T extends Entity> {
	
	private long actualId=1;
	private long maiorId=1;
	
	
	private Map <Long, T> map = new HashMap <Long, T>();
	
	public void save (T entidade){
		entidade.setId(actualId);
		map.put(entidade.getId(), entidade);
		actualId++;	
	}
	
	public T findById(Long id){
		return map.get(id);
	}
	
	public void removeById(Long id){
		map.remove(id);
	}
	
	public void updateById(T entidade){
		map.replace(entidade.getId(), entidade);
	}
	
	public Collection<T> getAll(){
		return map.values();
	} 
	
	public long nextId(){
		return actualId++;	
		}
}

