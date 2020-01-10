package pr1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		
		Map<String, EmpBean> emps=new HashMap<String,EmpBean>();
		
		emps.put("one", new EmpBean(100, "n1", 8500));
		emps.put("two", new EmpBean(102, "n2", 7500));
		emps.put("three", new EmpBean(104, "n3", 9500));
		emps.put("four", new EmpBean(106, "n4", 6500));
		emps.put("five", new EmpBean(108, "n5", 8200));
		
		
		Map<String, EmpBean> map2=new HashMap<String,EmpBean>();
		
		Collection<EmpBean> coll=emps.values();
		
		ArrayList<EmpBean> al=new ArrayList<EmpBean>(coll);
		
		Comparator<EmpBean> comp=(e1,e2) ->{
			
			if(e1.getSal()>e2.getSal())
				return +1;
			else if(e1.getSal()<e2.getSal())
				return -1;
			else
				return 0;
			
			
		};
		
		Collections.sort(al,comp);
		
		
		
		
		
	
		
		
		for(int i=0;i<5;i++) {
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
