package ua.edu.npu.task07;

public class DEveloper {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity instanceof Creating){
            setActivity(new Looking());
        }else if(activity instanceof Looking){
            setActivity(new Disagree());
        }else if (activity instanceof Disagree) {
            setActivity(new Looking());
            setActivity(new Agree());
        }
    }

    public void doIt(){
        activity.doActivity();
    }
}
