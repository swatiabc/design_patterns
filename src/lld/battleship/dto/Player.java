package lld.battleship.dto;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Integer> coordinates;
    private ArrayList<Integer> ships;

    public Player(String name) {
        this.name = name;
        coordinates = new ArrayList<>();
        ships = new ArrayList<>();
    }


    public ArrayList<Integer> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Integer> coordinates) {
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Integer> ships) {
        this.ships = ships;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", ships=" + ships +
                '}';
    }
}
