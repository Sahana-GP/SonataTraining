package com.sonata.streamapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWithoutResource {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:\\test.txt"));
			System.out.println(br.readLine());
			System.out.println(br.nullReader());
		}catch (IOException e) {e.printStackTrace();
	}finally {
		try {
			if (br!= null)
				br.close();
		}catch (IOException ex) {
			ex.printStackTrace();
			}
		}

	}
}