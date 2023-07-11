package Ass11;

import java.util.Arrays;

public class DSA3 {

	public static void main(String[] args) {
		int n[]= {2,3,0,4};
		Arrays.sort(n);
		int len=n.length;
		for(int i=n.length-1;i>=0;i--)
		{
			if(n[i]!=len)
			{
				System.out.println("missing element "+len);
				break;
			}
			len--;
		}
	}
}
