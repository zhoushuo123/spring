package zs.java.basics;

import java.util.Scanner;

/**
 * 从N个数值中抽取K个数
 *
 * @author zs
 */

public class SynthesisTrain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;//总数
        int number = 0;//个数
        int i = 0;//记录输入次数
        do {
            i++;
            if (i >= 2) {
                System.out.println("输入的总数sum小于抽取的个数，请重新输入:");
                if (i == 5) {
                    System.out.println("错误次数太多，程序退出");
                    break;
                }
            }
            System.out.println("需要从多少个数值中抽取");
            sum = scanner.nextInt();

            System.out.println("需要抽取多少个数值");
            number = scanner.nextInt();
        } while (sum < number);

        int[] arraySum = new int[sum];
        for (int j = 0; j < arraySum.length; j++) {
            arraySum[j] = j + 1;
        }
        int[] arrayNum = new int[number];
        System.out.printf("从%d中随机抽取%d个数据的一组数据是:", sum, number);
        for (int k = 0; k < arrayNum.length; k++) {
            int randomNum = (int) (Math.random() * (sum - 1));
            arrayNum[k] = arraySum[randomNum];
            System.out.print(arrayNum[k] + "\t");
        }
        String choose= scanner.nextLine();
        System.out.println(choose);
    }
}
