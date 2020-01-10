package pr1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Map<String, EmpBean> emps=new HashMap<String,EmpBean>();
		
		emps.put("one", new EmpBean(100, "n1", 8500));
		emps.put("two", new EmpBean(102, "n2", 7500));
		emps.put("three", new EmpBean(104, "n3", 9500));
		emps.put("four", new EmpBean(106, "n4", 6500));
		emps.put("five", new EmpBean(108, "n5", 8200));
		
		System.out.println(emps);
		
		Set set=emps.entrySet();
		
		
		ArrayList<Map.Entry<String, EmpBean>> al=new ArrayList<Map.Entry<String,EmpBean>>(set);
	
		
		Comparator<Map.Entry<String, EmpBean>> comp=new Comparator<Map.Entry<String,EmpBean>>() {

			@Override
			public int compare(Map.Entry<String, EmpBean> me1, Map.Entry<String, EmpBean> me2) {
				
				
				EmpBean e1=me1.getValue();
				EmpBean e2=me2.getValue();
				
				
				if(e1.getSal()>e2.getSal())
					return +1;
				
				else if(e1.getSal()<e2.getSal())
					return -1;
				else
					return 0;
				
				
				
				
			}
		};
		
		
		Collections.sort(al,comp);
		
	System.out.println(al);	
		
	Map<String,EmpBean>	 map2=new LinkedHashMap<String, EmpBean>();
	
	for(Map.Entry<String, EmpBean> m:al) {
		
		map2.put(m.getKey(), m.getValue());
		
	}
	
	System.out.println(map2);
		
		
		
		
		
		
		
		
		
		
		

	}

}
