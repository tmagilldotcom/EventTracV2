package com.example.eventtrac;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Constructor for Start button
		Button startBtn = (Button)findViewById(R.id.startBtn);		
		startBtn.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				TextView outputTxtBx = (TextView)findViewById(R.id.outputTxtBx);
				outputTxtBx.setText("Logging started!");
			}
		}
		); // end constructor for start button
		
		//Constructor for Stop button
		Button stopBtn = (Button)findViewById(R.id.stopBtn);		
		stopBtn.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				TextView outputTxtBx = (TextView)findViewById(R.id.outputTxtBx);
				outputTxtBx.setText("Logging stopped!");
			}
		}
		); // end constructor for Stop button
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
