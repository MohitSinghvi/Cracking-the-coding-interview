// Check Permutation : Given two Strings write a method to determine if one is a permutation of other
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class CheckPermutation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("S1: ");
		String s1 = sc.nextLine();
		System.out.print("S1: ");
		String s2 = sc.nextLine();
		
		System.out.println(checkPermutation(s1,s2));
		
		
	}
	public static boolean checkPermutation(String s1, String s2){
		HashMap<Character,Integer> dict = new HashMap<>();
		int slen;
		if (s1.length()!=s2.length()){
			return false;
		}
		else{
			slen=s1.length();
		}
		for(int i=0;i<slen;i++){
			char c=s1.charAt(i);
			if (dict.containsKey(c)){
				
				//Increment dict for each char
				dict.put(c,dict.get(c)+1);
			}
			else{
				dict.put(c,1);
			}
		}
		for(int i=0;i<slen;i++){
			char c=s2.charAt(i);
			if (dict.containsKey(c)){
				
				//Decrement dict for each char
				dict.put(c,dict.get(c)-1);
			}
			else{
				
				//If a new char encountered, return false
				return false;
			}
			
			if(dict.get(c)<0){
				
				//Return false if a char occurs more no. of time in the second String
				return false;
			}
		}
		return true;
		
	
		
		
	}
}