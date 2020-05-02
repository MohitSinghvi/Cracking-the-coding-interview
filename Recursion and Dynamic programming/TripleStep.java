import java.util.Scanner;
class TripleStep{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getWaysToRunUp(n));
		System.out.println(getWaysDp(n));
	}
	public static int getWaysToRunUp(int n){
		
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		if(n==3){
			return 4;
		}
		return getWaysToRunUp(n-1)+getWaysToRunUp(n-2)+getWaysToRunUp(n-3);
	}
	public static int getWaysDp(int n){
		int[] output = new int[n];
		if(n>=3){
			output[2]=4;
			output[1]=2;
			output[0]=1;
		}
		for(int i=3;i<n;i++){
			output[i]=output[i-1]+output[i-2]+output[i-3];
		}
		return output[n-1];
	}
}