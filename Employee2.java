package Employ;

public class Employee2 extends Employee {
    private int code;
    private String etype;
    Employee2(int code,String etype){
        this.code = code;
        this.etype = etype;
    }
    public String getEmployType(){
        return this.etype;
    }
}
