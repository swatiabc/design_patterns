package lld.battleship.repo;

import lld.battleship.dto.Player;
import lld.battleship.dto.Ship;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShipRepo {
    Map<String, Ship> shipMap;

    public ShipRepo() {
        shipMap = new ConcurrentHashMap<>();
    }

    public Map<String, Ship> getShipMap() {
        return shipMap;
    }

    public void addShip(String name, int x, int y, int size, Player player) {
        Ship ship = new Ship(name, x, y, size, player);
        shipMap.put(name, ship);
    }

    public void addExploded(String shipName) {
        Ship ship = shipMap.get(shipName);
        ship.setExploded(true);
    }
}
