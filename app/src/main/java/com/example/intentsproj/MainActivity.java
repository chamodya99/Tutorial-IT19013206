package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.*;

public class MainActivity extends AppCompatActivity {

    EditText num01;
    EditText num02;
    TextView lblsum;
    private Object SecondActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining the text objects
        num01 = findViewById(R.id.num01);
        num02 = findViewById(R.id.num02);
        lblsum = findViewById(R.id.lblsum);
    }

   public void openSecond(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",num01.getText().toString());
        intent.putExtra("n2",num02.getText().toString());

       //Toast.makeText(this, "opening calculator...", Toast.LENGTH_SHORT).show();

       //Creating the LayoutInflater instance
       LayoutInflater li = getLayoutInflater();
       //Getting the View object as defined in the customtoast.xml file
       View layout = li.inflate(R.layout.customtoast,(ViewGroup)
               findViewById(R.id.custom_toast_layout));

//Creating the Toast object
Toast toast = new Toast(getApplicationContext());
toast.setDuration(Toast.LENGTH_SHORT);
toast.setGravity(CENTER_VERTICAL, 0, 0);
toast.setView(layout);//setting the view of custom toast layout
// toast.show();
       startActivity(intent);
   }

}
