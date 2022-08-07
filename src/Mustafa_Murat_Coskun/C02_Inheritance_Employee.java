package Mustafa_Murat_Coskun;

public class C02_Inheritance_Employee {
    private String name;
    private String department;
    private int salary;


    public C02_Inheritance_Employee(String name, String department, int salary) {
        this.salary = salary;
        this.department = department;
        this.name= name;
    }
    public void showInfos(){
        System.out.println("Bilgiler...");
        System.out.println("İsim: "+ this.name);
        System.out.println("Departman: "+ this.department);
        System.out.println("Maaş: "+ this.salary);
    }

}
