package days07;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2}, {3, 4}};
        int[][] b = new int[][]{{5, 6}, {7, 8}};
        int[][] c = add(a, b);
        int[][] d = sub(a, b);
        int[][] e = mul(a, b);
        print(c);
        print(d);
        print(e);
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    static int[][] sub(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;
    }

    static int[][] mul(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < b.length; k++) {
                    sum+= a[i][k] * b[k][j];
                }
                c[i][j]=sum;
            }
        }
        return c;
    }

    static void print(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println();
        }
    }
}
