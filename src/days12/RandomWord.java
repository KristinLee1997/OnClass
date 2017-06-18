package days12;

/**
 * Created by Administrator on 2017/5/6.
 * 生成A~Z的十个字母，但是不能有重复的字母
 */
public class RandomWord {
    public static void main(String[] args) {
        int[] str = new int[26];
        for (int i = 0; i < 10; ) {
            char c = (char) (Math.random() * 26 + 65);
            if (str[c - 65] != 1) {
                System.out.printf("%c ", c);
                i++;
            }
            str[c - 65] = 1;
        }
    }
}
