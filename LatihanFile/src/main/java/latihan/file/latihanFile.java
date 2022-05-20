/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.io.ObjectInputStream;
/**
 *
 * @author HP
 */
public class latihanFile {
    
    public static void main(String[] args) { 
       try { 
            File f = new File("objek.dat"); 
       FileInputStream fis = new FileInputStream(f); 
       ObjectInputStream ois = new ObjectInputStream(fis); 
       Mahasiswa mhs = (Mahasiswa) ois.readObject(); 
       System.out.println(mhs.getNim()); 
       System.out.println(mhs.getNama()); 
       ois.close(); 
       fis.close(); 
        } catch (FileNotFoundException ex) { 
            System.err.println("File tidak ditemukan"); 
        } catch (IOException ex) { 
            System.err.println("File gagal dibaca"); 
        } catch (ClassNotFoundException ex) { 
            System.err.println("Format File salah"); 
        }
       //try { FileOutputStream fos = new FileOutputStream("objek.dat"); ObjectOutputStream oos = new ObjectOutputStream(fos); Mahasiswa mhs = new Mahasiswa(); mhs.setNim("1234"); mhs.setNama("Andi"); oos.writeObject(mhs); oos.close(); fos.close(); } catch (FileNotFoundException ex) { Logger.getLogger(latihanFile.class.getName()).log(Level.SEVERE, null, ex); } catch (IOException ex) { Logger.getLogger(latihanFile.class.getName()).log(Level.SEVERE, null, ex); }
    } 
}