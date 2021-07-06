package d.io;

import java.io.File;
import java.text.DecimalFormat;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "C:\\godofjava";
        long sum = sample.printFileSize(path);
        System.out.println(path + "'s total size = " + sample.convertFileLength(sum));
    }

    public long printFileSize(String dirName) {
        File dir = new File(dirName);
        long sum = 0;
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            for (File file : fileList) {
                if (file.isFile()) {
                    String tempFileName = file.getAbsolutePath();
                    long fileLength = file.length();
                    System.out.println(tempFileName + " = " + fileLength);
                    sum += fileLength;
                } else {
                    String tempDirName = file.getAbsolutePath();
                    long fileLength = printFileSize(tempDirName);
                    System.out.println("tempDir = " + fileLength);
                    sum += fileLength;
                }
            }
        }
        return sum;
    }
    private String convertFileLength(long fileLength){
        if(0<=fileLength && fileLength<=1024){
            return fileLength+" b";
        }
        else{
            return 1.0*fileLength/1024+" kb";
        }
    }
}
