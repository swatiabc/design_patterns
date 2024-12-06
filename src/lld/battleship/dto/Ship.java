package lld.battleship.dto;

public class Ship {
    private String name;
    private int X, Y, size;
    private Player player;
    private boolean exploded;

    public Ship(String name, int x, int y, int size, Player player) {
        this.name = name;
        X = x;
        Y = y;
        this.size = size;
        this.player = player;
        this.exploded = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isExploded() {
        return exploded;
    }

    public void setExploded(boolean exploded) {
        this.exploded = exploded;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", X=" + X +
                ", Y=" + Y +
                ", size=" + size +
                ", player=" + player +
                ", exploded=" + exploded +
                '}';
    }
}
