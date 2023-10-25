package introtooop.abstractclass;

public class App {
    public static void main(String[] args) {
        Bank Arvest = new Arvest();
        Bank boa = new BankOfAmerica();
        Bank citigroup = new Citigroup();
        Arvest.fixInterestRate();
        System.out.println(Arvest.getInterestRate());
        boa.fixInterestRate();
        System.out.println(boa.getInterestRate());
        citigroup.fixInterestRate();
        System.out.println(citigroup.getInterestRate());
    }
}