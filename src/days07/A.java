package days07;

/**
 * Created by Administrator on 2017/4/9.
 */
public class A {
    public static void main(String[] args) {
        int[] num = new int[]{1, 3, 5, 7, 9};
        turn(num);
        copy(num);
        System.out.println(avg(num));
        System.out.println(max(num));
    }

    static void turn(int num[]) {   //�ߵ�����Ԫ��
        for (int i = 0; i < num.length / 2; i++) {
            int t = num[i];
            num[i] = num[num.length - i - 1];
            num[num.length - i - 1] = t;
        }
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");
    }

    static void copy(int num[]) {   //��������
        int[] b = new int[num.length];
        for (int i = 0; i < num.length; i++)
            b[i] = num[i];
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }

    static double avg(int num[]) {   //����ƽ��ֵ
        double sum = 0.0;
        for (int i = 0; i < num.length; i++)
            sum += num[i];
        return sum / num.length;
    }

    static int max(int[] num) {      //�������ֵ
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
