package no.uib.nutritionapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class ActivityLevel extends Activity {
	
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_level);
        
        
        //--- Radiogroup listener
        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
        Intent i = new Intent();
        radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
        		RadioButton radioBtn1 = (RadioButton) findViewById(R.id.radioLowIntensity);
        		RadioButton radioBtn2 = (RadioButton) findViewById(R.id.radioMediumIntensity);
        		RadioButton radioBtn3 = (RadioButton) findViewById(R.id.radioHighIntensity);
        		
        		if(radioBtn1.isChecked()) {
        			//do something         	
        			System.out.println("hello");
        		}
        		
        		if(radioBtn2.isChecked()) {
        			//do something
        			System.out.println("hello2");
        		}
        		
        		if(radioBtn3.isChecked()) {
        			//do something
        			System.out.println("hello3");
        		}
			}
		});
        
        //--Next-button listener
        Button nextButton = (Button) findViewById(R.id.btn_activityNext);
        nextButton.setOnClickListener(new View.OnClickListener() {
        	
        	public void onClick(View v) {
        		//do something
        		System.out.println("next-button-pressed");
        	}
        });
    }
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_activity_level, menu);
        return true;
    }
}