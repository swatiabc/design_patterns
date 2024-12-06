package lld.battleship.utils;

import lld.battleship.dto.Coordinate;

import java.util.ArrayList;

public interface RandomInterface {
     void shuffle();
     ArrayList<Integer> getCoordinates();
    public void setCoordinates(ArrayList<Integer> coordinates);
}
