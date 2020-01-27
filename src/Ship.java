import java.util.ArrayList;
import java.util.List;

public class Ship {
  //getter et setter
  public ModelShip getModel() {
    return model;
  }

  public void setModel(ModelShip model) {
    this.model = model;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public Plot getPlot() {
    return plot;
  }

  public void setPlot(Plot plot) {
    this.plot = plot;
  }

  public List getPlotList() {
    return plotList;
  }

  public void setPlotList(ArrayList plotList) {
    this.plotList = plotList;
  }

  //
  private ModelShip model;
  private Direction direction;
  private Plot plot;
  private List<Plot> plotList;

  //constructeur
  Ship(ModelShip model, Direction direction, Plot plot) {
    this.model = model;
    this.direction = direction;
    this.plot = plot;

    // init liste de cases
    plotList = new ArrayList<Plot>();
    //premiere case
    plotList.add(plot);

    // Pour toute la taille du bateau, calculer les cases suivantes
    // boucle sur la taille du bateau, et calculer la nouvelle case en fonction de la précedente

  }
  //methode
  //TODO
  public boolean isOnPlot(Plot plot){
    throw new UnsupportedOperationException();
  }


}
