import java.util.*;
class Task1{
public static void main(String []abc){
    Scanner n= new Scanner(System.in);
    int c, os, ds;
System.out.println("Enter the marks of c++ out of 100");
c=n.nextInt();
System.out.println("Enter the marks of Data Structure out of 100");
ds=n.nextInt();
System.out.println("Enter the marks of Operating system out of 100");
os=n.nextInt();
int sum = c+ds+os;
double per=sum*100/300;
System.out.println("Total numbers ="+ sum);    
System.out.println("Percentage    ="+ per);
    if (per>=90)
    {System.out.println("Grade = A");}
    else if (per<90&&per>=80)
    {System.out.println("Grade = B");}
    else if (per<80&&per>=70)
    {System.out.println("Grade = C");}
    else if (per<70&&per>=60)
    {System.out.println("Grade = E");}
    else if (per<60)
    {System.out.println("Grade = Fail");}
}
}