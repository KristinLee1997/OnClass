package days07;

/**
 * Created by Administrator on 2017/4/9.
 */
public class Theatre {//电影院正序输入，倒序输出

    public static void main(String[] args) {
        int[][] num = new int[5][5];
        for (int i = 0; i < 2; i++) {
            num[i][0] = 30 + i * 5;
            for (int j = 1; j < 5; j++) {
                num[i][j] = num[i][j - 1] + 1;
            }
        }
        for (int i = 1; i >= 0; i--) {
            for (int j = 4; j >= 0; j--)
                System.out.print(num[i][j] + " ");
            System.out.println();
        }
    }
}

