package day03_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem02 {
	public static void copyFileByFileStream(String path) throws IOException {
		File file  = new File(path+ File.separator + "myfile.txt");
		if(!file.exists()) {
			file. createNewFile();
		}
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(path+ File.separator + "myfile_cp.txt");
		
		byte[] arr = new byte[1024];
		int len;
		try {
			while((len = fis.read(arr)) != -1) {
				fos.write(arr,0,len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			fis.close();
			fos.close();
			System.out.println("已经使用文件流复制文件");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		copyFileByFileStream("D:\\DeskTop");
	}
}
