/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author cst140043
 */
public class TextFile {
    private static User user;
    private static TextFile instance = null;
    private static String filename;
    
    public void setUser(User user){
        this.user = user;
    }
    
    private TextFile(){
    
    }
    
    public static TextFile getInstance(String filename) {
        if(instance == null) {
            instance = new TextFile();
        }
        TextFile.filename = filename;
        return instance;
    }
    
    public void readFile() throws InsufficientPermissionException, FileNotFoundException, IOException{
        BufferedReader bf = new BufferedReader(new FileReader(new File(filename)));
        
        if(TextFile.user instanceof Teacher){
            System.out.println("File is being reading.. by " + TextFile.user );
            System.out.println("---- db ----");
            String line;
            while((line = bf.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("-------------");
        }
        else{
            throw new InsufficientPermissionException();
        }
        bf.close();
    }
    
    
    public void writeFile(String text) throws InsufficientPermissionException, IOException{
        
        BufferedWriter br = new BufferedWriter(new FileWriter(new File(filename), true));
        
        if(TextFile.user instanceof Student){
            System.out.println("File is updated by " + TextFile.user);
            br.append(text);
        }
        else{
            throw new InsufficientPermissionException();
        }
        
        br.close();
    }
}
