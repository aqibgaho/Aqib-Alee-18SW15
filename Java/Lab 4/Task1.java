import java.util.*;
class Task1{
public static void main(String abc[]){
Scanner sc=new Scanner(System.in);
int choice;
System.out.print("Press 1 for upper triangle \nPress 2 for lower triangle \nPress 3 for pyramid\nPress 4 for all of them\n");
choice=sc.nextInt();
    switch(choice){
        case 1:int a1;System.out.print("How many lines of triangle do you want press no of lines\n");
        a1=sc.nextInt();
            for(int i=1;i<=a1;i++){
                for(int j=1;j<=i;j++)
                {System.out.print("*");}System.out.println();}
                
            break;

        case 2:int a2;System.out.print("How many lines of triangle do you want press no of lines\n");a2=sc.nextInt();int m=a2;
            for(int k=1;k<=a2;k++){
                for(int l=1;l<=m;l++){
                    System.out.print("*");}System.out.println();
                                 m-=1;}
            break;

        case 3:int a;System.out.print("How many lines pyramid do you want press no of lines\n");a=sc.nextInt();
int space=a;int b=1;
do{
	for(int i=space;i>0;i--){System.out.print(" ");}
	space=space-1;
	
	for(int j=b;j>0;j--){System.out.print("*");}
	b+=2;
	System.out.println();a-=1;
}while(a>0);
break;
        case 4:int a4;System.out.print("How many lines of all of these you want\n");a4=sc.nextInt();int mm=a4;
            for(int ii=1;ii<=a4;ii++){
                for(int jj=1;jj<=ii;jj++)
                {System.out.print("*");}System.out.println();}

            for(int kk=1;kk<=a4;kk++){
                for(int ll=1;ll<=mm;ll++){
                    System.out.print("*");
                }System.out.println();
                                 mm-=1;}
            int space2=a4;int bb=1;
do{
	for(int i=space2;i>0;i--){System.out.print(" ");}
	space2=space2-1;
	
	for(int j=bb;j>0;j--){System.out.print("*");}
	bb+=2;
	System.out.println();a4-=1;
}while(a4>0);break;

    }


}
}