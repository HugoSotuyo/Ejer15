/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer15_introjava;

/**
 *
 * @author hdsot
 */
public class Ejer15_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]num=new int[100];
        descendente(num);
    }
    public static void descendente(int[]num){
        for (int i=0;i<100;i++){
            num[i]=i;
        }
        for (int i=0;i<100;i++){
            System.out.print("[" + num[99-i] + "]");
        }
        
    }
}
