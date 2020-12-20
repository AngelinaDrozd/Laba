package ua.edu.npu.task05;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void doAct(){
        activity.doActivity();
    }
}
