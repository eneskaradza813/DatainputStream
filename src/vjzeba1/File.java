package vjzeba1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class File {

    public static void main(String[] args) {
        
        int variableA = 13;
        double variableB = 13.13;
        String variableC = "Zdravo";
        try(DataInputStream out = new DataInputStream(new FileInputStream("yourFile.txt"));){
            System.out.println(out.readInt());
            System.out.println(out.readDouble());
            System.out.println(out.readUTF());
        }catch(IOException exc){
            System.out.println(exc);
        }
        }
    }
    

