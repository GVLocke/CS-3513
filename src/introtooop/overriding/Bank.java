package introtooop.overriding;

public class Bank {
    protected double interest_rate;

    public void fixInterestRate() {
        this.interest_rate = 10.5;
    }

    public double getInterestRate() {
        return this.interest_rate;
    }
}
