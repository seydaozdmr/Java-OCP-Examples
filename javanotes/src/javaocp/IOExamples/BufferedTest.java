package javaocp.IOExamples;

import java.io.*;

public class BufferedTest {
    static void copyFile(File src, File dest) throws IOException {
        try(var in=new FileInputStream(src);var out=new FileOutputStream(dest)){
            int b;
            while((b=in.read())!=-1){
                out.write(b);
            }
        }
    }

    static void copyFileWithBuffer(File src,File dest) throws IOException{
        try(var in = new BufferedInputStream(new FileInputStream(src));
           var out = new BufferedOutputStream(new FileOutputStream(dest))){
            var buffer=new byte[32768];
            int lengthRead;
            while((lengthRead = in.read(buffer))>0){
                out.write(buffer,0,lengthRead);
                out.flush();
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        long start=System.currentTimeMillis();
//        copyFile(new File("D:\\Proje Dosyaları\\java kitap\\[JAVA][The Complete Reference Java Ninth Edition].pdf"),new File("[JAVA][The Complete Reference Java Ninth Edition].pdf"));
//        System.out.println("sonuc  : "+(System.currentTimeMillis()-start));

        long start=System.currentTimeMillis();
        copyFileWithBuffer(new File("D:\\Proje Dosyaları\\java kitap\\[JAVA][The Complete Reference Java Ninth Edition].pdf"),new File("[JAVA][The Complete Reference Java Ninth Edition].pdf"));
        System.out.println("sonuc  : "+(System.currentTimeMillis()-start));

    }
}
