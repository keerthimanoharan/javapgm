package week3Javabasics;
public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
			
int count=0;
char[] a=str.toCharArray();

int length = a.length;
System.out.println("length of char array is "+length);

for(int i=0;i<length;i++) {
	if('e' == a[i]) {
		count++;
	}}
	System.out.println(count);
}}
