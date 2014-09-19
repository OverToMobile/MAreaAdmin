package com.example.distanceexample;

import android.support.v7.app.ActionBarActivity;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		double startLat=12.969828; 
		double startLong=77.596108;
		double endLat= 8.0906574;
		double endLong=77.5466429;
		float results[] = new float[1];
		Location.distanceBetween(startLat, startLong, endLat, endLong, results);
		TextView distance = (TextView) findViewById(R.id.distance);
		distance.setText("Distance :"+results[0]/1000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
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
