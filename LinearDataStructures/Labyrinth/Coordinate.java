package Labyrinth;

public class Coordinate {
    private int x;
    private int y;
    
    Coordinate(){
        this(0, 0);
    }
    
    Coordinate(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
