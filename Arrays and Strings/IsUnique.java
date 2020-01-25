//Is Unique: Implement an algoruthm to determine if a String has all unique charachters. What if you cannot use additional data structure.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class IsUnique{
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean is_unique=true;
		
		//additional data structure
		System.out.println("IsUnique ?: "+isUniqueUsingDS(input));
		
		// without using additional DS
		// Sort(inplace) the input String and if two consecutive characters are equal then return false.
		
		
		
	}
	public static boolean isUniqueUsingDS(String input){
		HashMap<Character,Integer> dict = new HashMap<>();
		for(int i=0;i<input.length();i++){
			char c = input.charAt(i);
			if(dict.containsKey(c)){
				return false;
			}
			else{
				dict.put(c,1);
			}
		}
		return true;
	}
	
	
	
	
}