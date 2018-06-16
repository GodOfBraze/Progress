package Main;

public class Main {

    public static void main(String[] args){
        ProgressApp app = new ProgressApp();
        Loop loop = new Loop(app);
        new Thread(app).start();
        new Thread(loop).start();
    }
}
