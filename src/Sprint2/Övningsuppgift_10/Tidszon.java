package Sprint2.Övningsuppgift_10;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tidszon {

    Instant nu;
    ZoneId toronto = ZoneId.of("America/Toronto");
    ZoneId shanghai = ZoneId.of("Asia/Shanghai");
    ZoneId stockholm = ZoneId.of("Europe/Stockholm");
    ZonedDateTime torontoZonedDateTime, shanghaiZonedDateTime, stockholmZonedDateTime;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Tidszon tidszon = new Tidszon();
        tidszon.skapaLokalDatumTid();
        System.out.println(tidszon.val());


    }

    public void skapaLokalDatumTid() {
        nu = Instant.now();
        torontoZonedDateTime = nu.atZone(toronto);
        shanghaiZonedDateTime = nu.atZone(shanghai);
        stockholmZonedDateTime = nu.atZone(stockholm);
    }

    public String val() {
        System.out.print("Vilken stad vill du visa tid för (skriv 'avsluta' för att avsluta programmet): ");
        String output = null;
        boolean fortsätt = true;
        while (fortsätt) {
            String input = scan.nextLine().trim().toLowerCase();
            switch (input) {
                case "stockholm":
                    output = (stockholmZonedDateTime.format(format));
                    fortsätt = false;
                    break;
                case "toronto":
                    output = (torontoZonedDateTime.format(format));
                    fortsätt = false;
                    break;
                case "shanghai":
                    output = (shanghaiZonedDateTime.format(format));
                    fortsätt = false;
                    break;
                case "avsluta":
                    fortsätt = false;
                    System.exit(0);
                default:
                    System.out.print("Staden finns inte i vårt register, försök igen: ");
            }
        }
        return output;
    }
}
