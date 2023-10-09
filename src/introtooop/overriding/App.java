package introtooop.overriding;

public class App {
    public static void main(String[] args) {
        Bank a = new Bank();
        Bank Arvest = new Arvest();
        Bank boa = new BankOfAmerica();
        Bank citigroup = new Citigroup();
        a.fixInterestRate();
        System.out.println(a.getInterestRate());
        Arvest.fixInterestRate();
        System.out.println(Arvest.getInterestRate());
        boa.fixInterestRate();
        System.out.println(boa.getInterestRate());
        citigroup.fixInterestRate();
        System.out.println(citigroup.getInterestRate());
    }
}
