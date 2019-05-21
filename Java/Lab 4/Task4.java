import java.util.*;
class Task4{
	public static void main(String abc[]){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int sum[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
                System.out.print("Enter intiger at position a[" +i+"][" +j+ "]");
				a[i][j]=sc.nextInt();
			}
		}
		for(int k=0;k<3;k++){
			for(int l=0;l<3;l++){System.out.print("Enter intiger at position b[" +k+"][" +l+ "]");
				b[k][l]=sc.nextInt();
			}
		}
		for(int s=0;s<3;s++){
			for(int t=0;t<3;t++){
				sum[s][t]=a[s][t]+b[s][t];
			}
		}
		for(int ss=0;ss<3;ss++){
			for(int tt=0;tt<3;tt++){
				System.out.print(sum[ss][tt] + "\t");
			}
			System.out.println();
		}
	}
}