import accounts.*;

public class Main {

    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(100,0.042, 700);
        account.status();
        account.deposit(20);
        account.status();

        System.out.println(account.getRewardPoints());
        if (account.purchase(18.63)){
            System.out.println("Purchase successful");
        }
        else {
            System.out.println("Purchase failed");
        }
        System.out.println(account.getRewardPoints());

        /*CheckingAccount ca = new CheckingAccount(100,0.037,500);
        SavingsAccount sa = new SavingsAccount(100,0.045);
        ca.status();
        sa.status();

        ca.withdraw(10);
        sa.withdraw(10);

        ca.status();
        sa.status();

       /* SilverCheckingAccount silver = new SilverCheckingAccount(5000,0.025,1000);
        GoldCheckingAccount gold = new GoldCheckingAccount(5000,0.025,1000);
        DiamondCheckingAccount diamond = new DiamondCheckingAccount(5000,0.025,1000);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        silver.purchase(500);
        gold.purchase(500);
        diamond.purchase(500);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());*/
    }
}
