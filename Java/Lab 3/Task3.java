import java.util.*;
class Task3{
public static void main(String []abc){
    Scanner n= new Scanner(System.in);
    char a;
System.out.print("Enter any alphabet and check either it is vowel or consonant");
a=n.next().charAt(0);
    switch(a){
        case 'a':System.out.print(a +" is vowel ");break;
        case 'e':System.out.print(a +" is vowel ");break;
        case 'i':System.out.print(a +" is vowel ");break;
        case 'o':System.out.print(a +" is vowel ");break;
        case 'u':System.out.print(a +" is vowel ");break;
        case 'A':System.out.print(a +" is vowel ");break;
        case 'E':System.out.print(a +" is vowel ");break;
        case 'I':System.out.print(a +" is vowel ");break;
        case 'O':System.out.print(a +" is vowel ");break;
        case 'U':System.out.print(a +" is vowel ");break;
        default :System.out.print(a +" is Consonent ");break;
    }
}
}