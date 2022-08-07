package Mustafa_Murat_Coskun;

public class C02_Inheritance_Main {
    public static void main(String[] args) {
        C02_Inheritance_Employee employee = new C02_Inheritance_Employee("Abbas ", "Bilişim", 3000);
        employee.showInfos();
        System.out.println("\n<====================================>\n");
        C02_Inheritance_Manager manager = new C02_Inheritance_Manager("ABBAS", "BİLİŞİM", 4000, 10);
        manager.showInfos();

        manager.raiseSalary(100);
    }
}
