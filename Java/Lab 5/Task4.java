class Student extends Marksheet{
    Marksheet m1;
    String name,roll,dep; int age;
    Student(String name, String roll, String dep, int age){
        this.name=name;
        this.roll=roll;
        this.dep=dep;
        this.age=age;
    }
    public void showData(){
        System.out.println(name + "\t" +roll+ "\t" +dep+ "\t" +age);
    }
    
}
