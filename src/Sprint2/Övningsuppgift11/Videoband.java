package Sprint2.Övningsuppgift11;

public class Videoband {
    private int bandetsLängd, minuterKvar;

    public Videoband(int bandetsLängd) {
        this.bandetsLängd = bandetsLängd;
    }

    public void inspelatPåBand(int minuter) {
        minuterKvar = bandetsLängd - minuter;
    }

    public int getBandetsLängd() {
        return bandetsLängd;
    }

    public int getMinuterKvar() {
        return minuterKvar;
    }
}
