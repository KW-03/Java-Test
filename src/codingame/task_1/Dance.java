package codingame.task_1;

class Algorithm {
    static int getPositionAt(int n) {
        int stepOne = 1;
        int stepTwo = -2;
        int resultStep = 0;
        int nextStep = 0;

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                resultStep = resultStep + stepOne;
            }
            else if(i == 1) {
                resultStep = resultStep + stepTwo;
            }
            else {
                nextStep = stepTwo - stepOne;
                resultStep = resultStep + nextStep;
                stepOne = stepTwo;
                stepTwo = nextStep;
            }
        }

        return resultStep;
    }
}

public class Dance {
    public static void main(String[] args) {
        System.out.println(Algorithm.getPositionAt(3)); // -4
        System.out.println(Algorithm.getPositionAt(100000)); // -5
        System.out.println(Algorithm.getPositionAt(2147483647)); // 1
    }
}
