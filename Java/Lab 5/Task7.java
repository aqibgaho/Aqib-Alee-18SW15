class Task7{
public static void main(String abc[]){
    String s1[]={"Ali","18","BE-Software"};
    String s2[]={"Aisha","19","BE-Electronics"};

    for(int i=0;i<3;i++){
    if(i==0){System.out.println("Student 1");
        System.out.println("Name :"+ s1[i]);
    }
    else if(i==1){
        System.out.println("Age :"+ s1[i]);
    }
    else {
        System.out.println("Programme :"+ s1[i]);
    }
}
for(int j=0;j<3;j++){
    if(j==0){
        System.out.println("Student 2");
        System.out.println("Name :"+ s2[j]);
    }
    else if(j==1){
        System.out.println("Age :"+ s2[j]);
    }
    else {
        System.out.println("Programme :"+ s2[j]);
    }
}

}
}