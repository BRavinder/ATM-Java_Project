import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    

    private int custemerNumber;
    private int pinNumber;
    private double checkingBalence = 0;
    private double savingBalence = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustemerNumber(int custemerNumber) {
        this.custemerNumber = custemerNumber;
        return custemerNumber;
    }
    public int getCustemerNumber() {
        return custemerNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalence() {
        return checkingBalence;
    }
    public double getSavingBalence() {
        return savingBalence;
    }

    public double calcCheckingWithdraw(double amount) {
        checkingBalence = (checkingBalence - amount);
        return checkingBalence;
    }

    public double calcSavingingWithdraw(double amount) {
        savingBalence = (savingBalence - amount);
        return savingBalence;
    }
    
    public double calcCheckingDeposit(double amount) {
        checkingBalence = (checkingBalence + amount);
        return checkingBalence;
    }

    public double calcSavingDeposit(double amount) {
        savingBalence = (savingBalence + amount);
        return savingBalence;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalence));
        System.out.println("Amount You want to withdraw from checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalence - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balence: " + moneyFormat.format(checkingBalence));
        } else {
            System.out.println("Balence Cannot be Nagative. " + "\n");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balence: " + moneyFormat.format(savingBalence));
        System.out.println("Amount You want to Wthdraw from saving Account");
        double amount = input.nextDouble();

        if((savingBalence - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New saving Account Balence:" + moneyFormat.format(savingBalence));
        } else {
            System.out.println("Balence Cannot be Nagitive." + "\n");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalence));
        System.out.println("Amount You want to Deposit from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalence + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balence: " + moneyFormat.format(checkingBalence));
        } else {
            System.out.println("Balence Cannot be Nagitive." + "\n");
        }
    }

    public void getSavingDepositInput() {
        System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalence));
        System.out.println("Amount You want to Deposit from Saving Account: ");
        double amount = input.nextDouble();

        if((checkingBalence + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balence: " + moneyFormat.format(checkingBalence));
        } else {
            System.out.println("Balence Cannot be Nagitive." + "\n");
        }
    }
}
