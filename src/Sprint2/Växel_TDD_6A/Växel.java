package Sprint2.Växel_TDD_6A;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Växel {
    protected boolean test = false;
    private Scanner scan;
    static private final int[] valörerArray = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public int läsIndata(String prompt, String testData) {

        if (test)
            scan = new Scanner(testData);
        else
            scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(prompt);
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Felaktigt tal");
                scan.next();
            } catch (NoSuchElementException e) {
                System.out.println("Indata saknas");
                scan.next();
            } catch (Exception e) {
                System.out.println("Ospecificerat fel inträffade, försök igen");
                scan.next();
                e.printStackTrace();
            }
        }
    }

    public String felhantering(int växel) {
        if (växel == 0) {
            return ("Det blev ingen växel");
        } else if (växel < 0) {
            return ("Du lämnade för lite pengar");
        }
        return null;
    }

    public int beräknaVäxel(int betalt, int kostar) {
        return (betalt - kostar);
    }

    public int[] beräknaValörer(int summakvar) {
        int[] antalArray = new int[10];
        for (int i = 0; i < valörerArray.length; i++) {
            int valör = valörerArray[i];
            int antal = summakvar / valör;
            antalArray[i] = antal;
            summakvar = summakvar - antal * valör;
        }
        return antalArray;
    }

    public String skapaUtskrift(int[] antalArray) {
        StringBuilder utskrift = new StringBuilder();
        for (int i = 0; i < valörerArray.length; i++) {
            if (valörerArray[i] > 10)
                utskrift.append("Antal ").append(valörerArray[i]).append("-sedlar: ").append(antalArray[i]).append("\n");
            else
                utskrift.append("Antal ").append(valörerArray[i]).append("-kronor: ").append(antalArray[i]).append("\n");
        }
        return utskrift.toString();
    }

    public void huvudProgram() {
        int kostar = läsIndata("Vad kostade det? ", null);
        int betalt = läsIndata("Hur mycket betalde du? ", null);
        int växel = beräknaVäxel(betalt, kostar);

        if (växel <= 0) {
            System.out.println(felhantering(växel));
            System.exit(0);
        }
        System.out.println("Detta ska du får tillbaka:");
        System.out.println(skapaUtskrift(beräknaValörer(växel)));
    }

    public static void main(String[] args) {
        Växel växel = new Växel();
        växel.huvudProgram();
    }
}