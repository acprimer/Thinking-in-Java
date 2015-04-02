package chap16_Arrays;

import java.util.Arrays;

/**
 * Created by yaodh on 2015/3/31.
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));
        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("j = " + Arrays.toString(j));

        int[] k = new int[5];
        Arrays.fill(k, 103);
        System.arraycopy(i, 0, k, 0, k.length);
        System.out.println("k = " + Arrays.toString(k));

        Test[] s = new Test[5];
        Arrays.fill(s, new CopyingArrays().new Test(3,4));
        Test[] t = new Test[7];
        Arrays.fill(t, new CopyingArrays().new Test(5,5));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("t = " + Arrays.toString(t));
        System.arraycopy(s, 0, t, 0, s.length);
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("t = " + Arrays.toString(t));
        s[0].a = 8;
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("t = " + Arrays.toString(t));
    }

    class Test {
        public int a, b;
        public Test(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public String toString() {
            return "a:" + a + " b:" + b;
        }
    }

}