package days07;

/**
 * Created by Administrator on 2017/4/14.
 */
public class Joseph_king {
    public static void main(String[] args) {
        System.out.println(killing1());
    }

    public static int killing1() {
        int num = 17;//17人
        int counter = 1;//计数器
        int kill = 3;//杀第kill个人
        int arr[] = new int[100];//模拟一个队列
        for (int i = 0; i < num; i++) arr[i] = i;
        int scan = 0, in = num;//scan队首，in队尾

        while (in > scan + 1) { //每三个人有一个离开圈子
            if (counter++ % kill == 0) {
                scan++;
                continue;
            } else {
                arr[in++] = arr[scan++];
            }
        }
        return arr[scan];
    }
}
