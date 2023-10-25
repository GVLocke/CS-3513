package introtooop.abstractclass;

public abstract class Bank {
    protected double interest_rate;
    abstract void fixInterestRate();
    public double getInterestRate() {
        return this.interest_rate;
    }
}
