public class Segment {
    int x,y;

    public Segment(int extX, int extY){
        this.x = extX;
        this.y = extY;
    }
    public int longueur(){
        if (x < y) {
            return y - x;
        } else {
            return  x - y;
        }
    }
    public String toString(){
        return "Segment [" + x + "], ["+y+"]";
    }
}
