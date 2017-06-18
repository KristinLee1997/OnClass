package days19;

/**
 * Created by Administrator on 2017/6/3.
 */
public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{1, 5, 9, 7, 3, 6,11,22};
        quickSort(num, 0, num.length - 1);
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(binarysearch(num, 11));
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
            if (flag) {
                j--;
            } else {
                i++;
            }
        }
        i--;
        j++;
        quickSort(num, low, i);
        quickSort(num, j, high);
    }

    public static int binarysearch(int[] num, int key) {
        int low = 0;
        int high = num.length - 1;
        while (low != high) {
            int mid = (low + high) / 2;
            if (num[mid] > key) {
                high = mid + 1;
            } else if (num[mid] < key) {
                low = mid - 1;
            } else return mid;
        }
        return -1;
    }

    public void bubbleSort(int[] num){
        for(int i=0;i<num.length-1;i++){
            for(int j=i;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
}
