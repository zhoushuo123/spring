package zs.java.basics;

/**
 * @author zs
 * 块作用域
 * 各种类型数组的初始化默认值
 */

public class ControlStatements {
    public static void main(String[] args) {
        int n=1;
        {
            int k=2;
            System.out.println(k);
            System.out.println(n);
            char[] arr =new char[10];
            String[] arrString = new String[5];
            int[] arrInt = new int[10];
            double[] arrDouble = new double[5];
            System.out.println("String数组默认初始化值为"+arrString[1]);
            if(arr[1]=='\0'){
                System.out.println("char数组默认初始化值为'\\0'");
            }
            System.out.println("boolean[] 数组默认初始化值为false");
            System.out.println("double[] 数组默认初始化值"+arrDouble[1]);
            System.out.println("int[] 数组默认初始化值"+arrInt[1]);
        }
        System.out.println(n);
    }
}
