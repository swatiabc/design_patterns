package lld.battleship.dto;

public class Coordinate {
    private int ID, X, Y;
    private Player player;
    private Ship ship;
    private BattleShip battleShip;
    private boolean attacked;

    public Coordinate(int ID, int x, int y, BattleShip battleShip) {
        this.ID = ID;
        X = x;
        Y = y;
        this.player = null;
        this.ship = null;
        this.battleShip = battleShip;
        this.attacked = false;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public BattleShip getBattleShip() {
        return battleShip;
    }

    public void setBattleShip(BattleShip battleShip) {
        this.battleShip = battleShip;
    }

    public boolean isAttacked() {
        return attacked;
    }

    public void setAttacked(boolean attacked) {
        this.attacked = attacked;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "ID=" + ID +
                ", X=" + X +
                ", Y=" + Y +
                ", player=" + player +
                ", ship=" + ship +
                ", battleShip=" + battleShip +
                ", attacked=" + attacked +
                '}';
    }
}
