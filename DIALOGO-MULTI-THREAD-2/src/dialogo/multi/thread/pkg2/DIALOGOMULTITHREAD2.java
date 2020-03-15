/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogo.multi.thread.pkg2;

/**
 *
 * @author Mirko
 */
public class DIALOGOMULTITHREAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int contatore = 0;

        Thread T1; 
        Thread T2;
        
        for (int i = 0; i < 22; i++) {  //i dialoghi sono 22
            
            Thread.sleep(1000);
            T1 = new Thread(new thread('a', contatore));
            Thread.sleep(1000);
            T2 = new Thread(new thread('b', contatore));
            
            contatore++;
        }
    }

}
