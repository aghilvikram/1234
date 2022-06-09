package javaprojectvik;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f= new File("D:\\folder1\\folder2\\new1.txt");
		//boolean folders = f.mkdirs();
		//System.out.println(folders);

		boolean f1 = f.createNewFile();
		System.out.println(f1);
		boolean d1 = f.isDirectory();
		System.out.println(d1);
		boolean f2 = f.isFile();
		System.out.println(f2);
		boolean canRead = f.canRead();
		System.out.println(canRead);
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		boolean canExecute = f.canExecute();
		System.out.println(canExecute);
		FileUtils.write(f, "hi vikram welcome to file creation");
		
		FileUtils.write(f, "hi devi how are you", true);
		String m = FileUtils.readFileToString(f);
		System.out.println(m);
	}
		//String[] list = f.list();
		/*File f= new File("D:\\");
		String[] list = f.list();
		for (String s1 : list) {
			
		
			System.out.println(s1);
		}
		
		File[] listFiles = f.listFiles();
		for (File fi : listFiles) {
			System.out.println(fi);
		}*/
	}


