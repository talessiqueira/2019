package aplicacao;

public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // O programa inicia com a tela Open.
        Open open = new Open();
        open.setVisible(true);
        
        // Essa primeira tela é exibida por 10s.
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException ex)
        {
           Thread.currentThread().interrupt();
        }
        open.dispose();
        
        // Em seguida, surge a tela principal.
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
}
