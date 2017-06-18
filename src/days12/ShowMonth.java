package days12;

/**
 * Created by Administrator on 2017/5/6.
 * 显示日历牌，如：
 * 日 一 二 三 四 五 六
 *    1  2  3  4  5  6
 * 7  8  9  10 11 12 12
 * 14 15 16 17 18 19 20
 * 21 22 23 24 25 26 27
 * 28 29 30 31
 */


import java.util.Date;

public class ShowMonth {
    public static void main(String[] args) {
        showTime();
    }

    public static void showTime() {
        Date date = new Date(2017 - 1900, 5 - 1, 10);
        System.out.println("\t\t" + (date.getYear() + 1900) + "年" + (date.getMonth() + 1) + "月");
        System.out.println("--------------------------");
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int one = date.getDay();
        for (int i = 0; i < one; i++) {
            System.out.print("\t");
        }
        int count = one;
        int days;
        int month = date.getMonth() + 1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                days = 31;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                days = 30;
                break;
            }
            default:
                days = 28;
        }
        for (int i = 1; i <= days; i++) {
            count++;
            System.out.print((i==date.getDate()) ? i + "*\t" : i + "\t");
            if (count % 7 == 0) {
                System.out.println();
            }
        }
    }
}
