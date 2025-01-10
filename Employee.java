//import java.util.Scanner;

public class Employee {
    String empname;
    String empdepartment;
    int empsalary;
    static String empCompany;

    static{
        empCompany = "Google";
    }

    public Employee(String empname, String empdepartment, int empsalary){
        this.empname = empname;
        this.empdepartment = empdepartment;
        this.empsalary = empsalary;
    }

    public static String getEmpCompany() {
        return empCompany;
    }

    public void setEmpdepartment(String empdepartment) {
        this.empdepartment = empdepartment;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }

    public String getEmpdepartment() {
        return empdepartment;
    }

    public String getEmpname() {
        return empname;
    }

    public int getEmpsalary() {
        return empsalary;
    }

    public double incSalary() {
        double inc = empsalary*1.15;
        return inc;
    }
    public static void main(String[] args) {
        Employee obj = new Employee("Rahul Sharma", "Marketing", 20000);
        System.out.println(obj.getEmpname()+" "+obj.getEmpsalary()+" "+obj.getEmpdepartment()+" "+obj.getEmpCompany());
        obj.setEmpdepartment("Finance");
        
        //System.out.println(obj.empname+ " " +obj.empdepartment +" " +obj.incSalary()+" "+obj.empCompany);
        System.out.println(obj.getEmpname()+" "+obj.incSalary()+" "+obj.getEmpdepartment()+" "+obj.getEmpCompany());
    }
}
