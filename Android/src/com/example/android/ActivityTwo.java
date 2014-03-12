package com.example.android;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_activity);
		
		Button btn =(Button)findViewById(R.id.toActivity2);
		
		SharedPreferences actvs = PreferenceManager.getDefaultSharedPreferences(ActivityTwo.this);
		boolean checkBox = actvs.getBoolean("pref_activity2", true);
		if (checkBox == false){
			btn.setTextAppearance(this,R.style.label);
		}
		else
			btn.setTextAppearance(this,  R.style.label1);
		
	}
	
	public void toActivity3 (View view){
		Intent intent = new Intent(this,ActivityThree.class);
		startActivity(intent);

	}



}