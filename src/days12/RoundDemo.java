package days12;

/**
 * Created by Administrator on 2017/5/7.
 * �������룬�岻��
 */

public class RoundDemo {
    public static void main(String[] args) {
        demo(0.99999, 2);
    }

    public static void demo(double num, int k) {
        int flag = 0;//��ʼ����־λ
        int a = (int) (num * Math.pow(10, k + 1));//��Ҫ������λȫ��תΪint��
        double x = (a % 10 < 5) ? (a - a % 10) : (a - a % 10 + 10);//��λ
        if (a % 10 == 5) {//�ж�Ҫ��������һλ�Ƿ�Ϊ5
            flag = 1;
            x = a;
        }
        String str = new String(x + ".");
        int ad = str.indexOf(".") - k - 1;
        if ((int) (num / 10) == 0 && x < Math.pow(10, k + 1)) {
            System.out.print("0");
        }
        System.out.println(k == 0 ? str.substring(0, ad) : str.substring(0, ad) + "." + str.substring(ad, ad + k + flag));
    }
}



