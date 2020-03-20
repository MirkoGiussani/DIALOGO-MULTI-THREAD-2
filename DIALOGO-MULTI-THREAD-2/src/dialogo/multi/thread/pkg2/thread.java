/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogo.multi.thread.pkg2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mirko
 */
public class thread implements Runnable {

    Thread T;
    private char nome;  //il nome o è a oppure b
    private int contatore;
    String[] discorso = new String[22];

    thread(char nome, int contatore) throws InterruptedException {
        T = new Thread(this);
        T.start();
        this.nome = nome;
        this.contatore = contatore;
        dialogo();  //popolo l'array
    }

    public char getNome() {
        return nome;
    }

    public int getContatore() {
        return contatore;
    }

    public void stampaPari() {
        for (int i = 0; i < 20; i++) {
            if ((i % 2) == 0) {
                System.out.println(discorso[i]);
            }
        }
    }

    public void stampaDispari() {
        for (int i = 0; i < 20; i++) {
            if ((i % 2) != 0) {
                System.out.println(discorso[i]);
            }
        }
    }

    public void dialogo() throws InterruptedException {
        //discorso a (num. pari)
        discorso[0] = "Ciao io sono thread1";
        discorso[2] = "come stai?";
        discorso[4] = "bene, mi fa molta paura la storia del virus";
        discorso[6] = "no ma come, sei matto? è un discorso molto grave, io non esco di casa da giorni";
        discorso[8] = "ti ammalerai, e poi dirai che avevo ragione";
        discorso[10] = "ma cosa dici, al telegiornale hanno detto che tutti possono ammalarsi";
        discorso[12] = "potrà anche essere ma io sono molto spaventato";
        discorso[14] = "se lo dici tu, a proposito come sta andando la scuola";
        discorso[16] = "che noia, sono davvero brutte";
        discorso[18] = "si io preferivo andare a scuola, è di gran lunga più educativo";
        discorso[20] = "va beh sei il solito, ora vado che mi chiamano, ciao thread2";

        //discorso b (num. dispari)
        discorso[1] = "Ciao io invece sono thread2";
        discorso[3] = "molto bene grazie, tu?";
        discorso[5] = "a me no, secondo me è tutto un esagerazione";
        discorso[7] = "sei il solito esagerato, io sono fuori perfino ora";
        discorso[9] = "sono solo sciocchezze, fidati i giovani non si ammalano";
        discorso[11] = "ma al telegiornale esagerano sempre si sa";
        discorso[13] = "vabbè vedrai che ti passerà";
        discorso[15] = "bene dai, stiamo facendo le videolezioni";
        discorso[17] = "preferivi andare a scuola? a me non dispiacciono";
        discorso[19] = "sei il solito secchione, io me ne sto a casa a giocare alla play";
        discorso[21] = "ciao";
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 22; i++) {
                Thread.sleep(1000);
                if (getNome() == 'a') {  //se pari
                    if ((getContatore() % 2) == 0) {
                        System.out.println("A: " + discorso[contatore]);
                    } else {
                        System.out.print("");
                    }
                } else if (getNome() == 'b') {
                    if ((getContatore() % 2) != 0) {
                        System.out.println("B: " + discorso[contatore]);
                    } else {
                        System.out.print("");
                    }
                }
                contatore++;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(thread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
