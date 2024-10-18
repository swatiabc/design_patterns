package structural.adapter;

public class RoundHole {
    private int r;
    public RoundHole() {}

    public RoundHole(int r) {
        this.r = r;
    }

    public int getRadious() {
        return r;
    }

    public boolean fits(RoundPeg roundPeg) {
        return roundPeg.getRadious() >= r;
    }

}
