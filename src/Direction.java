public enum Direction {
  //enum for direction
  NORTH (0,1),
  SOUTH (0,-1),
  EAST( -1,0),
  WEST(1,0);

  private final int x;
  private final int y;
//getter
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
//constructeur
  Direction(int x, int y){
    this.x=x;
    this.y=y;
  }
}
