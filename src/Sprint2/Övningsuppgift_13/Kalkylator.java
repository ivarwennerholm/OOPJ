package Sprint2.Övningsuppgift_13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Kalkylator {
    private int förstaOperand, andraOperand;
    private char operator;
    private boolean test;
    private Scanner scan;

    private String raden;

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    Kalkylator(boolean test) {
        this.test = test;
    }

    public static void main(String[] args) throws OperatorNotSupportedException {
        Kalkylator kalk = new Kalkylator(false);
        kalk.prompt();
        kalk.skapaScanner(null);
        kalk.läsInFörstaOperand();
        kalk.läsInOperator();
        kalk.läsInAndraOperand();
        System.out.println("Resultat: " + kalk.decimalFormat.format(kalk.beräkning()).replace(',', '.'));
    }

    public int läsInFörstaOperand() throws InputMismatchException {
        if (scan.hasNextInt()) {
            förstaOperand = scan.nextInt();
        } else
            throw new InputMismatchException();
        return förstaOperand;
    }

    public char läsInOperator() throws OperatorNotSupportedException {
        String operatorString = scan.next().trim();
        operator = operatorString.charAt(0);
        if (!(operator == '-' || operator == '+' || operator == '/' || operator == '*')) {
            System.out.println("OperatorNotSupportedException");
            throw new OperatorNotSupportedException();
        }
        return operator;
    }

    public int läsInAndraOperand() throws InputMismatchException {
        if (scan.hasNextInt())
            andraOperand = scan.nextInt();
        else
            throw new InputMismatchException();
        return andraOperand;
    }

    public void skapaScanner(String optional) {
        if (test) {
            scan = new Scanner(optional);
        } else {
            scan = new Scanner(System.in);
        }
        raden = scan.nextLine();
        scan = new Scanner(raden);
    }

    public double beräkning() {
        double resultat = 0;
        switch (operator) {
            case '+':
                resultat = (förstaOperand + andraOperand);
                break;
            case '-':
                resultat = (förstaOperand - andraOperand);
                break;
            case '/':
                resultat = ((double) förstaOperand / andraOperand);
                break;
            case '*':
                resultat = (förstaOperand * andraOperand);
                break;
        }
        return resultat;
    }

    public void prompt() {
        System.out.print("Skriv in din beräknaing: ");
    }

    public String getRaden() {
        return this.raden;
    }
}
