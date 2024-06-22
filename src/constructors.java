class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(int id){
        this.id = id;
        this.name = "Hello, overloaded constructor";
        System.out.println(this.id + " " + this.name);
    }
    public MyEmployee(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println(this.id + " " + this.name);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

public class constructors {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee(35,"Shubham");
        System.out.println(emp.getId() +"  "+emp.getName());
        MyEmployee emp2 = new MyEmployee(34);
    }
}
