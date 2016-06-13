package com.java.file_util;

import org.junit.Test;
import java.io.File;

public class FileUtilTest {
	
	public final static String se = File.separator;
	public final static String objectPath = "C:" + se + "temp" + se + "test" + se;
	@Test
	public void testdeleteExistedDRLFile(){ 
		String str = "txt";
		FileUtil.deleteExistedDRLFile(objectPath,str);
	}
	
	@Test
	public void testcreareDirectory(){
		boolean flag = FileUtil.creareDirectory(objectPath);
		System.out.println(flag);
	}
	
	@Test
	public void testbackupFile(){
		String dirName = "t";
		FileUtil.backupFile(objectPath, dirName);
	}
	@Test
	public void testdeleteFolder(){
		String name = "dirName";
		FileUtil.deleteFolder(objectPath, name);
	}
}
