package days26;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/25.
 */
public class JDBC2 {
    @Test
    public void test() throws Exception {
        //һ.��������
        Class.forName("com.mysql.jdbc.Driver");//���÷��䣬�������

        //��.��ȡ����Connection

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", "root", "root");

        //��.�õ�ִ��SQL���Ķ���Statement
        Statement sm = conn.createStatement();

        //��.ִ��SQL��䲢���ؽ��
        ResultSet rs = sm.executeQuery("select * from table1");
        List<Table1> list = new ArrayList<Table1>();

        //��.������
        while (rs.next()) {
            Table1 t = new Table1();
            t.setTab1_id(rs.getInt("tab1_id"));
            t.setTab1_name(rs.getString("tab1_name"));
            list.add(t);
        }

        for (Table1 tab : list) {
            System.out.println(tab);
        }

        //��.�ر���Դ
        rs.close();
        sm.close();
        conn.close();
    }
}
