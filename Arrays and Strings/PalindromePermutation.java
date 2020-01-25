// Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
// EXAMPLE Input: Tact Coa
// Output: True (permutations: "taco cat", "atco eta", etc.)

//Time Complexity: O(N)
//Space Complexity: O(N)

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class PalindromePermutation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(palindromePermutation(input));
	}
	public static boolean palindromePermutation(String input){
		
		HashMap<Character,Integer> dict = new HashMap<>();
		int count=0;
		for(int i=0;i<input.length();i++){
			char c = input.charAt(i);
			
			//to handle both upper and lower case alphabets
			if(c>=97){
				c=(char)((int)c-32);
			}
			
			if (c!=' ' && dict.containsKey(c)){
				dict.put(c,dict.get(c)+1);
			}
			else if(c!=' '){
				dict.put(c,1);
			}
		}
		for(char i : dict.keySet()){
			
			// if every character(except atmost one) has occured even no. of times then it can form a palindrome.
			if (dict.get(i)%2!=0){
				count+=1;
			}
			if(count>1){
				return false;
			}
		}
		return true;
	}
}