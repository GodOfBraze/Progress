package Main;

public class Loop implements Runnable{
    private int counter;
    private ProgressApp app;
    private boolean started = false;

    Loop(ProgressApp app){
        this.app = app;
    }

    private void startLoop() throws InterruptedException {
        //while (!app.isStart){}
        while (counter < 1000){
            counter++;
            app.progressBar.setValue(counter);
            System.out.println(counter);
            Thread.sleep(50);
        }
    }

    @Override
    public void run() {
        while (!started){
            started = app.isStart;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            startLoop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
