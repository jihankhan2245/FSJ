// Aim: WAP to create a calculator class to add two numbers. Use constructor overloading to initialize the data with either default values or user provided values. Use method overloading to add integer or double.
// Name: Jishan Khan
// UIN: 251P007
// Class: S.E. Computer A
class Calculator {
    int a;
    int b;

    Calculator() {
        a = 8;
        b = 0;
    }

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void add(int p, int q){
        int sum = p+q;
        System.out.println("Integer Sum: " + sum);
    }

    void add(double p, double q){
        double sum = p+q;
        System.out.println("Double Sum: " + sum);
    }
}
public class exp2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("A:" + c1.a + ", B:" + c1.b);

        Calculator c2 = new Calculator(1,4);
        System.out.println("A:" + c2.a + ", B:" + c2.b);

        c1.add(2,5);
        c1.add(2.5,5.2);
    }
}