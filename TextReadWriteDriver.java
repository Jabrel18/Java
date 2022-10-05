package com.cognixia.jump.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TextReadWriteDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// relative path is generally the best thing to use because of file location
		// portable
		String relativeFilepath = "resources1/temp.txt";
		File file = new File(relativeFilepath);

		// This file reps a folder /directory
		File resourceFolder = new File("resources1");

		// check if file exists at relative path location specified
		System.out.println("Does file exist? " + relativeFilepath + " :" + file.exists());

		// if file does not exist, make
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File created: " + file.getName());
			} catch (IOException e) {
				if (!resourceFolder.exists()) {

					if (resourceFolder.mkdir()) {
						System.out.println("Folder: " + resourceFolder.getName() + " created.");
					} else {
						System.out.println("Folder unable to be created. ");

					}

				}
				System.out.println("File " + file.getName() + "could not be created with path " + file.getPath());

			}

		}

		// sample meta data from the file
		System.out.println(file.getAbsolutePath());
		Date modified = new Date(file.lastModified());
		System.out.println(modified.toString());

	}

}
