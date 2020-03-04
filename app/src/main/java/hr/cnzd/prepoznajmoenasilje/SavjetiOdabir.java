package hr.cnzd.prepoznajmoenasilje;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
public class SavjetiOdabir extends AppCompatActivity {
    private ImageButton imageButtonDjeca;
    private ImageButton imageButtonOdrasli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_savjeti__odabir);

        imageButtonDjeca = findViewById(R.id.imgBtnDjeca);
        imageButtonDjeca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySavjetiDjeca();
            }
        });

        imageButtonOdrasli = findViewById(R.id.imgBtnOdrasli);
        imageButtonOdrasli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySavjetiOdrasli();
            }
        });
    }

    public void openActivitySavjetiDjeca() {
        Intent intent = new Intent(this, Savjet.class);
        intent.putExtra("savjeti", "djeca");
        startActivity(intent);
    }

    public void openActivitySavjetiOdrasli() {
        Intent intent = new Intent(this, Savjet.class);
        intent.putExtra("savjeti", "roditelji");
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(getApplicationContext(), SadrzajOdabir.class);
        startActivityForResult(intent, 0);
        return true;
    }
}
