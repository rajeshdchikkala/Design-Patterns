package com.rajesh.strategydp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyPatternExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sort list
		List<Integer> l= new ArrayList<>();
		l.add(1);
		l.add(110);
		l.add(100);
		l.add(10);
		System.out.println(l);
		Collections.sort(l);// here we use integer sort internal method
		System.out.println(l);
		//reverseORder is strategy
		//either use line 24 or line 25 both will reverse your data
		//Collections.sort(l,new StrategyComparator());
		Collections.sort(l,new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				// TODO Auto-generated method stub
				return x<y?1:((x==y)?0:-1);			
			}
		});
		
        System.out.println(l);
		
		List<Employee> empList= new ArrayList<>();
		Collections.sort(empList);
		
	}

}
