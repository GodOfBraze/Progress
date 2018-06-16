package Main;

import javax.swing.*;

public class ProgressApp extends JFrame implements Runnable{
    JProgressBar progressBar;
    private JPanel mainPanel;
    private JPanel progressPanel;

    ProgressApp(){
        super("ProgressApp");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setSize(300, 50);
        setVisible(true);
    }

    @Override
    public void run() {

    }
}
