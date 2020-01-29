
import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

  @org.junit.jupiter.api.Test
  void isOnPlot() {
    Plot plot= new BoardPlot(2,2);
    Ship ship=new Ship(ModelShip.CARRIER,Direction.NORTH, plot);
    Plot plot2 = new BoardPlot(4,5);
    assertTrue(ship.isOnPlot(plot),"True");
    assertFalse(ship.isOnPlot(plot2),"False");

  }
}
