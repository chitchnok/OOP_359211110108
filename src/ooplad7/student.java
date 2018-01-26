package ooplad7;
//talking about student?
// 1.Student ID
// 2.Name
// 3.person ID
// 4.Address
//Access Control
//1. public
//2. private
//3. protected
public class Student {
    //properties of Student class
    private String id;
    private String name;
    private String pid;
    private String address;
    //Constructor
    //default constructor
    public Student(){}
    //create by own
    public Student (String id, String n, String pid, String a){
        //assing data to class properties
        this.id = id;
        this.name = n;
        this.pid = pid;
        this.address = a;

    }
    //getter and setter methods
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setId(String n){
        this.name = n;
    }
    public String getpid(){
        return this.pid;
    }
    public void setId(String pid){
        this.pid = pid;
    }
    public String getaddress(){
        return this.address;
    }
    public void setId(String a){
        this.address = a;
    }


}//class