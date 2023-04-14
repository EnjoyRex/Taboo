import java.util.ArrayList;

public class GameManager {
	
    private Frame game;
    
    public GameManager(Frame game){
        this.game = game;
    }
    
    public void cambiaTeam(){
    	
        if (game.getTeam().getText().equalsIgnoreCase("Team 1")) {
            game.getTeam().setText("Team 2");
        } else {
            game.getTeam().setText("Team 1");
        }
        
        game.setTotPunteggio(0);
        game.getContaParole().setText("" + 0);
        game.setPassRimanenti(3);
        game.getParola().setText("");
        game.getSinonimo1().setText("");
        game.getSinonimo2().setText("");
        game.getSinonimo3().setText("");
        game.getSinonimo4().setText("");
        game.getSinonimo5().setText("");
        
        game.getBtnPass().setVisible(true);
        game.getBtnPass().setText("Pass 3/3");
        game.getBtnStart().setVisible(true);

        game.setCarteUscite(new ArrayList<>());
    }
}