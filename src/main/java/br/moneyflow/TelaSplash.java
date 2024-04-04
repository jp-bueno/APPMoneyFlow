package br.moneyflow;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class TelaSplash {
    
    private final int LARGURA_IMG = 400;
    private final int ALTURA_IMG = 300;
    private final int TEMPO_DE_SPLASH = 3000; // Tempo de splash em milissegundos
    private final String CAMINHO_GIF = "gif.gif";
    
    public TelaSplash(){
    	
        JWindow janelaSplash = new JWindow();
        
        janelaSplash.getContentPane().add(
                new JLabel("", new ImageIcon(getClass().getResource(CAMINHO_GIF)),SwingConstants.CENTER
                )
        );      
              
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        
        janelaSplash.setBounds(
                (dimension.width - LARGURA_IMG) / 2,
                (dimension.height - ALTURA_IMG)/ 2,
                LARGURA_IMG,
                ALTURA_IMG
        ); 
        janelaSplash.setVisible(true);
        
        // Esperar o tempo de splash antes de fechar a janela
        Timer timer = new Timer();
        timer.schedule(new FecharJanelaTask(janelaSplash), TEMPO_DE_SPLASH);
    }

    // Classe interna que estende TimerTask para representar a tarefa de fechar a janela
    class FecharJanelaTask extends TimerTask {
        private JWindow janela;

        public FecharJanelaTask(JWindow janela) {
            this.janela = janela;
        }

        @Override
        public void run() {
            // Fechar a janela após o tempo de splash
            janela.dispose();
        }
    }
}