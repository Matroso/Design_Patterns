public class Manual {
    String start = "";
    String seats = "";
    String engine = "";
    String tripComputer = "";
    String GPS = "";
    String finish = "";

    @Override
    public String toString() {
        return start + "\n" +
                seats +  "\n" +
                engine +  "\n" +
                tripComputer + "\n" +
                GPS + "\n\n" +
                finish;
    }
}
