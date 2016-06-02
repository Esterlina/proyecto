/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
/**
 *
 * @author Eric Ramirez Santis
 */
public class Musica {
    private static int VolumenBGM;
    private static int VolumenSFX;
    private static String MusicaBatalla;
    private static Player Audio;
    private static FileInputStream fis;
    private static BufferedInputStream bis;
    private static boolean loop = false;
    
    private static void detenerBGM()    {
        loop = false;
        Audio.close();
    }
    
    public static void reproducirBGM(String Archivo) throws FileNotFoundException, JavaLayerException{
        if (loop){
        detenerBGM();}
        loop = true;
        while (loop){
            fis = new FileInputStream("src/Audio/BGM/"+Archivo+".mp3");
            bis = new BufferedInputStream(fis);
            Audio = new Player(bis);
            Audio.play();}
    }

    public static void reproducirBGM() throws FileNotFoundException, JavaLayerException{
        if (loop){
        detenerBGM();}
        loop = true;
        while (loop){
            fis = new FileInputStream("src/Audio/BGM/"+MusicaBatalla+".mp3");
            bis = new BufferedInputStream(fis);
            Audio = new Player(bis);
            Audio.play();}
    }
  
    public static void reproducirSFX(String Archivo) throws FileNotFoundException, JavaLayerException{
        FileInputStream fis2 = new FileInputStream("src/Audio/SFX/"+Archivo+".mp3");
        BufferedInputStream bis2 = new BufferedInputStream(fis);
        Player Audio2 = new Player(bis);
        Audio2.play();
    }
  
    public static void cargarDatabase() throws FileNotFoundException, IOException{
        FileReader FILE;
        BufferedReader br;
        FILE = new FileReader("src/Database/Audio.txt");
        br = new BufferedReader(FILE);
        String lector = br.readLine();
        lector = lector.replaceAll(" ", "");
        lector = lector.replaceAll("\n", "");
        VolumenBGM = Integer.parseInt(lector);
        lector = br.readLine();
        lector = lector.replaceAll(" ", "");
        lector = lector.replaceAll("\n", "");
        VolumenSFX = Integer.parseInt(lector);
        lector = br.readLine();
        lector = lector.replaceAll("\n", "");
        MusicaBatalla = lector;
        br.close();
        FILE.close();
    }
    
    public static void guardarDatabase(int VolumenBGM, int VolumenSFX, String Cancion) throws IOException{
        FileWriter FILE;
        BufferedWriter bw;
        FILE = new FileWriter("src/Database/Audio.txt",true);
        bw = new BufferedWriter(FILE);
        bw.write(VolumenBGM);
        bw.newLine();
        bw.write(VolumenSFX);
        bw.newLine();
        bw.write(Cancion);
        bw.close();
        FILE.close();    
    }
}

