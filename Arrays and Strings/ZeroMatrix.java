//Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
//Time Complexity: O(M*N)
//Space Complexity: O(1) : Stored the info about which rows and columns has zeroes in matrix itself.
import java.util.Scanner;
class ZeroMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("M: ");
		int m = sc.nextInt();
		System.out.print("N: ");
		int n = sc.nextInt();
		System.out.println("Enter the matrix: ");
		int[][] matrix = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=sc.nextInt();
			} 
		}
		zeroMatrix(matrix);
		System.out.println("OUTPUT : ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			} 
			System.out.println("");
		}
		
	}
	public static void zeroMatrix(int[][] matrix){
		int fr,fc;
		fr=fc=1;
		int m=matrix.length;
		int n=matrix[0].length;
		int max= m>n ? m:n;
		for(int i=0;i<max;i++){
			if(i<=m){
				if(matrix[i][0]==0){
					fc=0;
				}
			}
			if(i<=n){
				if(matrix[0][i]==0){
					fr=0;
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for(int j=1;j<n;j++){
			if(matrix[0][j]==0){
				for(int i=0;i<m;i++){
					matrix[i][j]=0;
				}
			}
		}
		for(int i=1;i<m;i++){
			if(matrix[i][0]==0){
				for(int j=0;j<n;j++){
					matrix[i][j]=0;
				}
			}
		}
		if(fr==0){
			for(int j=0;j<n;j++){
				matrix[0][j]=0;
			}
		}
		if(fc==0){
			for(int i=0;i<m;i++){
				matrix[i][0]=0;
			}
		}
		
	}
}