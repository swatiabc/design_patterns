package lld.battleship.service;

import lld.battleship.dto.BattleShip;
import lld.battleship.dto.Coordinate;
import lld.battleship.dto.Player;
import lld.battleship.dto.Ship;
import lld.battleship.repo.BattleShipRepo;
import lld.battleship.repo.CoordinateRepo;
import lld.battleship.repo.PlayerRepo;
import lld.battleship.repo.ShipRepo;
import lld.battleship.utils.RandomInterface;

import java.util.*;

public class BattleShipService {
    BattleShipRepo battleShipRepo;
    CoordinateRepo coordinateRepo;
    PlayerRepo playerRepo;
    ShipRepo shipRepo;
    RandomInterface randomInterface;

    public BattleShipService(BattleShipRepo battleShipRepo,
                            CoordinateRepo coordinateRepo,
                            PlayerRepo playerRepo,
                            ShipRepo shipRepo,
                             RandomInterface randomInterface) {
        this.battleShipRepo = battleShipRepo;
        this.coordinateRepo = coordinateRepo;
        this.playerRepo = playerRepo;
        this.shipRepo = shipRepo;
        this.randomInterface = randomInterface;
    }

    public BattleShip initialize(int N) {
        BattleShip battleShip = battleShipRepo.createBattleShip(N);
        Player player1 = playerRepo.addPlayer("player1");
        Player player2 = playerRepo.addPlayer("player2");

        for(int i =0;i <N;i++) {
            for(int j=0;j<(N/2); j++) {
                Coordinate coordinate = coordinateRepo.addCoordinates(i, j, battleShip);
                battleShipRepo.addCoordinates(battleShip.getID(), coordinate.getID());
                playerRepo.addCoordinates(coordinate.getID(), player1.getName());
                coordinateRepo.addPlayer(coordinate.getID(), player1);
            }
        }

        for(int i =0;i <N;i++) {
            for(int j=N/2; j<N; j++) {
                Coordinate coordinate = coordinateRepo.addCoordinates(i, j, battleShip);
                battleShipRepo.addCoordinates(battleShip.getID(), coordinate.getID());
                playerRepo.addCoordinates(coordinate.getID(), player2.getName());
                coordinateRepo.addPlayer(coordinate.getID(), player2);
            }
        }

        return battleShip;
    }

    public void startGame() {
        Player player1 = playerRepo.getPlayerMap().get("player1");
        Player player2 =  playerRepo.getPlayerMap().get("player2");

        ArrayList<Integer> player1Coord = (ArrayList<Integer>) player1.getCoordinates().clone();
        ArrayList<Integer> player2Coord = (ArrayList<Integer>) player2.getCoordinates().clone();

        Deque<Player> players = new ArrayDeque<>();
        players.addLast(player1);
        players.addLast(player2);

        while(!players.isEmpty()) {
            Player player = players.removeFirst();

            if(Objects.equals(player1.getName(), player.getName())) {
                randomInterface.setCoordinates(player1Coord);
            }

            else {
                randomInterface.setCoordinates(player2Coord);
            }
            ArrayList<Integer> shuffledCoords = randomInterface.getCoordinates();

            if (shuffledCoords.isEmpty()) {
                System.out.println(player + " lost");
                return;
            }

            Coordinate coordinate = coordinateRepo.getCoordinateMap().get(shuffledCoords.removeFirst());

            coordinateRepo.attackCoordinate(coordinate.getID());

            Ship ship = coordinate.getShip();

            if(ship != null) {
                shipRepo.addExploded(ship.getName());
            }

            System.out.println(player + " "+ coordinate+" "+ ship +" "+shuffledCoords);
            players.addLast(player);
        }
    }
}
