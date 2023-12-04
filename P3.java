package Employ;

import Employ.Employee2;

public class P3 {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(1,"Full Time");
        e1.setId(101);
        e1.setName("Ragul");
        e1.setSalary(100000);
        System.out.println(e1.getEmployType());
        System.out.println(e1.getSalary());
    }
}
