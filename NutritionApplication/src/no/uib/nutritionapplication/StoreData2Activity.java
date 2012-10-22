package no.uib.nutritionapplication;

import java.io.File; 
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
public class StoreData2Activity extends Activity implements OnClickListener{
 
 private String filename = "MySampleFile.txt";
 private String filepath = "MyFileStorage";
 File myInternalFile;

 
 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_store_data2);
 
  ContextWrapper contextWrapper = new ContextWrapper(getApplicationContext());
  File directory = contextWrapper.getDir(filepath, Context.MODE_PRIVATE);
  myInternalFile = new File(directory , filename);
 
  Button saveToInternalStorage =
   (Button) findViewById(R.id.saveInternalStorage);
  saveToInternalStorage.setOnClickListener(this);
 
  Button readFromInternalStorage =
   (Button) findViewById(R.id.getInternalStorage);
  readFromInternalStorage.setOnClickListener(this);
 }

 
 
 public void onClick(View v) {
  EditText myInputText = (EditText) findViewById(R.id.myInputText);
  TextView responseText = (TextView) findViewById(R.id.responseText);
  String myData = "";

	subMethods s = new subMethods();
	s.setFilename("profile");
	s.setDirectory(myInternalFile);
  
  switch (v.getId()) {
  	case R.id.saveInternalStorage:
  		s.storeData(myInputText);
  		
  		myInputText.setText("");
  		responseText.setText("text have been saved to Internal Storage...");
  		break;
 
  	case R.id.getInternalStorage:
  		s.getData();
  		
  		myInputText.setText(myData);
  		responseText.setText("text have been retrieved from Internal Storage...");
  		break;
  	}
  }
}