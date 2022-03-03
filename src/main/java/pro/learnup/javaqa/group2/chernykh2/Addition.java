package pro.learnup.javaqa.group2.chernykh2;

import java.util.Arrays;

public class Addition {


    private static int maxSpeed = 7;

    public static int droppedOut(int[] speeds) {
        int start = 0;
        for (int speed : speeds) {
            if (speed > maxSpeed) {
                start++;
            }
        }
        return start;
    }

    public static int[] speedDroppedOut(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (speed > maxSpeed) {
                cnt++;
            }
        }
        int[] second = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (speed > maxSpeed) {
                second[i] = speed;
                i++;
            }
        }
        return second;
    }

    public static int[] speedStayedIn(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (speed <= maxSpeed) {
                cnt++;
            }
        }
        int[] third = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (speed <= maxSpeed) {
                third[i] = speed;
                i++;
            }
        }
        return third;
    }


}


