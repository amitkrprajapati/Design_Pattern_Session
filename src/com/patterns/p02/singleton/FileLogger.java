package com.patterns.p02.singleton;

public class FileLogger {

	private static FileLogger fileLogger;
	public static synchronized  FileLogger getInstance()
	{
		if(fileLogger == null)
		{
			fileLogger = new FileLogger();
		}
		return  fileLogger;
	}
	public void log(String message)
	{
		System.out.println("[LOG] "+this.hashCode()+" " +  message);
	}
	private FileLogger()
	{
	}
}
