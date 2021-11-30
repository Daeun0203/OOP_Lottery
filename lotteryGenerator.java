public class lotteryGenerator {
    public int[] GenerateLotteryNumbers(int totalNumbers, int lotteryNumbers) {
        int i, j;
        int[] random = new int[lotteryNumbers];
        for (i = 0; i < lotteryNumbers; i++) {
            random[i] = (int) Math.floor(Math.random() * totalNumbers + 1);
            for (j = 0; j < i; j++) {//檢查有無重覆
                if (random[i] == random[j]) {//有重覆重抽一次
                    i--;
                    break;
                }
            }
        }
        return random;
    }
}