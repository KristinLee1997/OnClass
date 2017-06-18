package days07;

/**
 * Created by Administrator on 2017/4/15.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] num = new int[]{1, 5, 9, 7, 3, 8, 2};
        quick2(num, 0, num.length - 1);
        for(int i:num)
            System.out.print(i+" ");
    }

    static void quick(int[] num, int low, int high) {
        int i=low;
        int j=high;
        if(i>=j) return ;
        boolean flag=true;
        while(i!=j){
            if(num[i]>num[j]){
                int t=num[i];
                num[i]=num[j];
                num[j]=t;
                flag=(flag==true)?false:true;
            }
            if(flag) j--;
            else i++;
        }
        i--;
        j++;
        quick(num,low,i);
        quick(num,j,high);
    }
    static void quick2(int[] num,int low,int high){
        int i=low;
        int j=high;
        int temp=num[low];
        if(i>=j) return ;
        while(i!=j){
            while(num[j]>=temp&&i<j)
                j--;
            while(num[i]<=temp&&i<j)
                i++;
            if(i<j){
                int t=num[i];
                num[i]=num[j];
                num[j]=t;
            }
        }
        num[low]=num[i];
        num[i]=temp;
        quick2(num,low,i-1);
        quick2(num,i+1,high);
    }
}

