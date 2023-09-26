package Sprint1.HederligeHarryDel1;

public class Main {
    public static void main(String[] args) {
        FordonsAnnons fordonsAnnons = new FordonsAnnons(75000, 2015, 10000, "Fin MBW X5", "En perfekt bil för den aktiva familjen.");
        System.out.println(fordonsAnnons.getAnnonsText());
        BilAnnons bilAnnons = new BilAnnons(100000, 2021, 5000, "Sportig Mazda Z88", "Det självklara valet för den fartsugne.", "blå", true, true);
        System.out.println(bilAnnons.getAnnonstext());
        HusvagnsAnnons HusvagnsAnnons = new HusvagnsAnnons(200000, 2018, 7500, "Rymlig Winnabego AP181", "Ditt bekväma hem i vildmarken.", true, 5);
        System.out.println(HusvagnsAnnons.getAnnonstext());
        MotorcykelAnnons motorcykelAnnons = new MotorcykelAnnons(50000, 2009, 12500, "Körglad Triumph Bonneville", "Brittisk cruiser i toppskick.", 800, "kardan");
        System.out.println(motorcykelAnnons.getAnnonsText());
    }
}
