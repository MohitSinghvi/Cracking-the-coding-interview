// String Compression : Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).
//Time Complexity: O(N)
//Space Complexity: O(N)
import java.util.Scanner;
class StringCompression{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(stringCompression(input));
		
	}
	public static String stringCompression(String input){
		StringBuilder sb_string = new StringBuilder();
		int count=0;
		for(int i=0;i<input.length();i++){
			count+=1;
			if(i+1>=input.length() || input.charAt(i)!=input.charAt(i+1)){
				sb_string.append(input.charAt(i));
				sb_string.append(count);
				count=0;
			}
			
		}
		if(sb_string.length() < input.length()){
			return sb_string.toString();
		}
		else{
			return input;
		}
	}
	
	
}
