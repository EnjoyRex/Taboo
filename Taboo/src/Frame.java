import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.awt.SystemColor;

public class Frame {

    private ArrayList<Carta> carte;
    private ArrayList<Integer> carteUscite;

    private int passRimanenti;
    private int totPunteggio;
    
    private Tempo tempo;
    private GameManager gameManager;

    private JFrame frame;
    private JTextField parola;
    private JTextField sinonimo1;
    private JTextField sinonimo2;
    private JTextField sinonimo3;
    private JTextField sinonimo4;
    private JTextField sinonimo5;
    private JTextField team;
    private JLabel timer;
    private JTextField punteggio;
    private JButton btnPass; 
    private JButton btnStart;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame window = new Frame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Frame() {
        initialize();
    }

    private void initialize() {

        carte = new ArrayList<>();
        carteUscite = new ArrayList<>();
        gameManager = new GameManager(this);
        passRimanenti = 3;
        totPunteggio = 0;

        carte.add(new Carta("Museo", "Arte", "Quadri", "Mostre", "Edificio", "Louvre"));
        carte.add(new Carta("Attore", "Teatro", "Star", "Personaggio", "Film ","Interpretare"));
        carte.add(new Carta("Stress ", "Nervoso ", "Sotto ", "Ansia ", "Pressione ","Tensione"));
        carte.add(new Carta("Uber ", "Servizio ", "Taxi ", "Privato ", "Applicazione ","Automobile "));
        carte.add(new Carta("Casa Bianca ", "Washington ", "Presidente ", "Barack Obama ", "Studio Ovale ","Stati Uniti "));
        carte.add(new Carta("Carabinieri ", "Arma ", "Polizia ", "Appuntato ", "Caserma ","Denuncia "));
        carte.add(new Carta("Democrazia ", "Forma ", "Popolo ", "Governo ", "Monarchia ","Parlamentare "));
        carte.add(new Carta("Playlist ", "Musica ", "Brani ", "Successione ", "Raccolta ","DJ "));
        carte.add(new Carta("Esilio ", "Patria ", "Allontanare ", "Esule ", "Paese ","Politica "));
        carte.add(new Carta("Wimbledon ", "Tennis ", "Grande Slam ", "Inghilterra ", "Campo ","Erba "));
        carte.add(new Carta("Bungee Jumping ", "Saltare ", "Corda ", "Elastico ", "Rimbalzare ","Ponte "));
        carte.add(new Carta("Patatine Fritte ", "Cibo ", "Fast Food ", "Ketchup ", "Bambini ","Bistecca "));
        carte.add(new Carta("Cantautore ", "Scrivere ", "Musica ", "Anni '70 ", "Testi ","Claudio Baglioni "));
        carte.add(new Carta("Sushi ", "Sashimi ", "Giapponese ", "Pesce ", "Alghe ","Riso "));
        carte.add(new Carta("Wi-Fi ", "Rete ", "Gratis ", "Mobile ", "Casa ","Internet "));
        carte.add(new Carta("Vino ", "Bevanda ", "Rosso ", "Uva ", "Bottiglia ","Bianco "));
        carte.add(new Carta("Dna ", "Genetica ", "Elica ", "Umano ", "Codice ","Test "));
        carte.add(new Carta("Brandy ", "Alcool ", "Bevanda ", "Acquavite ", "Distillato ","Vino "));
        carte.add(new Carta("Assenza ", "Mancanza ", "Presenza ", "Scuola ", "Lontananza ","Appello "));
        carte.add(new Carta("Bitcoin ", "Moneta ", "Digitale ", "Scambiare ", "Comprare ","Prodotti "));
        carte.add(new Carta("Hacker ", "Virus ", "Informatica ", "Pirata ", "Sicurezza ","Internet "));
        carte.add(new Carta("Motocicletta ", "Due ruote ", "Bici ", "Guidare ", "Casco ","Harley Davidson "));
        carte.add(new Carta("Champagne ", "Vino ", "Bollicine ", "Stappare ", "Brindisi ","Spumante "));
        carte.add(new Carta("Calcio Di Punizione ", "Rigore ", "Fallo ", "Football ", "Barriera ","Tirare "));
        carte.add(new Carta("Pianoforte ", "Musica ", "Tasti ", "Coda ", "Strumento ","Suonare "));
        carte.add(new Carta("Detective ", "Investigatore", "Polizia ", "Privato", "Indizi ","Sherlock Holmes "));
        carte.add(new Carta("Libro ", "Leggere ", "Volume ", "Carta ", "Romanzo ","Biblioteca "));
        carte.add(new Carta("Antico ", "Vecchio ", "Moderno ", "Passato ", "Tempo ","Remoto "));
        carte.add(new Carta("Pizzo ", "Intimo ", "Reggiseno ", "Merletto ", "Mutandine ","Mafia "));
        carte.add(new Carta("Anello ", "Gioiello ", "Anulare ", "Fede ", "Dita ","Brillantini "));
        carte.add(new Carta("K2 ", "Montagna ", "Nepal ", "Vetta ", "Everest ","Seconda "));
        carte.add(new Carta("Mal di Testa ", "Dolore ", "Cerchio ", "Aspirina ", "Emicrania ","Girare "));
        carte.add(new Carta("E-Book ", "Libro ", "Elettronico ", "Scaricare ", "Digitale ","Download "));
        carte.add(new Carta("Pronto Soccorso ", "Ospedale ", "188 ", "Ambulanza ", "Codice ","Incidente "));
        carte.add(new Carta("Commissario ", "Polizia ", "Ufficiale ", "Agente ", "Montalbano ","Ispettore "));
        carte.add(new Carta("Bandiera ", "Tricolore ", "Asta ", "Garrire ", "Vento ","Simbolo "));
        carte.add(new Carta("Torre Di Pisa ", "Pendente ", "Miracoli ", "Toscana ", "Campanile ","Piazza "));
        carte.add(new Carta("Gratta E Vinci ", "Lotteria ", "Istantanea ", "Sfregare ", "Combinazione ","Simboli "));
        carte.add(new Carta("New York ", "Manhattan ", "America ", "Città ", "Grande Mela ","Grattacieli "));
        carte.add(new Carta("Caffè ", "Latte ", "Macchiato ", "Bevanda ", "Cappucino ","Orzo "));
        carte.add(new Carta("Forno ", "Cuocere ", "Legna ", "Cucina ", "Microonde ","Gas "));
        carte.add(new Carta("Maionese ", "Salsa ", "Condimento ", "Uova ", "Crema ","Limone "));
        carte.add(new Carta("Miliardario ", "Denaro ", "Ricchissimo ", "Magnate ", "Povero ","Soldi "));
        carte.add(new Carta("Nasa ", "Agenzia ", "Spazio ", "Stati Uniti", "Missioni ","Astronavi "));
        carte.add(new Carta("Casinò ", "San Remo ", "Azzardo ", "Las Vegas ", "Gioco ","Roulette "));
        carte.add(new Carta("Pugile ", "Boxe ", "Ring ", "Pugni ", "Combattimento ","Guantoni "));
        carte.add(new Carta("Fisica ", "Scienza ", "Matematica ", "Corpi ", "Leggi ","Nucleare "));
        carte.add(new Carta("Montagna ", "Mare ", "Roccia ", "Alpi ", "Vette ","Neve "));
        carte.add(new Carta("Piazza San Pietro ", "Roma ", "Basilica ", "Città del Vaticano ", "Colonnato ","Bernini "));
        carte.add(new Carta("Pane", "Farina", "Marmellata", "Grano", "Salame", "Alimento"));

        frame = new JFrame();
        frame.setBounds(100, 100, 580, 580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setTitle("Taboo");

        parola = new JTextField();
        parola.setHorizontalAlignment(SwingConstants.CENTER);
        parola.setBackground(SystemColor.inactiveCaptionBorder);
        parola.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
        parola.setBounds(40, 45, 200, 45);
        frame.getContentPane().add(parola);
        parola.setColumns(10);
        parola.setEditable(false);

        sinonimo1 = new JTextField();
        sinonimo1.setHorizontalAlignment(SwingConstants.CENTER);
        sinonimo1.setBackground(SystemColor.inactiveCaptionBorder);
        sinonimo1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
        sinonimo1.setBounds(60, 105, 160, 35);
        frame.getContentPane().add(sinonimo1);
        sinonimo1.setColumns(10);
        sinonimo1.setEditable(false);

        sinonimo2 = new JTextField();
        sinonimo2.setHorizontalAlignment(SwingConstants.CENTER);
        sinonimo2.setBackground(SystemColor.inactiveCaptionBorder);
        sinonimo2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
        sinonimo2.setBounds(60, 155, 160, 35);
        frame.getContentPane().add(sinonimo2);
        sinonimo2.setColumns(10);
        sinonimo2.setEditable(false);

        sinonimo3 = new JTextField();
        sinonimo3.setHorizontalAlignment(SwingConstants.CENTER);
        sinonimo3.setBackground(SystemColor.inactiveCaptionBorder);
        sinonimo3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
        sinonimo3.setColumns(10);
        sinonimo3.setBounds(60, 205, 160, 35);
        frame.getContentPane().add(sinonimo3);
        sinonimo3.setEditable(false);

        sinonimo4 = new JTextField();
        sinonimo4.setHorizontalAlignment(SwingConstants.CENTER);
        sinonimo4.setBackground(SystemColor.inactiveCaptionBorder);
        sinonimo4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
        sinonimo4.setColumns(10);
        sinonimo4.setBounds(60, 255, 160, 35);
        frame.getContentPane().add(sinonimo4);
        sinonimo4.setEditable(false);

        sinonimo5 = new JTextField();
        sinonimo5.setHorizontalAlignment(SwingConstants.CENTER);
        sinonimo5.setBackground(SystemColor.inactiveCaptionBorder);
        sinonimo5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
        sinonimo5.setColumns(10);
        sinonimo5.setBounds(60, 305, 160, 35);
        frame.getContentPane().add(sinonimo5);
        sinonimo5.setEditable(false);

        team = new JTextField("Team 1");
        team.setBackground(SystemColor.inactiveCaptionBorder);
        team.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
        team.setEditable(false);
        team.setBounds(390, 440, 125, 45);
        frame.getContentPane().add(team);
        team.setColumns(10);
        team.setEditable(false);

        punteggio = new JTextField();
        punteggio.setHorizontalAlignment(SwingConstants.CENTER);
        punteggio.setBackground(SystemColor.inactiveCaptionBorder);
        punteggio.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
        punteggio.setBounds(40, 440, 85, 45);
        frame.getContentPane().add(punteggio);
        punteggio.setColumns(10);
        punteggio.setEditable(false);
        
        timer = new JLabel("60");
        timer.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
        timer.setBounds(414, 40, 90, 50);
        frame.getContentPane().add(timer);

        
        btnStart = new JButton("Start");
        btnStart.setBackground(SystemColor.inactiveCaptionBorder);
        btnStart.setForeground(Color.MAGENTA);
        btnStart.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
        btnStart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tempo = new Tempo(timer, gameManager);
        		btnStart.setVisible(false);
        		faiUscireCarta();
        	}
        });
        btnStart.setBounds(223, 440, 90, 45);
        frame.getContentPane().add(btnStart);
        
        
        JButton btnCorrect = new JButton("Correct");
        btnCorrect.setForeground(Color.GREEN);
        btnCorrect.setBackground(SystemColor.inactiveCaptionBorder);
        btnCorrect.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
        btnCorrect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(btnStart.isVisible()) {
                	return;
                }
                totPunteggio++;
                punteggio.setText("" + totPunteggio);
                faiUscireCarta();
            }
        });
        btnCorrect.setBounds(365, 155, 125, 35);
        frame.getContentPane().add(btnCorrect);
        

        btnPass = new JButton("Pass " + passRimanenti + "/3");
        btnPass.setForeground(Color.BLUE);
        btnPass.setBackground(SystemColor.inactiveCaptionBorder);
        btnPass.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
        btnPass.setBounds(365, 205, 125, 35);
        frame.getContentPane().add(btnPass);
        btnPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if(btnStart.isVisible()) {
                	return;
                }
            	passRimanenti--;
                if (passRimanenti == 0) {
                	btnPass.setVisible(false);
                }
                btnPass.setText("Pass " + passRimanenti + "/3");
                faiUscireCarta();
            }
        });

        
        JButton btnTaboo = new JButton("Taboo");
        btnTaboo.setBackground(SystemColor.inactiveCaptionBorder);
        btnTaboo.setForeground(Color.RED);
        btnTaboo.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 25));
        btnTaboo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(btnStart.isVisible()) {
                	return;
                }
            	if (totPunteggio > 0) {
                    totPunteggio--;
                    punteggio.setText("" + totPunteggio);
                }
                faiUscireCarta();
            }
        });
        btnTaboo.setBounds(365, 255, 125, 35);
        frame.getContentPane().add(btnTaboo);
        
        JLabel lblNewLabel = new JLabel("Team:");
        lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
        lblNewLabel.setBounds(389, 379, 96, 78);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Timer:");
        lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
        lblNewLabel_1.setBounds(322, 34, 96, 63);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Tot.");
        lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
        lblNewLabel_2.setBounds(40, 403, 70, 31);
        frame.getContentPane().add(lblNewLabel_2);

    }

    public void faiUscireCarta(){
        int x;
        Carta cartaUscita;
        do {
            Random random = new Random();
            x = random.nextInt(50);
            cartaUscita = carte.get(x);

            if (carteUscite.size() == 50){ 
                tempo.stop();
            	JOptionPane.showMessageDialog(null, "Hai risposto a tutte le carte", "Carte finite", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        } while (carteUscite.contains(x));

        carteUscite.add(x);
        System.out.println(cartaUscita);

        parola.setText(cartaUscita.getParola());
        sinonimo1.setText(cartaUscita.getSinonimo1());
        sinonimo2.setText(cartaUscita.getSinonimo2());
        sinonimo3.setText(cartaUscita.getSinonimo3());
        sinonimo4.setText(cartaUscita.getSinonimo4());
        sinonimo5.setText(cartaUscita.getSinonimo5());
    }

    public ArrayList<Integer> getCarteUscite() {
        return carteUscite;
    }

    public void setCarteUscite(ArrayList<Integer> carteUscite) {
        this.carteUscite = carteUscite;
    }

    public int getPassRimanenti() {
        return passRimanenti;
    }

    public void setPassRimanenti(int passRimanenti) {
        this.passRimanenti = passRimanenti;
    }

    public int getTotPunteggio() {
        return totPunteggio;
    }

    public void setTotPunteggio(int totPunteggio) {
        this.totPunteggio = totPunteggio;
    }

    public JTextField getParola() {
        return parola;
    }

    public void setParola(JTextField parola) {
    	this.parola = parola;
    }

    public JTextField getSinonimo1() {
        return sinonimo1;
    }

    public void setSinonimo1(JTextField sinonimo1) {
    	this.sinonimo1 = sinonimo1;
    }

    public JTextField getSinonimo2() {
        return sinonimo2;
    }

    public void setSinonimo2(JTextField sinonimo2) {
    	this.sinonimo2 = sinonimo2;
    }

    public JTextField getSinonimo3() {
        return sinonimo3;
    }

    public void setSinonimo3(JTextField sinonimo3) {
    	this.sinonimo3 = sinonimo3;
    }

    public JTextField getSinonimo4() {
        return sinonimo4;
    }

    public void setSinonimo4(JTextField sinonimo4) {
    	this.sinonimo4 = sinonimo4;
    }

    public JTextField getSinonimo5() {
        return sinonimo5;
    }

    public void setSinonimo5(JTextField sinonimo5) {
    	this.sinonimo5 = sinonimo5;
    }

    public JTextField getTeam() {
        return team;
    }

    public void setTeam(JTextField team) {
        this.team = team;
    }

    public JTextField getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(JTextField punteggio) {
		this.punteggio = punteggio;
	}
	
    public JLabel getTimer() {
        return timer;
    }

    public void setTimer(JLabel timer) {
        this.timer = timer;
    }

    public JTextField getContaParole() {
        return punteggio;
    }

    public JButton getBtnPass() {
        return btnPass;
    }

    public void setBtnPass(JButton btnPass) {
        this.btnPass = btnPass;
    }

	public JButton getBtnStart() {
		return btnStart;
	}

	public void setBtnStart(JButton btnStart) {
		this.btnStart = btnStart;
	}
}
