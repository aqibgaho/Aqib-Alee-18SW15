import java.util.*;
class Task4{
public static void main(String []abc){
Scanner s = new Scanner(System.in);
    int a,b;char c;
System.out.println("Enter first number then second number then operator");
    a=s.nextInt();
    b=s.nextInt();
    c=s.next().charAt(0);

    switch(c){
        case '+':System.out.print(a+b);
        break;
        case '-':System.out.print(a-b);
        break;
        case '*':System.out.print(a*b);
        break;
        case '/':System.out.print((double)a/b);
        break;
        default :System.out.print("Wrong operator ");
        break;
    }
}
}