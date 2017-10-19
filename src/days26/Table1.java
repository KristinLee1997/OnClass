package days26;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Table1 {
    private int tab1_id;
    private String tab1_name;

    public int getTab1_id() {
        return tab1_id;
    }

    public void setTab1_id(int tab1_id) {
        this.tab1_id = tab1_id;
    }

    public String getTab1_name() {
        return tab1_name;
    }

    public void setTab1_name(String tab1_name) {
        this.tab1_name = tab1_name;
    }

    @Override
    public String toString() {
        return "Table1{" +
                "tab1_id=" + tab1_id +
                ", tab1_name='" + tab1_name + '\'' +
                '}';
    }
}
