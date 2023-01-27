public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar();
        instruments[1] = new Drum("124");
        instruments[2] = new Trumpet();

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}