
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Hilo extends Thread{
    private JProgressBar barra;
    private int Paga;

    public Hilo(JProgressBar barra, int Paga) {
        this.barra = barra;
        this.barra.setMaximum(Paga / 1000);
        this.Paga = Paga;
    }
    
    public void run(){
        for (int i = 0; i <= barra.getMaximum(); i++) {
            try{
                 barra.setValue(barra.getValue() + 1);
            
            Thread.sleep(1000);
            }catch(Exception e){
                
         }
       }
    }
}
