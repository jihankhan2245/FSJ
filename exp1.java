// Name: Jishan Khane
// UIN: 251P007
// Class: S.E.Computer A
public class exp1 {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.name = "Jishan";
        s1.uin = "251P007";
        s1.cgpa = 8.54;
        s1.display();

        StudentInfo s2 = new StudentInfo();
        s2.name = "Ankit";
        s2.uin = "251P067";
        s2.cgpa = 8.54;
        s2.display();

        StudentInfo s3 = new StudentInfo();
        s3.name = "Robert";
        s3.uin = "251P096";
        s3.cgpa = 8.54;
        s3.display();
    }
}
class StudentInfo{
    String name;
    String uin;
    double cgpa;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("UIN: " + uin);
        System.out.println("CGPA: " + cgpa);
        System.out.println("--------------------");
    }
}