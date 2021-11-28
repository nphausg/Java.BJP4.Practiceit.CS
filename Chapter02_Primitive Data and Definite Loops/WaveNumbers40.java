package Chapter02;

/**
 * Write for loops to produce the following output, with each line 40 characters wide:
 * ----------------------------------------
 * _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
 * 1122334455667788990011223344556677889900
 * ----------------------------------------
 */
public class WaveNumbers40 {
    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter2/e9-waveNumbers40
    public static void waveNumbers40(){
        for (int a = 1; a <= 40; a++) {
            System.out.print("-");
        }

        System.out.println();

        for (int b = 1; b <= 10; b++) {
            System.out.print("_-^-");
        }

        System.out.println();

        for (int c = 1; c <= 2; c++) {
            System.out.print("11223344556677889900");
        }

        System.out.println();

        for (int a = 1; a <= 40; a++) {
            System.out.print("-");
        }
    }
}
