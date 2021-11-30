import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int totalNumbers, lotteryNumbers;
    Scanner sc = new Scanner(System.in);
    while(true) {
      totalNumbers = sc.nextInt();
      lotteryNumbers = sc.nextInt();
      if (totalNumbers < lotteryNumbers) {
        System.out.println("重新輸入");
          }else {
            break;
          }
    }
    lotteryGenerator lottery1 = new lotteryGenerator();
    int[] random = lottery1.GenerateLotteryNumbers(totalNumbers, lotteryNumbers);
    int i;
    for (i = 0; i < lotteryNumbers; i++) {
      System.out.print(random[i] + " ");
    }
  }
}
