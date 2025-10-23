package ProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class MapConcepts {
	public static void main(String[] args) {
		
	Map<Integer,String>map=new HashMap<Integer,String>();
	map.put(101,"Wills");
	map.put(102, "Honey");
	for(Integer maps:map.keySet()) {
		System.out.println("ID is "+maps+ map.get(maps));
	}
	
	}
}
