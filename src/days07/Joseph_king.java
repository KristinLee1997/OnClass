package days07;

/**
 * Created by Administrator on 2017/4/14.
 */
public class Joseph_king {
    public static void main(String[] args) {
        System.out.println(killing1());
    }

    public static int killing1() {
        int num = 17;//17��
        int counter = 1;//������
        int kill = 3;//ɱ��kill����
        int arr[] = new int[100];//ģ��һ������
        for (int i = 0; i < num; i++) arr[i] = i;
        int scan = 0, in = num;//scan���ף�in��β

        while (in > scan + 1) { //ÿ��������һ���뿪Ȧ��
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
