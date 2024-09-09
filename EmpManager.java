import java.util.*;

class Employee{
    protected String name,mobNum;
    protected int yearOfJoin,age;
    
    Employee(String name,String mobNum,int yearOfJoin,int age){
        this.name=name;
        this.mobNum=mobNum;
        this.yearOfJoin=yearOfJoin;
        this.age=age;
    }

    void employeeDisplay(){
        System.out.println("Name: "+name);
        System.out.println("Mobile Number: "+mobNum);
        System.out.println("Year of Join: "+yearOfJoin);
        System.out.println("Age: "+age);
    }
}

class Manager extends Employee{
    protected String department;

    Manager(String name,String mobNum,int yearOfJoin,int age,String department){
        super(name,mobNum,yearOfJoin,age);
        this.department=department;
    }

    void managerDisplay(){
        System.out.println("Details of the Manager:");
        employeeDisplay();
        System.out.println("Department: "+department);
    }
}



public class EmpManager{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String name,mobNum,department;
        int yearOfJoin,age;
        System.out.println("Enter Name ,mobile number,year of joining, age and department of the Manager:");
        name=inp.nextLine();
        mobNum=inp.nextLine();
        yearOfJoin=inp.nextInt();
        age=inp.nextInt();
        inp.nextLine();
        department=inp.nextLine();
        System.out.println();
        Manager manObj=new Manager(name,mobNum,yearOfJoin,age,department);
        manObj.managerDisplay();
        inp.close();
    }
}
