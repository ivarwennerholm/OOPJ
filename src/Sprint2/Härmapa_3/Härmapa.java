package Sprint2.Härmapa_3;

import java.util.Scanner;

public class Härmapa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Skriv in din rad: ");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.exit(0);
            } else {
                System.out.println("Du skrev: " + input);
            }
        }
    }
}