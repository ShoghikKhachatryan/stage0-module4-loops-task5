package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int j, k, p;

        // first part
        for (int i = 0; i < height / 2; i++) {
            for (k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (j = i; j < height - k; j++) {
                System.out.print(8);
            }

            for (p = j; p < height; p++) {
                System.out.print(" ");
            }

            System.out.println();
        }


        // second part
        for (int i = (height % 2 != 0 ? (height / 2 + 1) : (height / 2) ); i > 0; i--) {
            for (k = 0; k < i - 1; k++) {
                System.out.print(" ");
            }

            for (j = i; j <= height - k; j++) {
                System.out.print(8);
            }

            for (p = j; p <= height; p++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}