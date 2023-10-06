package Sprint1.Bankomaten_10;

public class Personal {
    private String namn;
    private int lön;

    Personal(String namn, int lön) {
        this.namn = namn;
        this.lön = lön;
    }

    String getNamn() {
        return namn;
    }

    void setNamn(String namn) {
        this.namn = namn;
    }

    int getLön() {
        return lön;
    }

    public void setLön(int lön) {
        this.lön = lön;
    }
}
