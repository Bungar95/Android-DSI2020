package hr.cnzd.prepoznajmoenasilje;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class KvizOdabir extends AppCompatActivity {
    private ImageButton imageButtonKviz1;
    private ImageButton imageButtonKviz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_kviz__odabir);

        imageButtonKviz1 = findViewById(R.id.imgBtnOsnova);
        imageButtonKviz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityKvizOsnovna();

            }
        });

        imageButtonKviz2 = findViewById(R.id.imgBtnSrednja);
        imageButtonKviz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityKvizSrednja();

            }
        });
    }

    public void openActivityKvizOsnovna() {
        Intent intent = new Intent(this, Kviz.class);
        intent.putExtra("vrsta","razredna");
        startActivity(intent);
    }

    public void openActivityKvizSrednja() {
        Intent intent = new Intent(this, Kviz.class);
        intent.putExtra("vrsta","stariji");
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(getApplicationContext(), KvizUpute.class);
        intent.putExtra("url", "file:///android_asset/upute_kviz.html");
        startActivityForResult(intent, 0);
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
