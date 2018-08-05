package edu.fjnu.cse.newfly.AndroidPhone;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.res.Resources;

import com.google.gson.Gson;

import org.w3c.dom.Document;


public class MainActivity extends Activity {

	private Resources recource;
	static String phonenum="";
	private TextView phonetev;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		recource=this.getApplicationContext().getResources();
		phonetev = (TextView)findViewById(R.id.phonetev);

	}
	
	public void myclick(View v){
		switch (v.getId()) {
		case R.id.phonebut0:
		case R.id.phonebut1:
		case R.id.phonebut2:
		case R.id.phonebut3:
		case R.id.phonebut4:
		case R.id.phonebut5:
		case R.id.phonebut6:
		case R.id.phonebut7:
		case R.id.phonebut8:
		case R.id.phonebut9:
		case R.id.phonebuta:
		case R.id.phonebutb:
			//System.out.println("0000");
			phonenum+=((Button)v).getText();
			phonetev.setText(phonenum);
			//System.out.println(((Button)v).getText());
			break;
		case R.id.phonebutclear:
			//System.out.println("2222");
			phonenum+=((Button)v).getText();
			
			break;
		case R.id.phonecall:
			
			break;
		default:
			break;
		}
//		System.out.println("2222");
//		Log.v("Click","11111");
		
	}

}
