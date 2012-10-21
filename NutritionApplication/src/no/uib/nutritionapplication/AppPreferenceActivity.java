package no.uib.nutritionapplication;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.content.Intent;
import android.view.View;

public class AppPreferenceActivity extends PreferenceActivity{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/** Load preferences from XML file
		 * It's deprecated, but couldn't find a solution right now. **/
		addPreferencesFromResource(R.xml.appreferences);
	}
	
//	public void onClickLoad(View view) {
//		Intent i = new Intent("no.uib.nutritionapplication.Nutritionhandler");
//		startActivity(i);
//	}
}
