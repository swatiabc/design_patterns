package lld.battleship.dto;

import java.util.ArrayList;


public class BattleShip {
    private int ID;
    private int N;
    private ArrayList<Integer> coordinates;

    public BattleShip(int ID, int N) {
        this.ID = ID;
        this.N = N;
        coordinates = new ArrayList<>();
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public ArrayList<Integer> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Integer> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "BattleShip{" +
                "ID=" + ID +
                ", N=" + N +
                ", coordinates=" + coordinates +
                '}';
    }
}
