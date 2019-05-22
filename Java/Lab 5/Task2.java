import java.util.*;
class JAVA{
    int a[]=new int[5];
    
    public void PopulateArray(int b,int c){
        a[b]=c;
    }
    public void ShowMsg(){
        System.out.println("Enter any five intigers\n");
    }
    public void Even(){
        System.out.println("\nEven numbers are");
    }
    public void ShowEven(int d){
        if(a[d]%2==0){System.out.print(a[d] + "\t");}
    }
    public void Odd(){
        System.out.println("\nOdd numbers are");
    }
    public void ShowOdd(int e){
        if(a[e]%2!=0){System.out.print(a[e] + "\t");}
    }
}
class Task2{
public static void main(String abc[]){
Scanner sc=new Scanner(System.in);
JAVA n=new JAVA();
int read;    
    n.ShowMsg();
    for(int i=0;i<5;i++){
        read=sc.nextInt();
        n.PopulateArray(i,read);
    }
    n.Even();
    for(int j=0;j<5;j++){
        n.ShowEven(j);
    }
    n.Odd();
    for(int k=0;k<5;k++){
        n.ShowOdd(k);
    }
}
}