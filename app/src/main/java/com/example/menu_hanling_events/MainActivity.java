package com.example.menu_hanling_events;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.list_item1:
                Toast.makeText(MainActivity.this, "list_item1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.list_item2:
                show();
                Toast.makeText(MainActivity.this, "list_item2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.list_item3:
                Toast.makeText(MainActivity.this, "list_item3", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void show(){
        Toast.makeText(MainActivity.this, "show", Toast.LENGTH_SHORT).show();
    }
}