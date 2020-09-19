package day03_homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem03 {
	public static void copyFileByBuffer(String path) throws IOException {
		File file  = new File(path+ File.separator + "myfile.txt");
		if(!file.exists()) {
			file. createNewFile();
		}
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(path+ File.separator + "myfile_cp2.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fis);				//创建缓冲区对象,对输入流进行包装让其变得更加强大
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
		System.out.println("已经使用缓冲流复制文件");
	}
	
	public static void main(String[] args) throws IOException {
		copyFileByBuffer("D:\\DeskTop");
	}
}
