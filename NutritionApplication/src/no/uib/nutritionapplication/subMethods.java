package no.uib.nutritionapplication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import android.widget.EditText;

public class subMethods {

	private String name; //store to filename
	private File directory;
	
	
	
	public subMethods(){
		//generates new subMethod
	}
	
	
	
	public void setFilename(String filename){
		this.name = filename;
	}
		
	public void setDirectory(File file){
		this.directory = file;
	}
	
	
	
	
	public void storeData(EditText inputText){
  		try {
  			FileOutputStream fos = new FileOutputStream(name);
  			fos.write(inputText.getText().toString().getBytes());
  			fos.close();
  		} 
  		catch (IOException e) {
  			e.printStackTrace();
  		}

	}
	
	public String getData(){
  		try {
  			String myData = "";
  			FileInputStream fis = new FileInputStream(directory);
  			DataInputStream in = new DataInputStream(fis);
  			BufferedReader br =	new BufferedReader(new InputStreamReader(in));
  			String strLine;
  			
  			while ((strLine = br.readLine()) != null) {
  				myData += strLine;
  			}
  			in.close();
  			return myData;
  		} 
  		catch (IOException e) {
  			e.printStackTrace();
  			return "something went wrong while reading data";
  		}
  		

	}
}
