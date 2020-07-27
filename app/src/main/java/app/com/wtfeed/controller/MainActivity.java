package app.com.wtfeed.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import app.com.wtfeed.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtnTest(View view){
        Toast.makeText(this,"This is not a test", Toast.LENGTH_LONG).show();
    }


}