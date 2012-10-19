package no.uib.nutritionapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class DietPlanActivity extends Activity {
	
	private RadioGroup radioGroup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);
        
        /** Create radiogroup with radiobuttons so the user can choose a goal.
         * RadioGroup with listener  **/
        
        radioGroup = (RadioGroup) findViewById(R.id.DietradioGroup);
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
								
			}
		});
        
        /** Connects the button to existing id in XML, creates listener.  **/
        Button nextButton = (Button) findViewById(R.id.btn_DietActivityNext);
        nextButton.setOnClickListener(new OnClickListener() {
			
        	/** Connects radiobutton to the checked radiobutton, retrieves intentFromActivityLevel and all 
        	 * the data in that intent to a new intent "intent".  **/
        	
			public void onClick(View v) {
				RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
				Intent intentFromActivityLevel = getIntent();
				Intent intent = new Intent(DietPlanActivity.this, DisplayMessageActivity.class);
				intent.putExtras(intentFromActivityLevel);
				intent.putExtra("dietPlan", radioButton.getText().toString());
				System.out.println(radioButton.getText().toString());
				startActivity(intent);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_diet_plan, menu);
        return true;
    }
}
