package lld.battleship;

import lld.battleship.dto.BattleShip;
import lld.battleship.dto.Player;
import lld.battleship.repo.BattleShipRepo;
import lld.battleship.repo.CoordinateRepo;
import lld.battleship.repo.PlayerRepo;
import lld.battleship.repo.ShipRepo;
import lld.battleship.service.BattleShipService;
import lld.battleship.utils.GetRandomCoordinates;
import lld.battleship.utils.RandomInterface;

public class Client {
    public static void main(String[] args) {
        BattleShipRepo battleShipRepo = new BattleShipRepo();
        CoordinateRepo coordinateRepo = new CoordinateRepo();
        PlayerRepo playerRepo = new PlayerRepo();
        ShipRepo shipRepo = new ShipRepo();
        RandomInterface randomInterface = new GetRandomCoordinates();

        BattleShipService battleShipService = new BattleShipService(battleShipRepo,
                                            coordinateRepo,
                                            playerRepo,
                                            shipRepo,
                                            randomInterface);

        BattleShip battleShip =battleShipService.initialize(4);
        System.out.println(battleShip.getCoordinates());

        System.out.println(playerRepo.getPlayerMap());

        System.out.println(coordinateRepo.getCoordinateMap());

        battleShipService.startGame();
    }
}
