package zs.java.basics;

public class StringmethodsTest {
    public static void main(String[] args) {
        String greeting = "hello";
        String s="help!";
        greeting=greeting.substring(0,3)+"p!";
        System.out.println(greeting);
        boolean a1=s==greeting;//flase
        boolean a2=s=="help!";//true
        boolean a3=greeting=="help!";//false
        System.out.printf(""+a1+a2+a3);
    }
    /**
     * 判断一个字符串既不是null也不是空值。
     * @param  string
     */
    public  boolean checkNullAndEmptty(String string){
        if(string != null && string.length() !=0){
            return true;
        }
        return false;
    }
}
