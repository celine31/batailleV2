import java.util.ArrayList;

public class HiddingBoard {

private ArrayList fleet;

  private void placeShip (Ship ship){
    if (!fleet.contains(ship)) {
      fleet.add(ship);
    }
  }
}
