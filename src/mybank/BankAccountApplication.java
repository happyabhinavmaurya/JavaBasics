package mybank;

public class BankAccountApplication {
    public static void main(String[] args) {
        BankAccount rbsAccount1 = new BankAccount(101, 1092399.0);
        // rbsAccount1.accountNumber = 101;
        // rbsAccount1.balance = 0.00;
        System.out.println(rbsAccount1.getAccountNumber());
        rbsAccount1.deposit_amount(1000);
        rbsAccount1.check_balance();
        rbsAccount1.withdraw_amount(500);

        BankAccount rbsAccount2 = new BankAccount(201, 12376833764.0);
        // rbsAccount2.accountNumber = 102;
        // rbsAccount2.balance = 100000.0;
        rbsAccount2.deposit_amount(5000000);
        rbsAccount2.check_balance();
        rbsAccount2.withdraw_amount(49834);
    }
}
