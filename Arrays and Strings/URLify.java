// Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
//Time Complexity: O(N) (in single pass)
//Space Complexity: O(1)

import java.util.Scanner;
class URLify{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] inputarr = (sc.nextLine()).toCharArray();
		
		int pointer=inputarr.length-1;
		boolean found=false;
		for(int i=inputarr.length-1;i>-1;i--){
			if(inputarr[i]!=' '){
				inputarr[pointer]=inputarr[i];
				pointer-=1;
				found=true;
			}
			else{
				if(found==true){
					inputarr[pointer]='0';
					inputarr[pointer-1]='2';
					inputarr[pointer-2]='%';
					pointer-=3;
					
				}
				
			}
		}
		for(int i=0;i<inputarr.length;i++){
			System.out.print(inputarr[i]);
		}
		
		
		
	}
}