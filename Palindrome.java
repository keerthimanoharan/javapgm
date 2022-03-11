package week3Javabasics;

public class Palindrome {

	public static void main(String[] args) {
		String a="MADAM";
		int i=0;
		int j = a.length()-1;
		
		while(i<j)
		{
			if(a.charAt(i)!=a.charAt(j)) {
				System.out.println("not palindrome");
			System.exit(i);
			}
			i++;
			j--;
		}
		System.out.println("given string is palindrome");
}}