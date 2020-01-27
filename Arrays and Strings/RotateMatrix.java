// Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
//Time Complexity: O(N^2)
//Space Complexity: O(1)

import java.util.Scanner;
class RotateMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("N: ");
		int n = sc.nextInt();
		System.out.println("Enter the matrix: ");
		int[][] matrix = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=sc.nextInt();
			} 
		}
		rotateMatrix(matrix);
		System.out.println("OUTPUT : ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			} 
			System.out.println("");
		}
		
	}
	public static void rotateMatrix(int[][] matrix){
		int n=matrix.length;
		for(int layer=0;layer<n;layer++){
			int start=layer;
			int end=n-1-layer;
			for(int i = start; i<end; i++){
				
				int offset= i-start;
				
				int temp= matrix[start][i];
				matrix[start][i]=matrix[end-offset][start];
				matrix[end-offset][start]=matrix[end][end-offset];
				matrix[end][end-offset]=matrix[i][end];
				matrix[i][end]=temp;
				
				
			
			
			}
		}
		
	}
}