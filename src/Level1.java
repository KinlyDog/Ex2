public class Level1 {
    public static int SumOfThe(int n, int[] data) {
        int otherNumbersSum = -1;

        for (int i = 0; i < n; i++) {
            int t = 0;
            otherNumbersSum = 0;

            while (t < n) {
                if (i == t) {
                    t++;
                    continue;
                }

                otherNumbersSum += data[t];
                t++;
            }

            if (otherNumbersSum == data[i]) {
                return otherNumbersSum;
            }
        }

        return otherNumbersSum;
    }
}
