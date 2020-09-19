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
		
		BufferedInputStream bis = new BufferedInputStream(fis);				//��������������,�����������а�װ�����ø���ǿ��
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
		System.out.println("�Ѿ�ʹ�û����������ļ�");
	}
	
	public static void main(String[] args) throws IOException {
		copyFileByBuffer("D:\\DeskTop");
	}
}
