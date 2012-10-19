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

		/**
		 * Radiobutton and button listeners. Retrieves a intent from
		 * Nutritionhandler and adds "activityLevel" which is send to
		 * displaymessage
		 **/
		
		radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
		radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			public void onCheckedChanged(RadioGroup group, int checkedId) {

			}
		});

		Button nextButton = (Button) findViewById(R.id.btn_activityNext);
		nextButton.setOnClickListener(new View.OnClickListener() {

			/**
			 * When the next-button is clicked, add Ativitlevel to existing
			 * intent and pass it to startActivity Creating a new intent that
			 * will start the next activity, DisplayMessageActivity, and puts in
			 * it the intent received from ActivityLevel.
			 **/

			public void onClick(View v) {
				RadioButton radioButton = (RadioButton) findViewById(radiogroup.getCheckedRadioButtonId());
				Intent intent = new Intent(ActivityLevel.this,DietPlanActivity.class);
				Intent exsistingIntent = getIntent();
				exsistingIntent.putExtra("activityLevel", radioButton.getText().toString());
				intent.putExtras(exsistingIntent);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_activity_level, menu);
		return true;
	}
}