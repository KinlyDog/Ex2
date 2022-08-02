public class Level1 {
    public static int SumOfThe(int n, int[] data) {
        int ret = -1;

        for (int i = 0; i < n; i++) {
            int t = 0;
            int sum = 0;

            while (t < n) {
                if (i == t) {
                    t++;
                    continue;
                }

                sum += data[t];
                t++;
            }

            if (sum == data[i]) {
                ret = sum;
                break;
            }
        }

        return ret;
    }
}
