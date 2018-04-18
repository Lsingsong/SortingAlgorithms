package BaiduTest;

import java.io.*;

public class IOUtils {
    /*
     * System.in  用法一
     */
    public static void startInput() {
        String resultString = null;
        BufferedReader bufferedReader = null;

        try {
            System.out.println("请输入字符：");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            resultString = bufferedReader.readLine();
            System.out.println(resultString);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
     * system.in的用法2
     */
    public static void startInput2() {
        byte[] b = new byte[1024];
        int count = 0;

        try {
            System.out.println("请输入字符：");
            count = System.in.read(b);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(new String(b, 0, count));
    }

    /*
     * System.out的用法1
     */
    public static void outPrint1() {
        try {
            PrintStream ps = new PrintStream("c:\\z.txt");
            System.setOut(ps);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        outPrint1();
    }
}
