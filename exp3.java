// Aim: Programs on various types of inheritance and Exception handling.
// Name: Jishan Khan
// Roll no./UIN: 25/251P007S
// Class: S.E.Computer A
import java.util.InputMismatchException;
import java.util.Scanner;

// Base Class (Level 1)
class Person {
    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}

// Intermediate Derived Class (Level 2)
class Employee extends Person {
    private int salary;
    private String working_hours;
    private int employee_id;
    private String department;

    Employee(String name, int age, String gender, int salary, String working_hours, int employee_id, String department) {
        super(name, age, gender);
        this.salary = salary;
        this.working_hours = working_hours;
        this.employee_id = employee_id;
        this.department = department;
    }

    void display(){
        super.display();
        System.out.println("Salary: " + this.salary);
        System.out.println("Hours of Working: " + this.working_hours);
        System.out.println("Employee ID: " + this.employee_id);
        System.out.println("Department of Functioning: " + this.department);
    }
}

// Further Derived Class (Level 3 - Multilevel Inheritance)
class Manager extends Employee {
    private int number_of_projects;
    private int number_of_team_members;

    Manager(String name, int age, String gender, int salary, String working_hours, int employee_id, String department, int number_of_projects, int number_of_team_members){
        super(name, age, gender, salary, working_hours, employee_id, department);
        this.number_of_projects = number_of_projects;
        this.number_of_team_members = number_of_team_members;
    }

    void display(){
        super.display();
        System.out.println("Number of Projects Completed: " + this.number_of_projects);
        System.out.println("Number of Members in Team: " + this.number_of_team_members);
    }
}

// Main Execution Class
public class exp3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Number of Hours Working Daily: ");
            String working_hours = sc.nextLine();

            System.out.print("Enter Employee ID: ");
            int employee_id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name of Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Number of Projects Completed: ");
            int number_of_projects = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter number of Members in Team: ");
            int number_of_team_members = sc.nextInt();
            sc.nextLine();

            Manager m1 = new Manager(name, age, gender, salary, working_hours, employee_id, department, number_of_projects, number_of_team_members);
            m1.display();

            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Enter Number only");
        } catch (Exception e) {
            System.out.println("invalid Input");
        }
    }
}