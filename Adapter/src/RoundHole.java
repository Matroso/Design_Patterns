public class RoundHole {
    private int radius;
    public RoundHole(int radius) {
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public boolean fits(RoundPeg peg){
        System.out.println(getRadius() >= peg.getRadius());
        return getRadius() >= peg.getRadius();
    }
}
