package days07;

/**
 * Created by Administrator on 2017/4/9.
 */
public class Print {//遍历四维数组
    public static void main(String[] args) {
        int[][][][] num=new int[][][][]{{{{1, 1}, {1, 1}}, {{2, 2}, {2, 2}}}, {{{3, 3}, {3, 3}, {3, 3}}}};
        for(int[][][] i:num){
            for(int[][] j:i ){
                for(int[] k:j){
                    for(int e:k)
                        System.out.print(e+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
