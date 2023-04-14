import javax.swing.*;

public class Tempo implements Runnable {
	
    private int tempoRimanente;
    private GameManager gameManager;
    private JLabel label;

    public Tempo(JLabel label, GameManager gameManager) {
        this.gameManager = gameManager;
        this.label = label;
        tempoRimanente = 60;
        Thread t = new Thread(this);
        t.start(); 
    }
    
    public void stop() {
    	tempoRimanente = 1;
    }

    public void run() {
        try {
            while (tempoRimanente > 0) {
                tempoRimanente--;
                label.setText("" + tempoRimanente);
                System.out.println(tempoRimanente);
                Thread.sleep(1000); // attesa di 1 secondo
            }
            JOptionPane.showMessageDialog(null, "Tempo scaduto");
            gameManager.cambiaTeam();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}