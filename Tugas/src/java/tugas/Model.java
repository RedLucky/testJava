/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;
/**
 *
 * @author lucky
 */
public class Model extends HttpServlet{
    private int mode;
    private int jumlah;
    private PrintWriter out;
    
    public Model (int paramMode, int paramJumlah, PrintWriter paramOut){
        this.mode = paramMode;
        this.jumlah = paramJumlah;
        this.out = paramOut;
    }

    public int getMode() {
        return mode;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    public void getModel(){
//        segitiga kiri
        if (mode == 1) {
            for (int i = 0; i < jumlah; i++) {
                for (int j = 0; j <= i; j++) {
                    out.println("*");
                }
                out.print("<br />");
            }
//        Segitiga Kanan
        } else if(mode == 2) {
//            baris
            for (int i = 0; i < jumlah; i++) {
//              spasi
                for (int k = 0; k < jumlah-i; k++) {
                        out.println("&nbsp;&nbsp;");
                }
//              kolom
                for (int j = 0; j <= i; j++) {                   
                    out.println("*");
                }
            out.print("<br />");
            }          
        }
         /* Hasil Jajar Genjang */
        else if(mode == 3){
           
            //            baris
            for (int i = 0; i < jumlah; i++) {
//              spasi
                for (int k = 0; k < jumlah-i; k++) {
                        out.println("&nbsp;");
                }
//              kolom
                for (int j = 0; j <jumlah; j++) {                   
                    out.println("*");
                }
            out.print("<br />");
            }          
            
        }
    }
}
