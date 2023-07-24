package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        // 88888
        //  888
        //   8
        //  888
        // 88888

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print("8");
                } else if ((j >= i && j < height - i) || j <= i && j >= height - i - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
