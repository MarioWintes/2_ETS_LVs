package lv1_interfaces;

import java.util.Arrays;

public class HighScoreDemo {

    public static void main(String[] args) {

        HighScore[] highScores = {
                new HighScore("Max", 100.2),
                new HighScore("Max", 250),
                new HighScore("Max", 23.9)
        };

        System.out.println(Arrays.toString(highScores));
        Arrays.sort(highScores);
        System.out.println(Arrays.toString(highScores));


    }
}
