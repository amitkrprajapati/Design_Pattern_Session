package com.patterns.p02.singleton;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello Singleton Pattern");

		FileLogger file1 =  FileLogger.getInstance();
		FileLogger file2 =  FileLogger.getInstance();

		if(file1 == file2)
		{
			System.out.println("Both Object are Same");
		}
		else System.out.println("Both Object are different");

		file1.log("Logging from Object 1");
		file2.log("Logging from Object 2");
	}
}
