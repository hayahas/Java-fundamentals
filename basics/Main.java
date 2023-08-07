import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int dogCount = 3;
        pluralize("dog", dogCount);
        flipNHeads(2);
        clock();
    }

    static void pluralize(String s, int x) {
        if (x == 0 || x > 1)
            s = s + 's';
        System.out.println("I own " + x + " " + s + ".");
    }

    static void flipNHeads(int x) {
        int head = 0;
        int flips = 0;
        while (head < x) {
            double random = Math.random();
            if (random >= 0.5) {
                flips++;
                head++;
                System.out.println("head");
            } else {
                System.out.println("tail");
                head = 0;
            }
        }
        if (head == x) {
            System.out.println("It took " + flips + " flips to get " + x + " head in a row ");
        }

    }

    static void clock() {

        long startTime = System.currentTimeMillis();
        int iterations = 0;
        try {
             while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.print(formattedTime);
            iterations++;
            Thread.sleep(1000);

            long time = System.currentTimeMillis();
            double elapsedTimeInSeconds = (time - startTime) / 1000.0;
            double frequency = (iterations / elapsedTimeInSeconds) / 1000000.0;
            ;
            System.out.printf(" %.2f MHz\n", frequency);
        }
        } catch (Exception e) {
            
        }
       

    }

}