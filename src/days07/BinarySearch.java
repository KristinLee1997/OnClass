package days07;

/**
 * Created by Administrator on 2017/4/15.
 */
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] num = new int[]{11,9,7,5,3,1};
        Arrays.sort(num);
        int b=binary(num,2);
        System.out.println(b);
    }

    static int binary  (int[] num, int key) {
        int left = 0;
        int right = 5;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (num[mid] > key) right = mid - 1;
            else if (num[mid] < key) left = mid + 1;
            else return mid;
        }
        throw new RuntimeException("lklkll");
        //return -1;
    }
}