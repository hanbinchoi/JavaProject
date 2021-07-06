package d.io;

import java.io.File;
import java.io.IOException;

public class FileManageClass {
    public static void main(String[] args){
        FileManageClass sample = new FileManageClass();
        String pathName = File.separator+"godofjava"+File.separator+"text";
        String fileName = "test.txt";
        sample.checkList(pathName);
        sample.checkFile(pathName,fileName);
    }
    public void checkList(String pathName){
        File file;
        try{
            file = new File(pathName);
            File[] mainFileList = file.listFiles();
            for(File temp: mainFileList){
                System.out.println(temp.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void checkFile(String pathName, String fileName){
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result "+file.createNewFile());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
