package ua.edu.npu.task03;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Project p1 = new Project(1, "Week", "info");
        System.out.println(p1);

        Project userProject = p1.clone();
        userProject.setId(5);
        System.out.println(userProject);
    }

}
