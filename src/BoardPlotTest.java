import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardPlotTest {

  @Test
  void getPlotTo() throws Exception{
    BoardPlot plot= new BoardPlot(4,1);
    //test north
    final Plot newPlot = plot.getPlotTo(Direction.NORTH);
    assertEquals(4 ,newPlot.getAbscisse());
    assertEquals(2 ,newPlot.getOrdinate());

    //test south
    final Plot newPlot2 = plot.getPlotTo(Direction.SOUTH);
    assertEquals(4 ,newPlot2.getAbscisse());
    assertEquals(0 ,newPlot2.getOrdinate());

    //test west
    final Plot newPlot3 = plot.getPlotTo(Direction.WEST);
    assertEquals(3 ,newPlot3.getAbscisse());
    assertEquals(1 ,newPlot3.getOrdinate());

    final Plot newPlot4 = plot.getPlotTo(Direction.EAST);
    assertEquals(5 ,newPlot4.getAbscisse());
    assertEquals(1 ,newPlot4.getOrdinate());
  }



}
