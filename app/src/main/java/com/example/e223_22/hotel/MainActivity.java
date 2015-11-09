package com.example.e223_22.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void klik(View button){
        switch (button.getId()){
            case R.id.button:
                Intent intent = new Intent(this, Reservation.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(this, Sluzby.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(this, Pokoje.class);
                startActivity(intent);
                break;
            case R.id.button4:
                intent = new Intent(this, oHotelu.class);
                startActivity(intent);
                break;
            case R.id.button5:
                intent = new Intent(this, kontakt.class);
                startActivity(intent);
                break;
        }
    }


}
