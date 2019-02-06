package com.capgemini.repo;
import java.util.*;

import com.capgemini.beans.Employee;
public class EmployeeRepoImpl implements EmployeeRepo {
	 HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();

	@Override
	public boolean save(Employee e) {
		int id=e.getId();
		map.put(id, e);

		return true;
		
	}

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> list=new ArrayList<>();
		for(Map.Entry<Integer,Employee> entry:map.entrySet()) {
			if(entry.getValue().getName().equals(name));
			{
				list.add(entry.getValue());			}
		     }
	    
		return list; 
 }
}
   

