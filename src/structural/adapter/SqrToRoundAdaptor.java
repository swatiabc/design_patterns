package structural.adapter;

public class SqrToRoundAdaptor extends RoundPeg {
    private SquarePeg squarePeg;
    public SqrToRoundAdaptor() {}

    public SqrToRoundAdaptor(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public int getRadious() {
        return squarePeg.getSide()*2;
    }
}
