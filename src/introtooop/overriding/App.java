package introtooop.overriding;

public class App {
    public static void main(String[] args) {
        Bank a = new Bank();
        Arvest Arvest = new Arvest();
        BankOfAmerica boa = new BankOfAmerica();
        Citigroup citigroup = new Citigroup();
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
