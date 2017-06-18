package days10;

/**
 * Created by Administrator on 2017/4/23.
 */
public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{1, 5, 9, 7, 3, 6};
        quickSort(num, 0, num.length - 1);
        print(num);
        System.out.println(binary(num,5));

    }

    static void quickSort(int[] num, int low, int high) {
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

    static void print(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d ", num[i]);
        }
        System.out.println();
    }

    static int binary(int[] num,int key){
        int low=0;
        int high=num.length-1;
        while(low!=high){
            int mid=(high+low)/2;
            if(num[mid]>key) high=mid-1;
            else if(num[mid]<key) low=mid+1;
            else return mid;
        }
        return -1;
    }
}

