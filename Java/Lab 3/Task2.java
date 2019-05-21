import java.util.*;
class Task2{
public static void main(String []abc){
    Scanner n= new Scanner(System.in);
    int u;
System.out.print("Enter the number of units");
u=n.nextInt();
    if (u<=50){int price = u*10;
        System.out.print("\nYour bill is:"+ price);}
    else if (u>50&&u>=100){int price = 50*10 + (u-50)*15;
                           System.out.println("Your bill is:"+ price);}
    else if (u>50&&u<=100){int price = 50*10 + (u-50)*15;
                           System.out.println("Your bill is:"+ price);}
    else if (u>100&&u<=200){int price = 50*10 + 50*15 + (u-100)*20;
                           System.out.println("Your bill is:"+ price);}
    else if (u>200&&u<=300){int price = 50*10 + 50*15 + 100*20 + (u-200)*25;
                           System.out.println("Your bill is:"+ price);}
    else if (u>300){int price = 50*10 + 50*15 + 100*20 + 100*25 + (u-300)*30;
                           System.out.println("Your bill is:"+ price);}
    
}
}