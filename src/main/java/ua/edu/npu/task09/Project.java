package ua.edu.npu.task09;

public class Project {
    private int x;
    private int y;

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Save save(){
        return new Save(x, y);
    }
    public void load(Save save){
        x = save.getX();
        y = save.getY();
    }

    @Override
    public String toString() {
        return "Game:{" +
                "x=" + x +
                ", y=" + y +
                " x=" + x +
                '}';
    }
}
