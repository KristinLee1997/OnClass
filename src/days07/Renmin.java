package days07;

/**
 * Created by Administrator on 2017/4/15.
 */

import java.util.*;

public class Renmin {
    public static void main(String[] args) {
        R r = new R();
        r.div();
        r.Thousand();
        System.out.println(r.result);
    }
}

class R {
    Scanner input = new Scanner(System.in);
    private String str = input.nextLine();
    String a = "", b = "", result = "";
    String[] num = new String[]{"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    String[] dan = new String[]{"千", "百", "十", " "};


    void div() {//将输入的串分成整数和小数
        int p = 0;
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '.') {
                count = i;
                p = 1;
            }
        }
        if (p == 0) {
            a = str;
        } else {
            a = str.substring(0, count);
            b = str.substring(count + 1, str.length());
        }
    }

    String Thousand() {
        for (int i = 0; i < a.length(); i++) {
            boolean flag = false;
            int m = a.charAt(i) - 48;
            while (m == 0) {
                flag = true;
                break;
            }
            /*if (i < a.length() - 1 && m != 0)
                result += num[m] + dan[dan.length - a.length() + i];
            else
                result += num[m];*/

            if (flag == false) {
                result += num[m] + dan[dan.length - a.length() + i];
            } else {
                result += num[0];
            }
        }
        return result;
    }
}