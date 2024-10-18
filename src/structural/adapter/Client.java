package structural.adapter;

public class Client {
    public void main() {
        RoundPeg roundPeg = new RoundPeg(10);
        RoundHole roundHole = new RoundHole(9);
        roundHole.fits(roundPeg);

        SquarePeg squarePeg = new SquarePeg(2);
        // error: roundHole.fits(squarePeg)

        SqrToRoundAdaptor sqrToRoundAdaptor = new SqrToRoundAdaptor(squarePeg);
        roundHole.fits(sqrToRoundAdaptor);
    }
}
