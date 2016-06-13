package com.java.file_util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;

/**
 * 文件操作工具类
 * 
 * @author soul
 * @version v1.0 2014-11-16
 */
public class FileUtil {

	public final static String se = File.separator;
	private final static String FILE_SUFFIX = ".java.drl";
	private final static String FILE_TEMP = "d:/temp/";

	/**
	 * 删除指定路径的文件夹中指定后缀名的所有文件
	 * 
	 * @param objectPath
	 *            文件夹路径
	 * @param str
	 *            文件后缀名
	 * 
	 */
	public static void deleteExistedDRLFile(String objectPath, final String str) {

		File filePath = new File(objectPath);
		if (!filePath.exists()) {
			System.out.println("目录不存在！");
		} else {
			if (filePath.isDirectory()) {
				File[] list = filePath.listFiles(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						return name.endsWith("." + str);
					}
				});
				for (int i = 0; i < list.length; i++) {
					list[i].delete();
					System.out.println(list[i].getName() + " 删除成功！");
				}
				System.out.println("所有 " + "." + str + " 文件删除成功！");
			}
		}
	}

	/**
	 * 创建文件夹
	 * 
	 * @param ObjectPath
	 *            要创建的文件夹路径
	 * @return 返回是否创建文件夹成功
	 */
	public static boolean creareDirectory(String ObjectPath) {

		boolean flag = true;

		File filePath = new File(ObjectPath);

		if (!filePath.exists()) {
			filePath.mkdir();
			flag = false;
		}
		return flag;
	}

	/**
	 * 查看某文件夹下面是否有文件,有文件则创建一个temp文件夹,将文件拷贝到temp目录下(备份文件) 没有文件怎什么都不做
	 * 备份后，把原文件夹里文件删除
	 * 
	 * @param objectPath
	 *            要备份的目录路径
	 * @param dirName
	 *            要备份到的目录名称
	 */
	public static void backupFile(String objectPath, String dirName) {

		String backupPath;

		if (!FILE_TEMP.endsWith(File.separator)) {
			backupPath = FILE_TEMP + File.separator + dirName;
		} else {
			backupPath = FILE_TEMP + dirName;
		}

		File backupFilePath = new File(backupPath);
		if (!backupFilePath.exists()) {
			backupFilePath.mkdirs();
		}
		File filePath = new File(objectPath);
		if (!filePath.exists()) {
			System.out.println("目录不存在!");
		} else {
			if (filePath.isDirectory()) {
				File[] list = filePath.listFiles();
				if (list != null && list.length != 0) {
					copyFolder(objectPath, backupPath);// 文件备份
					for (int i = 0; i < list.length; i++) {
						list[i].delete();
					}
				}
			}
		}
	}

	/**
	 * 复制整个文件夹内容
	 * 
	 * @param oldPath
	 *            String 原文件路径 如：c:/fqf
	 * @param newPath
	 *            String 复制后路径 如：f:/fqf/ff
	 * @return boolean
	 */
	public static void copyFolder(String oldPath, String newPath) {
		try {
			(new File(newPath)).mkdir(); // 如果文件夹不存在 则建立新文件夹
			File a = new File(oldPath);
			String[] file = a.list();
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				if (oldPath.endsWith(se)) {
					temp = new File(oldPath + file[i]);
				} else {
					temp = new File(oldPath + se + file[i]);
				}

				if (temp.isFile()) {
					FileInputStream input = new FileInputStream(temp);
					FileOutputStream output = new FileOutputStream(newPath
							+ "/" + (temp.getName()).toString());

					byte[] b = new byte[1024 * 5];
					int len;
					while ((len = input.read(b)) != -1) {
						output.write(b, 0, len);
					}
					output.flush();
					output.close();
					input.close();
				}
				if (temp.isDirectory()) {// 如果是子文件夹
					copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
				}
			}
		} catch (Exception e) {
			System.out.println("复制整个文件夹内容操作出错");
			e.printStackTrace();
		}
	}

	public static void deleteFolder(String objectPath, String folderName) {

		File filePath = new File(objectPath + folderName);

		while (filePath.isDirectory()) {
			objectPath = objectPath + se + folderName;
			filePath = new File(objectPath);
		}

		String parent = filePath.getParent();
		filePath = new File(parent);
		System.out.println(parent);
		while (filePath.isDirectory()) {
			String parent1 = filePath.getParent();
			System.out.println(filePath.delete());
			filePath = new File(parent1);
		}
		System.out.println("完成");
	}

	public static void deleteFileAndDirectory(String dirName){
		
		String objectPath;
		
		if(FILE_TEMP.endsWith(File.separator)){
			objectPath = FILE_TEMP + File.separator + dirName;
		}else{
			objectPath = FILE_TEMP + dirName;
		}
		
		File filePath = new File(objectPath);
		if(!filePath.exists()){
			filePath.mkdirs();
			System.out.println("目录不存在！");
		}else{
			if(filePath.isDirectory()){
				File[] list = filePath.listFiles();
				for(int i = 0; i < list.length; i++){
					list[i].delete();
				}
			}
			filePath.delete();
		}
	}
	
	public static boolean existFileInDirectory(String objectPath){
		
		boolean flag = false;
		File filePath = new File(objectPath);
		
		if(filePath.exists()){
			File[] list = filePath.listFiles();
			if(list != null && list.length != 0){
				flag = true;
			}
		}
		return flag;
	}
	
	public static void deleteDirectory(String objectPath){
		
		File filePath = new File(objectPath);
		if(filePath.exists()){
			filePath.delete();
		}
	}
	
	public static boolean deleteExistedFile(String objectPath, final String fileName){
		boolean flag =  false;
		File filePath = new File(objectPath);
		if(filePath.exists()){
			if(filePath.isDirectory()){
				File[] list = filePath.listFiles(new FilenameFilter(){
					@Override
					public boolean accept(File dir, String name) {
						return name.equals(fileName);
					}
				});
				for(int i = 0; i < list.length; i++){
					list[i].delete();
				}
				flag =  true;
			}
		}
		return flag;
	}
	
	
}
