class RaceThread extends Thread {

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i <= 100; i++) {

                System.out.println(getName() + " : " + i + " meters");

                // Hare sleeps after reaching 60 meters
                if (getName().equals("Hare") && i == 60) {

                    System.out.println("\nHare is sleeping for 1000 milliseconds...\n");

                    Thread.sleep(1000);

                }

            }

            System.out.println("\n" + getName() + " wins the race!\n");

        } catch (InterruptedException e) {

            System.out.println(e);

        }

    }

}

public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        // Step 2: Hare gets higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Hare Priority : " + hare.getPriority());
        System.out.println("Tortoise Priority : " + tortoise.getPriority());

        hare.start();
        tortoise.start();

    }

}
