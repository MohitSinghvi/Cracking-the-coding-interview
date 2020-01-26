// One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away. 
// EXAMPLE:
// pale, ple -> true; pales, pale -> true; pale, bale -> true; pale, bake -> false.

//Time Complexity: O(N)
//Space Complexity: O(1)

import java.util.Scanner;
class OneAway{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		System.out.println(oneAway(s1,s2));
		
		
	}
	public static boolean oneAway(String sa, String sb){
		int p1,p2; 
		p1=p2=0;
		String s1,s2;
		boolean difference=false;
		if(sa.length()<sb.length()){
			s1=sa;
			s2=sb;
		}
		else{
			s1=sb;
			s2=sa;
		}
		while(p1<s1.length() && p2<s2.length()){
			if(s1.charAt(p1)!=s2.charAt(p2)){
				if(difference==true){
					return false;
				}
				difference=true;
				if(s1.length()==s2.length()){
					p2++; //increment smaller pointer for replace case
				}
			}
			else{
				p2++; //increment smaller pointer 
			}
			p1++; //increment larger pointer everytime
		}
		return true;
	}
}