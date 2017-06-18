package days13;

import java.util.Comparator;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/5/12.
 * 对象数组的排序，以salary的大小排序
 */
public class Test {
    public static void main(String[] args) {
        Employee[] people = new Employee[5];
        people[0] = new Employee("Xioaxu", 3000);
        people[1] = new Employee("Haibian", 2500);
        people[2] = new Employee("Chao", 1000);
        people[3] = new Employee("Peijuan", 2000);
        people[4] = new Employee("Meilin", 2000);
        Arrays.sort(people);
        for (Employee i : people) {
            System.out.println("name = "+i.getName()+" \tsalary = "+i.getSalary());
        }

    }
}

class Employee implements Comparable {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }
    public int compareTo(Object o) {
        int i = 0;
        if (salary < ((Employee) o).salary) {
            return -1;
        }
        if (salary > ((Employee) o).salary) {
            return 1;
        }
        return i;
    }

}
