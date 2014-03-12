
package com.example.android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class MainActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn =(Button)findViewById(R.id.toActivity1);
		
		SharedPreferences actvs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
		boolean checkBox = actvs.getBoolean("pref_activity1", true);
		if (checkBox == false){
			btn.setTextAppearance(this,R.style.label);
		}
		else
			btn.setTextAppearance(this,  R.style.label1);
		

}	
		
	    @Override
		public boolean onCreateOptionsMenu(Menu menu){
			getMenuInflater().inflate(R.menu.main,  menu);
			return true;
		}
		public void toActivity2 (View view){
			Intent intent = new Intent(this,ActivityTwo.class);
			startActivity(intent);
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item){
				Toast.makeText(this, "menu option selected", Toast.LENGTH_SHORT).show();
				
				 if(item.getItemId() == R.id.action_settings){
					/// R.style.Button1= true;
					Intent intent = new Intent(this, SettingsActivity.class);
					startActivity(intent);
				}
				return super.onOptionsItemSelected(item);
		}
		
	
}

