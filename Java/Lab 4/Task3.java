import java.util.Scanner;
class Task3{
public static void main(String abc[]){
Scanner sc=new Scanner(System.in);
     System.out.println("Enter any positive integer");
int a;a=sc.nextInt();int sum=0;
    if(a>0){
    for(int i=1;i<=a;i++){sum=sum+i;
        
    }	System.out.print("sum from 1 to "+ a + " = "+ sum);}
    else if(a<0){System.out.println("please dont enter negative integer");}
	
	

}
}