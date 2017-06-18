package days14;

import java.io.*;

/**
 * Created by Administrator on 2017/5/19.
 * ����BufferedInputStream/BufferedOutputStream����copy
 */
public class Copy2 {
    public static void main(String[] args) {
        new Copy2().seaDir("E:\\Test", "E:\\Test2\\");
    }

    /**
     * ��inputPath·���µ��ļ�COPY��outputPath·��
     */
    public void copy(String inputPath, String outputPath) {
        File file = new File(inputPath);
        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(outputPath);
             BufferedInputStream bis = new BufferedInputStream(fis, 1024);
             BufferedOutputStream bos = new BufferedOutputStream(fos, 1024)
        ) {
            byte[] buffer = new byte[1024];
            int n = 0;
            while ((n = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * һ��һ��Ѱ����Ŀ¼������
     * */
    public void seaDir(String inputPath, String outputPath) {
        File file = new File(inputPath);
        File[] fileList = file.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].isDirectory()) {
                    outputPath += fileList[i].getName();
                    File files = new File(outputPath);
                    files.mkdirs();
                    outputPath += "\\";
                    seaDir(fileList[i].getPath(), outputPath);
                } else {
                    copy(fileList[i].getAbsolutePath(), outputPath + fileList[i].getName());
                }
            }
        }
    }
}
