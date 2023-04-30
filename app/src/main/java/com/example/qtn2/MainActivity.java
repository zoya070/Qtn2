package com.example.qtn2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.optn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.search:
                Toast.makeText(getApplicationContext(),"Search option clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting:
                Toast.makeText(getApplicationContext(),"Setting option clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.compemail:
                Toast.makeText(getApplicationContext(),"Compose Email option clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.feedback:
                Toast.makeText(getApplicationContext(),"Feedback option clicked",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}