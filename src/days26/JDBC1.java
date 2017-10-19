package days26;

import org.junit.Test;

import java.sql.*;
import java.util.Properties;

/**
 * Created by Administrator on 2017/7/25.
 */
public class JDBC1 {
    @Test
    public void test() throws Exception {
        /*һ.ע��������ע���������Σ�ǿ������jar�������Բ�����ʹ��
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        */

        //һ.��������
        Class.forName("com.mysql.jdbc.Driver");//���÷��䣬�������

        /*��.��ȡ����Connection
        URL--Э�飺��Э�飺//IP:�˿ں�/DB��
        mysql���ӱ���URL��"jdbc:mysql:///bz"*/
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", "root", "root");

        //��.�õ�ִ��SQL���Ķ���Statement
        Statement sm = conn.createStatement();

        //��.ִ��SQL��䲢���ؽ��
        ResultSet rs = sm.executeQuery("select * from orders");

        //��.������
        while (rs.next()) {
            System.out.print(rs.getObject(1) + "\t");
            System.out.print(rs.getObject(2) + "\t");
            System.out.print(rs.getObject(3));
            System.out.println();
        }

        //��.�ر���Դ
        rs.close();
        sm.close();
        conn.close();
    }

    @Test
    public void test2() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "root");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", info);

        Statement sm = conn.createStatement();

        ResultSet rs = sm.executeQuery("select * from orders");

        while (rs.next()) {
            System.out.print(rs.getObject(1) + "\t");
            System.out.print(rs.getObject(2) + "\t");
            System.out.print(rs.getObject(3));
            System.out.println();
        }

        rs.close();
        sm.close();
        conn.close();

    }

    @Test
    public void test3() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz?user=root&password=root");

        Statement sm = conn.createStatement();

        ResultSet rs = sm.executeQuery("select * from orders");

        while (rs.next()) {
            System.out.print(rs.getObject(1) + "\t");
            System.out.print(rs.getObject(2) + "\t");
            System.out.print(rs.getObject(3));
            System.out.println();
        }

        rs.close();
        sm.close();
        conn.close();

    }
}