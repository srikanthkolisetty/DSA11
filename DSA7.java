package Ass11;

public class DSA7 {

	public static void main(String[] args) {
		
		int n[]= {1,2,3,4,5,5};
		int start=-1;
		int end=-1;
		int target=5;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==target)
			{
				if(start==-1)
				{
					start=i;
				}
				else
				{
					end=i;
				}
			}
		}
		if(start!=-1 && end==-1)
		{
			System.out.println("start and end are same "+start+" "+end);
		}
		else if(start==-1 && end==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("start position "+start+" end position "+end);
		}
	}
}
