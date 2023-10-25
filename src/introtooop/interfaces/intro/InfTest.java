package introtooop.interfaces.intro;

public class InfTest implements CalcInf, ManipulateInf{
    @Override
    public int digitSum(int num) {
        if (!this.isPositive(num)) {
            num *= -1;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    @Override
    public boolean isPositive(int num) {
        return num >= 0;
    }

    @Override
    public int add(int a, int b) {
       return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
    
}
