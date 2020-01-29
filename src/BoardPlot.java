import java.util.Objects;

public class BoardPlot implements Plot {
  private int abcisse;
  private int ordonnee;

  public BoardPlot(int abscisse, int ordonnee) {
    this.abcisse = abscisse;
    this.ordonnee = ordonnee;
  }

  @Override
  public int getAbscisse() {
  return abcisse;
  }

  @Override
  public int getOrdinate(){
    return ordonnee;
  }

  @Override
  public Plot getPlotTo(Direction dir) {
    int nextAbscisse= abcisse;
    int nextOrdonnee= ordonnee;

    if (dir==Direction.SOUTH){
      nextOrdonnee--;
    }
    if(dir==Direction.NORTH){
      nextOrdonnee++;
    }
    if (dir==Direction.EAST){
      nextAbscisse++;
    }
    if(dir==Direction.WEST){
      nextAbscisse--;
    }
    Plot plot=new BoardPlot(nextAbscisse, nextOrdonnee);
    return plot;

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BoardPlot boardPlot = (BoardPlot) o;
    return abcisse == boardPlot.abcisse &&
      ordonnee == boardPlot.ordonnee;
  }

  @Override
  public int hashCode() {
    return Objects.hash(abcisse, ordonnee);
  }

  @Override
  public String toString() {
    return "BoardPlot{" +
      "abcisse=" + abcisse +
      ", ordonnee=" + ordonnee +
      '}';
  }
}
