package zs.java.basics;

import java.io.Console;
import java.util.Scanner;

public class InandoutTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你的名字是：");
        String str=sc.nextLine();
        System.out.println("你的年龄是：");
        int age = sc.nextInt();
        System.out.println("你好，"+str+"你下一年将"+(age+1)+"岁");
        //Java.io.Console 只能用在标准输入、输出流未被重定向的原始控制台中使用，在 Eclipse 或者其他 IDE 的控制台是用不了的
        /*Console console =System.console();
        String userName = console.readLine("用户名：");
        char[] password= console.readPassword("密码:");
        System.out.println("你好！"+userName+"你的密码是："+password);*/
    }
}
