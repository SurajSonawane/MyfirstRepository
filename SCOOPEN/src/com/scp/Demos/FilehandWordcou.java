package com.scp.Demos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilehandWordcou {
public static void main(String[] args) throws IOException {
	File f=new File("E:\\newFile.txt");
	FileReader filereader=new FileReader(f);
    BufferedReader buffer=new BufferedReader(filereader);
    String line=null;
    int linecount=0;
    int wordcount=0;
    while((line=buffer.readLine()) != null  ){
           linecount++;  
    }System.out.println(linecount);
     
}
}
