import java.util.*;
class Task6{
public static void main(String abc[]){
Scanner sc=new Scanner(System.in);
    System.out.println("Name\t\tRol#\tDepartment\tAge");
    Student s1=new Student("Aqib Ali","18SW15","Software",18);
    s1.showData();
    s1.setmarks(75,80,90);
    s1.percentage();
    s1.ShowData();
}
}