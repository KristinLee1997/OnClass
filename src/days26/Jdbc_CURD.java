package days26;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Jdbc_CURD {
    @Test
    public void test_update() throws Exception {
        //��������
        Class.forName("com.mysql.jdbc.Driver");

        //��ȡ����Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", "root", "root");

        //���ִ��Sql�Ķ���Statement
        Statement st = con.createStatement();

        //ִ��SQL
        int i = st.executeUpdate("update table1 set tab1_name=\"test\" where tab1_id=2");
        System.out.println("������" + i + "��");

        //�ر���Դ
        st.close();
        con.close();

    }

    @Test
    public void test_delete() throws Exception {
        //��������
        Class.forName("com.mysql.jdbc.Driver");

        //��ȡ����Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", "root", "root");

        //���ִ��Sql�Ķ���Statement
        Statement st = con.createStatement();

        //ִ��SQL
        int i = st.executeUpdate("delete from table1 where tab1_id=2;");
        System.out.println("ɾ����" + i + "��");

        //�ر���Դ
        st.close();
        con.close();


    }
}
