package days07;

public class Joseph {
    public static void main(String[] args) {
        int[][] num = new int[17][2];
        for (int i = 0; i < 17; i++) {
            num[i][0] = i;
            num[i][1] = 1;
        }
        int j = 0, count = 0;
        int n = num.length;
        while (j >= 0) {
            count++;
            while (j > 16) {
                j = j - 16 - 1;
                break;
            }
            if (num[j][1] == 0) {
                j++;
                while (num[j][1] == 0) {
                    j++;
                    if (num[j][1] != 0)
                        break;
                    if (j >= 16)
                        j = j - 16;
                }
                num[j][1] = count;
                if (num[j][1] % 3 == 0) {
                    n--;
                    num[j][1] = 0;
                }
                j++;
            } else {
                num[j][1] = count;
                if (num[j][1] % 3 == 0) {
                    n--;
                    num[j][1] = 0;
                }
                j++;
            }
            if (n == 0) {
                System.out.println(j - 1);
                break;
            }
        }

    }
}
