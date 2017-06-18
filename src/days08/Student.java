package days08;

/**
 * Created by Administrator on 2017/4/16.
 */
public class Student {
    public static void main(String[] args) {
        S s = new S();
        s.setSno("1504010806");
        System.out.println(s.getSno());
    }
}

class S {
    String sno;
    String name;

    void setSno(String sno) {//设置sno
        this.sno = sno;
    }

    String getSno() {//获取sno
        return sno;
    }

    void setName(String name) {//设置name
        this.name = name;
    }

    String getName() {//获取name
        return name;
    }
}

