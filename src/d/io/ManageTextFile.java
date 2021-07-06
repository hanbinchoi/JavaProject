package d.io;
import java.io.*;

import static java.io.File.separator;
public class ManageTextFile {
    public static void main(String[] args){
        ManageTextFile manager = new ManageTextFile();
        int numberCount = 10;
        String fullPath = separator+"godofjava"+separator+"text"+separator+"numbers.txt";
        manager.writeFile(fullPath,numberCount);
        manager.readFile(fullPath);
    }
    public void readFile(String fileName){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data=bufferedReader.readLine()) != null){
                System.out.println(data);
            }
            System.out.println("Success");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fileReader != null){
                try{
                    fileReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }
    }
    public void writeFile(String fileName, int numberCount){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(int i=0;i<numberCount;i++){
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.newLine();
            }
            System.out.println("Success");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bufferedWriter !=null){
                try{
                    bufferedWriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fileWriter != null){
                try{
                    fileWriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
