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
	private RadioGroup radiogroup;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_level);


		//--- Radiogroup listener
		radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
		final Intent intent = new Intent();
		radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton radioBtn1 = (RadioButton) findViewById(R.id.radioLowIntensity);
				RadioButton radioBtn2 = (RadioButton) findViewById(R.id.radioMediumIntensity);
				RadioButton radioBtn3 = (RadioButton) findViewById(R.id.radioHighIntensity);

				group.addView(radioBtn1);
				group.addView(radioBtn2);
				group.addView(radioBtn3);
				//				group.getFocusedChild();
			}
		});
		
		Button nextButton = (Button) findViewById(R.id.btn_activityNext);
		nextButton.setOnClickListener(new View.OnClickListener() {


			public void onClick(View v) {
				RadioButton b = (RadioButton) radiogroup.getFocusedChild();
				b.getText();
				System.out.println(b.getText());
				
			}
		});
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_activity_level, menu);
		return true;
	}
}