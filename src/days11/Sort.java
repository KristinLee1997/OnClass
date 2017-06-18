package days11;

/**
 * Created by Administrator on 2017/4/28.
 */
public class Sort {
    public static void main(String[] args) {
        int[] num = new int[]{1, 5, 9, 7, 3};
        quickSort(num, 0, num.length - 1);
        for (int i : num) {
            System.out.printf("%d ", i);
        }
        System.out.println(binarySearch(num,3));

    }

    public static void quickSort(int[] num, int low, int high) {
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
        quickSort(num, low, i);
        quickSort(num, j, high);
    }

    public static int binarySearch(int[] num, int key) {
        int i = 0;
        int j = num.length - 1;
        while (i != j) {
            int mid = (i + j) / 2;
            if (num[mid] > key) j = mid - 1;
            else if (num[mid] < key) i = mid + 1;
            else return mid;
        }
        return -1;
    }
}

