package Ass11;

import java.util.Arrays;

public class DSA4 {

	public static void main(String[] args) {
		
		int j[]=new int[] {1,2,3,4,4};
		Arrays.sort(j);
		for(int i=0;i<j.length;i++)
		{
			if(i!=j.length-1)
			{
				if(j[i]==j[i+1])
				{
					System.out.println("repeated element "+j[i]);
					break;
				}
			}
		}
	}
}
