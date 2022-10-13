/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;
import javax.swing.JOptionPane;
/**
 *
 * @author G  A  L  I  H
 */
public class bangundatar {
    private int sisi1;
    private int sisi2;
    private int luas;
    
    public int getSisi1(){
        return sisi1;
    }
    public void setSisi1(int sisi1){
        this.sisi1 = sisi1;
    }
    public int getSisi2(){
        return sisi2;
    }
    public void setSisi2(int sisi2){
        this.sisi2 = sisi2;
    }
    public void luaspersegi () {
        JOptionPane.showMessageDialog(null, "Menghitung Luas Persegi");
        String input1 = JOptionPane.showInputDialog("Masukkan Sisi 1 :");
        String input2 = JOptionPane.showInputDialog("Masukkan Sisi 2 :");
        int nilai1 = Integer.parseInt(input1);
        int nilai2 = Integer.parseInt(input2);
        luas = nilai1 * nilai2;
        JOptionPane.showMessageDialog(null,"luas persegi adalah : " + luas);
    }}