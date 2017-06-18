package days07;

/**
 * Created by Administrator on 2017/4/9.
 */
public class Yang_triangle {//Ñî»ÔÈı½Ç

    public static void main(String[] args) {
        int n = 12;
        int[][] num = new int[n][n];
        for (int i = 0; i < n; i++) {
            num[i][0] = 1;
        }
        print(num,12);
    }
    static void print(int[][] num,int n){//Ñî»ÔÈı½ÇÍêÕû°æ
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i - 1; j++) {
                num[i][j] = num[i - 1][j - 1] + num[i - 1][j];
            }
        }
        for (int i = 2; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < n; j++) {
                if (num[i][j] != 0)
                    System.out.print(num[i][j] + "\t\t");
            }
            System.out.println();
        }
        for(int i=10;i>=2;i--){
            for(int k=n-i-1;k>=0;k--)
                System.out.print("\t");
            for(int j=0;j<n;j++){
                if(num[i][j]!=0)
                    System.out.print(num[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}
