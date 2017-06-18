package days13;

/**
 * Created by Administrator on 2017/5/10.
 * 去除字符串中一段连续的空格，并且输出
 */
public class DeleteSpace {
    public static void main(String[] args) {
        String str="         saffsd        fdsfafdas   ";
        spaceDel(str);
    }

    public static void spaceDel(String str){
        String m=str.trim();
        int flag=m.indexOf(" ");
        m=m.substring(0,flag).trim()+m.substring(flag,m.length()).trim();
        System.out.println(m);
    }
}


