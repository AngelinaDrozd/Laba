package ua.edu.npu.task09;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();


        System.out.println("First version!!!");
        project.set(1,0);
        System.out.println(project);

        System.out.println("Save project!!");
        Rep rep = new Rep();
        rep.setSave(project.save());

        System.out.println("Second version!!!");
        project.set(0,0);
        System.out.println(project);


        System.out.println("Rolling back!!");
        project.load(rep.getSave());
        System.out.println(project);

    }
}
