package structural.adapter;

public class Client {
    public void main() {
        RoundPeg roundPeg = new RoundPeg(10);
        SquarePeg squarePeg = new SquarePeg(2);
        // error: roundHole.fits(squarePeg)

        SqrToRoundAdaptor sqrToRoundAdaptor = new SqrToRoundAdaptor(squarePeg);

        RoundHole roundHole = new RoundHole(9);
        roundHole.fits(roundPeg);
        roundHole.fits(sqrToRoundAdaptor);

    }
}
