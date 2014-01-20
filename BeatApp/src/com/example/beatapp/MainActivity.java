package com.example.beatapp;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	MediaPlayer mp = null;		//for playing from the /res/raw folder
	MediaPlayer local_mp = null;//for playing from the sd card
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onStop() {
    	super.onStop();
    	
    	if(mp != null) {
    		mp.release();
    		mp = null;
    	}
    	
    	if(local_mp != null) {
    		local_mp.release();
    		local_mp = null;
    	}
    }
	
	public void playBeatSound(View v){
		if(mp != null) {
    		mp.release();
    	}
		
		switch(v.getId()){
		
		case R.id.bass:
			mp = MediaPlayer.create(getApplicationContext(), R.raw.beat);
			break;
		
		case R.id.claps:
			mp = MediaPlayer.create(getApplicationContext(), R.raw.claps);
			break;
			
		case R.id.crash:
			mp = MediaPlayer.create(getApplicationContext(), R.raw.crash);
			break;
			
		case R.id.trumpet:
			mp = MediaPlayer.create(getApplicationContext(), R.raw.trumpet);
			break;
			
		case R.id.beat:
			mp = MediaPlayer.create(getApplicationContext(), R.raw.beat);
			break;
			
		case R.id.xylophone:
			mp = MediaPlayer.create(getApplicationContext(), R.raw.xylophone);
			break;
			
		}
		mp.start();
	}
	
	public void playBeat(View v){
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
