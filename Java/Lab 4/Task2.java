import java.util.*;
class Task2{
public static void main(String abc[]){
Scanner sc=new Scanner(System.in);
int a,b;
    System.out.println("Enter first integer integer");
a=sc.nextInt();
    System.out.println("Enter 2nd integer integer");
b=sc.nextInt();
if(a<b){
int i=a;while(i<=b){System.out.println(a + " x " + i +" = "+a*i );i+=1;}}
if(a>b){
int i=b;while(i<=a){System.out.println(b + " x " + i +" = "+b*i);i+=1;}}

}
}