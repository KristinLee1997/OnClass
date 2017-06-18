package days07;

/**
 * Created by Administrator on 2017/4/11.
 */
public class Joseph2 {
    public static void main(String[] args) {
        int[] num = new int[17 * 17];
        int n = 17;
        int start = 0, end = n - 1;
        int count = 0, point = 0;
        for (int i = 0; i <= n - 1; i++) {
            count++;
            if (count % 3 != 0) {
                point++;
                num[end + point] = i;
            } else n--;
            if (i == n - 1) {
                start = end + 1;
                end = end + point;
                point = 0;
                i = i - (n - 1);
            }
        }
        System.out.println(n);
        System.out.println(num[end]);
    }
}
