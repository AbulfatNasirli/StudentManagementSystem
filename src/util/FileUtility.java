package util;

import java.io.*;

public class FileUtility {

    public static Object readObject(String fileName){
        Object obj = null;
        try(FileInputStream fip = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fip);) {
            obj = objectInputStream.readObject();
        } finally {
            return obj;
        }
    }

    public static boolean writeObject(Object object, String fileName)throws Exception  {
       try(FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fout);){
           oos.writeObject(object);
           return true;
       } catch (RuntimeException ex){
           throw new Exception(ex);
       }
    }
}
