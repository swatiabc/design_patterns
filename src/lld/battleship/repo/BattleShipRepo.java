package lld.battleship.repo;

import lld.battleship.dto.BattleShip;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class BattleShipRepo {
    Map<Integer, BattleShip> battleShipMap;
    AtomicInteger primaryKeyGenerator = new AtomicInteger(0);

    public BattleShipRepo() {
        battleShipMap = new ConcurrentHashMap<>();
    }

    public BattleShip createBattleShip(int N) {
        int primaryKey = primaryKeyGenerator.incrementAndGet();
        BattleShip battleShip = new BattleShip(primaryKey, N);
        battleShipMap.put(primaryKey, battleShip);
        return battleShip;
    }

    public Map<Integer, BattleShip> getBattleShipMap() {
        return battleShipMap;
    }

    public void addCoordinates(Integer battleShipID, Integer coordinateID) {
        BattleShip battleShip = battleShipMap.get(battleShipID);
        ArrayList<Integer> coordinates = battleShip.getCoordinates();
        coordinates.add(coordinateID);
    }
}
