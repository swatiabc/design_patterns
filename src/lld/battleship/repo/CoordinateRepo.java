package lld.battleship.repo;

import lld.battleship.dto.BattleShip;
import lld.battleship.dto.Coordinate;
import lld.battleship.dto.Player;
import lld.battleship.dto.Ship;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CoordinateRepo {
    Map<Integer, Coordinate> coordinateMap;
    AtomicInteger primaryKeyGenerator = new AtomicInteger(0);

    public CoordinateRepo() {
        coordinateMap = new ConcurrentHashMap<>();
    }

    public Map<Integer, Coordinate> getCoordinateMap() {
        return coordinateMap;
    }

    public Coordinate addCoordinates(int x, int y, BattleShip battleShip) {
        int primaryKey = primaryKeyGenerator.incrementAndGet();
        Coordinate coordinate = new Coordinate(primaryKey,x, y, battleShip);
        coordinateMap.put(primaryKey, coordinate);
        return coordinate;
    }

    public void addPlayer(int coordinateID, Player player) {
        Coordinate coordinate = coordinateMap.get(coordinateID);
        coordinate.setPlayer(player);
    }

    public void addShip(int coordinateID, Ship ship) {
        Coordinate coordinate = coordinateMap.get(coordinateID);
        coordinate.setShip(ship);
    }

    public void attackCoordinate(int coordinateID) {
        Coordinate coordinate = coordinateMap.get(coordinateID);
        coordinate.setAttacked(true);
    }
}
