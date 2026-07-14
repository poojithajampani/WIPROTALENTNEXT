import java.util.Random;

public class TestInstrument {

    public static void main(String[] args) {

        Instrument[] ins = new Instrument[10];
        Random r = new Random();

        // Assign random instruments
        for (int i = 0; i < ins.length; i++) {

            int n = r.nextInt(3) + 1;

            switch (n) {
                case 1:
                    ins[i] = new Piano();
                    break;

                case 2:
                    ins[i] = new Flute();
                    break;

                case 3:
                    ins[i] = new Guitar();
                    break;
            }
        }

        // Display instrument and play
        for (int i = 0; i < ins.length; i++) {

            System.out.print("Index " + i + ": ");

            if (ins[i] instanceof Piano)
                System.out.print("Piano - ");

            else if (ins[i] instanceof Flute)
                System.out.print("Flute - ");

            else if (ins[i] instanceof Guitar)
                System.out.print("Guitar - ");

            ins[i].play();
        }
    }
}
