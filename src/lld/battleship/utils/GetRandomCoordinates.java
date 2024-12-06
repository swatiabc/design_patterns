package lld.battleship.utils;

import java.util.ArrayList;
import java.util.Collections;

public class GetRandomCoordinates implements  RandomInterface{
    private ArrayList<Integer> coordinates;

    public GetRandomCoordinates() {
        this.coordinates = new ArrayList<>();
    }

    public void setCoordinates(ArrayList<Integer> coordinates) {
        this.coordinates = coordinates;
    }

    public void shuffle() {
        Collections.shuffle(coordinates);
    }

    public ArrayList<Integer> getCoordinates() {
        return coordinates;
    }
}
