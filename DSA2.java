package Ass11;

import java.util.ArrayList;

public class DSA2 {

	public static void main(String[] args) {
		
		int n[]= {1,2,3,4,5};
		ArrayList<Integer> a= new ArrayList();
		for(int i=0;i<n.length;i++)
		{
			if(i==0)
			{
				if(n[i]>n[i+1])
					a.add(i);
			}
			else if(i>0 && i!=n.length-1)
			{
				if(n[i]>n[i-1]  && n[i]>n[i+1])
					a.add(i);
			}
			else if(i==n.length-1)
			{
				if(n[i]>n[i-1])
					a.add(i);
			}
		}
		
		a.forEach(System.out::println);
	}
}
