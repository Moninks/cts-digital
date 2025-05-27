interface Playable {
    void play();
}

class StringInstrument implements Playable {
    public void play() {
        System.out.println("Strumming the guitar.");
    }
}

class KeyboardInstrument implements Playable {
    public void play() {
        System.out.println("Playing the piano.");
    }
}

public class InstrumentDemo {
    public static void main(String[] args) {
        Playable guitar = new StringInstrument();
        Playable piano = new KeyboardInstrument();

        guitar.play();
        piano.play();
    }
}
