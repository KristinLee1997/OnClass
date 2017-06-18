package days08;

/**
 * Created by Administrator on 2017/4/16.
 */
public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{1, 5, 9, 7, 3, 11};
        quick(num, 0, num.length - 1);
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(binarySearch(num, 4));

    }

    static void quick(int[] num, int low, int high) {
        int i = low;
        int j = high;
        if (i >= j) return;
        boolean flag = true;
        while (i != j) {
            if (num[i] > num[j]) {
                int t = num[i];
                num[i] = num[j];
                num[j] = t;
                flag = (flag == true) ? false : true;
            }
            if (flag) j--;
            else i++;
        }
        i--;
        j++;
        quick(num, low, i);
        quick(num, j, high);
    }

    static int binarySearch(int[] num, int key) {
        int low = 0, high = num.length - 1;
        //boolean flag=true;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (num[mid] > key) high = mid - 1;
            else if (num[mid] < key) low = mid + 1;
            else return mid;
        }
        if (true) throw new RuntimeException("There is no mid!");
        return -1;
    }
}
