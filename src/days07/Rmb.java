package days07;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Rmb {
    public static void main(String[] args) {
        String[] num = new String[]{"Áã", "Ò¼", "·¡", "Èþ", "ËÁ",
                "Îé", "Â½", "Æâ", "°Æ", "¾Á"};
        String[] str = new String[]{"Ê®", "°Ù", "Ç§"};
        System.out.println(Thousand("5001", num, str));
    }

    static String Thousand(String number, String[] num, String[] str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            int m = number.charAt(i) - 48;
            if (number.charAt(i) == '.') {
                count = i;
                break;
            }
            if (i < number.length() - 1 && m != 0)
                result += num[m] + str[str.length - i - 1];
            else {

                result = result + num[m];
            }
        }

        for(int i=count;i<number.length();i++){
            int n=number.charAt(i)-48;
            if(number.charAt(count)==0)
                continue;
            else  result+=num[n];
        }
        return result;
    }

}
