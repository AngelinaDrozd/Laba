package ua.edu.npu.task03;

public class Project implements  Cloneable{
    private int id;
    private String name;
    private  String someinfo;

    public Project(int id, String name, String someinfo) {
        this.id = id;
        this.name = name;
        this.someinfo = someinfo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSomeinfo(String someinfo) {
        this.someinfo = someinfo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSomeinfo() {
        return someinfo;
    }

    @Override
    public String toString(){
        return "Information "+
                "number "+id+
                " about " + name +
                ". It is so interesting " + someinfo;
    }

    public Project clone() throws CloneNotSupportedException{
        return (Project) super.clone();
    }
}
