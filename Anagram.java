package week3Javabasics;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		char[] A1=text1.toCharArray();
		char[] A2=text2.toCharArray();

		Arrays.sort(A1);  
		Arrays.sort(A2);
		
	if(A1.length != A2.length) {
		System.out.println("not Anagram");
	}
	for(int i=0;i<A1.length;i++) {
	if(A1[i] != A2[i]) {
		System.out.println("not Anagram");
		System.exit(i);
	}}
System.out.println("Given String is Anagram");
	}}
