public class Main {

    public static void main(String[] args) {
        int[] gas = new int[]{0, 0, 0, 0, 2, 0};
        int[] cost = new int[]{0, 0, 0, 0, 1, 0};

        int index = canCompleteCircuit(gas, cost);
        System.out.println(index);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int index = -1, myFuelOil, jj, donulen;

        for (int i = 0; i < length; i++) {

            if (gas[i] > cost[i]) {

                index = i;
                myFuelOil = gas[i];
                donulen = 0;

                for (int j = 0; j < length; j++) {
                    donulen++;
                    jj = (j + i) % length;

                    myFuelOil = myFuelOil - cost[jj] + gas[(jj + 1) % length];

                    if (myFuelOil == cost[(jj + 1) % length]) {
                        if ((jj + 2) % length == i) {
                            index = i;
                            return index;
                        }
                    } else if (myFuelOil < cost[(jj + 1) % length]) {
                        index = -1;
                        break;
                    }
                }

                if (donulen == gas.length) {
                    return index;
                }

            } else if (gas[i] == cost[i]) {
                if (length == 1) {
                    return i;
                }
                if (gas[i] > cost[i]) {
                    index = i;
                }
            }
        }

        return index;

    }

}