package days10;

public class Train{
    public String modify(String str){
        str="123456";
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        String str1="456789";
        Train t=new Train();
        str1=t.modify(str1);
        System.out.println(str1);
    }
}
