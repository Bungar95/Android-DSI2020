package hr.cnzd.prepoznajmoenasilje;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SadrzajOdabir extends AppCompatActivity {
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar);
        setContentView(R.layout.activity_sadrzaj__odabir);

        imageButton1 = findViewById(R.id.imgBtn1);
        imageButton2 = findViewById(R.id.imgBtn2);
        imageButton3 = findViewById(R.id.imgBtn3);
        imageButton4 = findViewById(R.id.imgBtn4);
        imageButton5 = findViewById(R.id.imgBtn5);
        imageButton6 = findViewById(R.id.imgBtn6);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySadrzaj1();
            }

        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySadrzaj2();
            }

        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySadrzaj3();
            }

        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySadrzaj4();
            }

        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySadrzaj5();
            }

        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityUputeKviz();
            }

        });
    }

    public void openActivitySadrzaj1() {
        Intent intent = new Intent(this, Sadrzaj.class);
        intent.putExtra("url", "file:///android_asset/prepoznajmo.html");
        startActivity(intent);
    }

    public void openActivitySadrzaj2() {
        Intent intent = new Intent(this, Sadrzaj.class);
        intent.putExtra("url", "file:///android_asset/sto_je_nasilje.html");
        startActivity(intent);
    }
    public void openActivitySadrzaj3() {
        Intent intent = new Intent(this, SavjetiOdabir.class);
        startActivity(intent);
    }

    public void openActivitySadrzaj4() {
        Intent intent = new Intent(this, Sadrzaj.class);
        intent.putExtra("url", "file:///android_asset/znakovi.html");
        startActivity(intent);
    }

    public void openActivitySadrzaj5() {
        Intent intent = new Intent(this, Sadrzaj.class);
        intent.putExtra("url", "file:///android_asset/pomoc.html");
        startActivity(intent);
    }

    public void openActivityUputeKviz() {
        Intent intent = new Intent(this, KvizUpute.class);
        intent.putExtra("url", "file:///android_asset/upute_kviz.html");
        startActivity(intent);
    }
}
