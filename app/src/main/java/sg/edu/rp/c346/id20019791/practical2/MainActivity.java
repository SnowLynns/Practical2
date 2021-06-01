package sg.edu.rp.c346.id20019791.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button barnowl;
    Button bluewhale;
    Button bobcat;
    Button brownbear;
    Button banjocatfish;
    Button barredowl;
    Button beardeddragon;
    Button bat;
    Button bengaltiger;
    Button bluejay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barnowl = findViewById(R.id.barnOwl);
        bluewhale = findViewById(R.id.blueWhale);
        bobcat = findViewById(R.id.bobCat);
        brownbear = findViewById(R.id.brownBear);
        banjocatfish = findViewById(R.id.banjoCatfish);
        barredowl = findViewById(R.id.barredOwl);
        beardeddragon = findViewById(R.id.beardedDragon);
        bat = findViewById(R.id.bat);
        bengaltiger = findViewById(R.id.bengalTiger);
        bluejay = findViewById(R.id.blueJay);

        barnowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, barnowlActivity.class);
                startActivity(i);
            }
        });
        bluewhale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, bluewhaleActivity.class);
                startActivity(i);
            }
        });
        bobcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, bobcatActivity.class);
                startActivity(i);
            }
        });
        brownbear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, brownbearActivity.class);
                startActivity(i);
            }
        });
        banjocatfish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, banjocatfishActivity.class);
                startActivity(i);
            }
        });
        barredowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, barredowlActivity.class);
                startActivity(i);
            }
        });
        beardeddragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, beardeddragonActivity.class);
                startActivity(i);
            }
        });
        bat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, batActivity.class);
                startActivity(i);
            }
        });
        bengaltiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, bengaltigerActivity.class);
                startActivity(i);
            }
        });
        bluejay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, bluejayActivity.class);
                startActivity(i);
            }
        });
    }
}
