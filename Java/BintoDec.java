import java.util.Scanner;
class BintoDec{
public static void main(String []args){
Scanner s=new Scanner(System.in);
int i;int arr[];int a,r;int count=0;

System.out.println("Enter any integer:");
i=s.nextInt();
int i2=i;r=i;
while(i>=1){
r=i/2;
i=r;
count+=1;
}
//System.out.println(count);
arr=new int[count];

int l=0,r2;
while(i2>=1){
arr[l]=i2%2;
r2=i2/2;
i2=r2;
l+=1;
}
int loop=count-1;
for(int k=loop;k>=0;k--){
	System.out.print(arr[k]);
}
}
}