package com.teen.tictactoe;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] arr = {2,2,2,2,2,2,2,2,2,2};
	boolean who_won = false;
	int active_player = 0;
	TextView objj;
	int[][] mypos= {{1,4,7},
	{2,5,8},{3,6,9},{3,5,9},
	{9,5,3},{7,5,3},
	{7,8,9},{4,5,6},
	{1,2,3},{1,5,9}};
	/*
	x -> 0
	o -> 1
	*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objj = findViewById(R.id.text);
    }
	public void clicked(View v){
		//final String tag= "debugtictactoe";
		//Log.i(tag, "clicked work");
		ImageView ob = (ImageView)v;
		//Log.i(tag, "View Work");
		int parse = Integer.parseInt(ob.getTag().toString());
			if (arr[parse] == 2){
				//Log.i(tag, "parse arr wprk");
					//Toast.makeText(this, "Work",1).show();
				if (active_player == 0){
					ob.setImageResource(R.drawable.images);
					active_player = 1;
					arr[parse] = 0;
					//Log.i(tag, "set Image Done For 0");
					objj.setText("O's Turn ");
				}else if (active_player==1){
					ob.setImageResource(R.drawable.images1);
				//objj.setText("X's Turn ");
					active_player = 0;
					arr[parse] = 1;
				//Log.i(tag, "set Image Done For 1");
					objj.setText("X's Turn ");
			}
		}
			//ob.animate().translationX(1000).setDuration(300);
				//Log.i(tag, "All Set");
				for (int[] var:mypos){
					if (arr[var[0]] == 0 && arr[var[1]] == 0 && arr[var[2]] == 0){
						objj.setText("X's Won The Last Game");
						//main_bool = true;
						reset();
						break;
					}else if (arr[var[0]] == 1 && arr[var[1]] == 1&& arr[var[2]] == 1){
						objj.setText("O's Won The Last Game ");
						//main_bool = true;
						reset();
						break;
					}
				{
						
			}
		}
	}
			
	


	//}
	public void reset(){
		for (int i=0;i<arr.length;i++){
			arr[i] = 2;
		}
		active_player = 0;
		who_won = false;
		/*for (int i=0;i<9;i++){
			ImageView ob = findViewById(R.id.image + i+1);
			ob.setImageResource(android.R.color.transparent);
		}*/
		ImageView o = findViewById(R.id.variable);
		o.setImageResource(android.R.color.transparent);
		ImageView o1 = findViewById(R.id.variable1);
		o1.setImageResource(android.R.color.transparent);
		ImageView o3 = findViewById(R.id.variable2);
		o3.setImageResource(android.R.color.transparent);
		ImageView o4= findViewById(R.id.variable3);
		o4.setImageResource(android.R.color.transparent);
		ImageView o5 = findViewById(R.id.variable4);
		o5.setImageResource(android.R.color.transparent);
		ImageView o6= findViewById(R.id.variable5);
		o6.setImageResource(android.R.color.transparent);
		ImageView o7 = findViewById(R.id.variable6);
		o7.setImageResource(android.R.color.transparent);
		ImageView o8 = findViewById(R.id.variable7);
		o8.setImageResource(android.R.color.transparent);
		ImageView o9 = findViewById(R.id.variable8);
		o9.setImageResource(android.R.color.transparent);
	}
    
}
