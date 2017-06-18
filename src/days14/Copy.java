package days14;

import java.io.*;

/**
 * Created by Administrator on 2017/5/14.
 *
 *
 */

class Copy {
    public static void main(String[] args) {
        new Copy().seaDir("C:\\Test", "D:\\Test\\");
    }

    public void copy(String OpenPath, String Copypath) {
        try (FileInputStream in = new FileInputStream(OpenPath);
             FileOutputStream out = new FileOutputStream(Copypath)) {
            byte[] buffer = new byte[1024];
            int n = 0;
            while ((n = in.read(buffer)) != -1) {
                out.write(buffer, 0, n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void seaDir(String path, String dic) {
        File file = new File(path);
        File[] fs = file.listFiles();
        if (fs != null) {
            for (int i = 0; i < fs.length; i++) {
                if (fs[i].isDirectory()) {
                    dic=dic+fs[i].getName();
                    File nfile = new File(dic);
                    nfile.mkdirs();
                    dic+="\\";
                    seaDir(fs[i].getPath(), dic);
                }
                else{
                    copy(fs[i].getAbsolutePath(),dic+fs[i].getName());
                }
            }
        }
    }
}