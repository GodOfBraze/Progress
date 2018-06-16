package Main;

import javax.swing.*;

public class ProgressApp extends JFrame implements Runnable{
    JProgressBar progressBar;
    private JPanel mainPanel;
    private JPanel progressPanel;
    private JButton startButton;
    boolean isStart = false;

    ProgressApp(){
        super("ProgressApp");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setSize(300, 150);
        startButton.addActionListener(e -> {
            isStart = true;
            System.out.println("Started");
        });
        setVisible(true);
    }

    @Override
    public void run() {
    }
}
