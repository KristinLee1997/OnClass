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

    void setSno(String sno) {//����sno
        this.sno = sno;
    }

    String getSno() {//��ȡsno
        return sno;
    }

    void setName(String name) {//����name
        this.name = name;
    }

    String getName() {//��ȡname
        return name;
    }
}

