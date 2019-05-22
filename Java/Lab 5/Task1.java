import java.util.Scanner;
class Task1{
public static void main(String abc[]){
Scanner sc=new Scanner(System.in);
String s;int a;char c;double d;boolean b;
    float f;short sh;byte by;long l;
    System.out.println("Enter any String");
    s=sc.nextLine();
    System.out.println("Enter any Integer");
    a=sc.nextInt();
    System.out.println("Enter any Decimal number");
    d=sc.nextDouble();
    System.out.println("Enter any Character");
    c=sc.next().charAt(0);
    System.out.println("Enter any Boolean");
    b=sc.nextBoolean();
    System.out.println("Enter any Float");
    f=sc.nextFloat();
    System.out.println("Enter any Short");
    sh=sc.nextShort();
    System.out.println("Enter any byte");
    by=sc.nextByte();
    System.out.println("Enter any long");
    l=sc.nextLong();

    System.out.println("String :" + s);
    System.out.println("Intiger:" + a);
    System.out.println("Double :" + d);
    System.out.println("Char   :" + c);
    System.out.println("Boolean:" + b);
    System.out.println("Float  :" + f);
    System.out.println("Short  :" + sh);
    System.out.println("Byte   :" + by);
    System.out.println("Long   :" + l);

}
}