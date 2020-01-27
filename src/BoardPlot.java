public class BoardPlot implements Plot {
  private int x;
  private int y;

  @Override
  public int getAbscisse() {
  return x;
  }

  @Override
  public int getOrdinate()
  {
    return y;
  }

  @Override
  public Plot getPlotTo(Direction dir) {
    throw new UnsupportedOperationException();
  }
}
