/**
 * 
 */
package com.sdp;

import java.io.IOException;

import testData.FileReaderClass;

public class FileReaderManager {

	private FileReaderManager()
	{
		
	}
	
	public static FileReaderManager getInstatnceFRM()
	{
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public FileReaderClass getInstanceFR() throws IOException
	{
		FileReaderClass fr = new FileReaderClass();
		return fr;	
	}
	
}
