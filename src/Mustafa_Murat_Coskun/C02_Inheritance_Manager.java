package Mustafa_Murat_Coskun;

public class C02_Inheritance_Manager extends C02_Inheritance_Employee {

    private  int num_of_employees;
    private int salary;

    public C02_Inheritance_Manager(String name, String department, int salary, int num_of_employees) {
     super(name, department,salary);
  this.num_of_employees= num_of_employees;
  this.salary=salary;

    }
    public void raiseSalary(int amount){
        System.out.println("Çalışanlara "+ amount+"tl zam yapıldı... ");
        System.out.println("Çalışanların zamlı maaşı: "+ (amount+salary));
    }
}
