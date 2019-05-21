import java.util.Scanner;
class Task5{
	public static void main(String abc[]){
		Scanner sc=new Scanner(System.in);
		int a[]={-3,-5,-2,-8,-22,-12};int k=0;
        while(k!=5){for(int i=0;i<6;i++){
           if(i!=5){if(a[i]>a[i+1]){
                a[i]=a[i]+a[i+1];
                a[i+1]=a[i]-a[i+1];
                a[i]=a[i]-a[i+1];
            }else if(a[i]>a[i+1]){
                a[i]=a[i];
                   } 
            
            }
          }
            k+=1;
        }
        
                System.out.println(a[k]);

    }
}