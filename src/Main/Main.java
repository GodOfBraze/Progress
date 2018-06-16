package Main;

public class Main {

    public static void main(String[] args){
        ProgressApp app = new ProgressApp();
        new Thread(app).start();
        new Thread(new Loop(app)).start();
    }
}
