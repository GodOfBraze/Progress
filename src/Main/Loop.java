package Main;

public class Loop implements Runnable{
    private int counter;
    private ProgressApp app;

    Loop(ProgressApp app){
        this.app = app;
    }

    private void startLoop() throws InterruptedException {
        while (counter < 1000){
            counter++;
            app.progressBar.setValue(counter);
            System.out.println(counter);
            Thread.sleep(50);
        }
    }

    @Override
    public void run() {
        try {
            startLoop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
