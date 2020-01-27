import java.util.ArrayList;

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

  public ArrayList getListPlot() {
    return listPlot;
  }

  public void setListPlot(ArrayList listPlot) {
    this.listPlot = listPlot;
  }

  //
  private ModelShip model;
  private Direction direction;
  private Plot plot;
  private ArrayList listPlot;

  //constructeur
  Ship(ModelShip model, Direction direction, Plot plot) {
    this.model = model;
    this.direction = direction;
    this.plot = plot;

  }
  //methode
  //TODO
  public boolean isOnPlot(Plot plot){
    return true;
  }


}
