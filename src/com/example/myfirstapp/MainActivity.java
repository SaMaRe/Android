package com.example.myfirstapp;

import android.os.Bundle;

import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	private TextView tv;
	private EditText et;
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et =(EditText) findViewById(R.id.input_text);
		tv =(TextView) findViewById(R.id.output_text);
		et.addTextChangedListener(new TextWatcher(){
						@Override
						public void afterTextChanged(Editable s){
							
						}
						@Override
						public void beforeTextChanged(CharSequence s, int start, int count, int after){
							
						}
						@Override
						public void onTextChanged(CharSequence s, int start, int before, int count){
							
							
						}});
			
		}
	public void showToast(View view){
		Toast.makeText(this, "My first Toast!", Toast.LENGTH_SHORT).show();
		
	}
		@Override
		public boolean onCreateOptionsMenu(Menu menu){
			getMenuInflater().inflate(R.menu.main,  menu);
			return true;
	
	}
		@Override
		public boolean onOptionsItemSelected(MenuItem item){
				Toast.makeText(this, "menu option selceted", Toast.LENGTH_SHORT).show();
				if(item.getItemId() == R.id.clear_text){
					et.setText("");
					tv.setText("");
				}else if(item.getItemId() == R.id.action_settings){
					Intent intent = new Intent(this, SettingsActivity.class);
					startActivity(intent);
				}
				return super.onOptionsItemSelected(item);
		}
		


}
