public class Main {

    public static void main(String[] args) {
        int[] gas = new int[]{2, 3, 4};
        int[] cost = new int[]{3, 4, 3};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int lenght = gas.length, start = 0, myGas = 0, newi = 1, begin, newStart;


        for (int i = 0; i < lenght; i++) {
            if (gas[i] > cost[i]) {
                start = i;
                begin = i;
                myGas = gas[i];
                break;
            }
        }

        for (int i = 0; i < lenght; i++) {
            if (start + i + 1 < lenght) {
                myGas = myGas - cost[start] + gas[start + i + 1];
                start++;
            } else {
                if (start + i + 1 == lenght) {

                } else if (start + i + 1 > lenght) {

                }
            }

        }


        return 0;
    }

}