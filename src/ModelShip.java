public enum ModelShip {
  // enum for ship type with features

  CARRIER(5),
  SUBMARINE(2),
  DESTROYER(3),
  CRUISER(4);

  private final int length;
  //methode
  public int getSize() {
    return this.length;
  }
//constructeur
  ModelShip(int length){
    this.length=length;
  }
}
