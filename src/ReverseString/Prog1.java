package ReverseString;

import org.testng.annotations.Test;

public class Prog1 {
	@Test
	public void string()
	{
		String n="Bhoomi";
		String rev="";
		for(int i=n.length()-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
		}
		System.out.println(rev);
	}

}
