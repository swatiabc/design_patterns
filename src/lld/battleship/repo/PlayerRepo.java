package lld.battleship.repo;

import lld.battleship.dto.Player;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class PlayerRepo {
    Map<String, Player> playerMap;

    public PlayerRepo() {
        playerMap = new ConcurrentHashMap<>();
    }

    public Map<String, Player> getPlayerMap() {
        return playerMap;
    }

    public Player addPlayer(String name) {
        Player player = new Player(name);
        playerMap.put(name, player);
        return player;
    }

    public void addCoordinates(int coordinateID, String playerName) {
        Player player = playerMap.get(playerName);
        ArrayList<Integer> coordinates = player.getCoordinates();
        coordinates.add(coordinateID);
    }

    public void addShips(int shipID, String playerName) {
        Player player = playerMap.get(playerName);
        ArrayList<Integer> ships = player.getShips();
        ships.add(shipID);
    }
}
