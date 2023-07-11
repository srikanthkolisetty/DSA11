package Ass11;

public class DSA6 {

	public static void main(String[] args) {
		
		
		int n[]= {1,2,4,5,3};
		int min=n[0];
		for(int i=0;i<n.length;i++)
		{
			if(min<n[i])
			{
				min=n[i];
			}
		}
		System.out.println(min);
	}
}
