
class Task6{
	public static void main(String abc[]){
int a; a=Integer.parseInt(abc[0]);int found=0,k=0;
		int arr[]={-3,-5,-2,-8,-22,-1};
        for(int i=0;i<6;i++){
        if(a==arr[i]){
                found+=1;break;
        }
        else{found = 0;
            }k+=1;
          }
        if(found==1){
        System.out.println("Number fount at position a[" + k +"]");
        }
        else{System.out.println("Number not found");}
    }
}