import java.util.Scanner;
class Marksheet{
    int OOP,DCLD,LAAG,total = 300,Obtained_Marks;
    double per;
    
        
    
    public void setmarks(int a,int b,int c){
        OOP=a;DCLD=b;LAAG=c;
       Obtained_Marks=OOP+DCLD+LAAG; 
    }
    public double percentage(){
     per = Obtained_Marks*100/total;
        return per;
    }
    public void ShowData(){
        System.out.println("Marks of OOP=" + OOP);
        System.out.println("Marks of DCLD=" + DCLD);
        System.out.println("Marks of LAAG=" + LAAG);
        System.out.println("Total obtained Marks=" + Obtained_Marks);
        System.out.println("Percentage=" + percentage());
        
    }
}
class Task5{
public static void main(String abc[]){
Scanner sc=new Scanner(System.in);
    int oop,dcld,laag;
    Marksheet m=new Marksheet();
    System.out.println("Enter the marks of OOP out of 100");
    oop=sc.nextInt();
    System.out.println("Enter the marks of DCLD out of 100");
    dcld=sc.nextInt();
    System.out.println("Enter the marks of LAAG out of 100");
    laag=sc.nextInt();
    m.setmarks(oop,dcld,laag);
    m.ShowData();
    

}
}