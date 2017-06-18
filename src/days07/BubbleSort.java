package days07;

/**
 * Created by Administrator on 2017/4/15.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] num=new int[]{1,5,9,7,3,8,2};
        bubble(num);
        for(int i:num){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    static void bubble(int[] num){
        for(int i=0;i<num.length-1;i++){
            int flag=0;
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int t=num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                    flag=1;
                }
            }
            if(flag==0) break;
        }
    }
}
