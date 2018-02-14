package com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Path1 {

	public static void main(String[] args) throws IOException {
		Path path= Paths.get("E:\\java\\ppts\\..\\Assignment1.rtf");
		// Normalizing means that it removes all the . and .. codes in the middle of the path string, and resolves what path the path string refers to. 
		Path path2= path.normalize();
		System.out.println(path2);
		boolean pathExists =
		        Files.exists(path,
		            new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
		System.out.println(pathExists);
		Path path1 = Paths.get("E:\\java\\ppts");
		//If the directory already exists, a java.nio.file.FileAlreadyExistsException will be thrown. If something else goes wrong, an IOException may get thrown.
		 Path newDir = Files.createDirectory(path1);


	}

}
