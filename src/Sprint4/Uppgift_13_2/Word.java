package Sprint4.Uppgift_13_2;

public class Word {
    private int length;
    private int count = 1;

    protected Word (int length) {
        this.length = length;
    }

    protected int getLength() {
        return this.length;
    }

    protected int getCount() {
        return this.count;
    }

    protected void addCount() {
        this.count++;
    }

    /* @Override
    public int compareTo(Word other) {
        //return Integer.compare(this.length, other.length);
        return this.length - other.length;
    } */
}
