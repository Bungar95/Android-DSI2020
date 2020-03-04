package hr.cnzd.prepoznajmoenasilje;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class KvizUpute extends AppCompatActivity {

    private Button Button;
    private WebView webView;
    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_kviz__upute);

        webView = findViewById(R.id.webviewUpute);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);

        if(getIntent() != null && getIntent().getStringExtra("url") != null){
            link = getIntent().getStringExtra("url");
            webView.loadUrl(link);
        }

        Button = findViewById(R.id.btnUpute);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityKviz();
            }

        });
    }

    public void openActivityKviz() {
        Intent intent = new Intent(this, KvizOdabir.class);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(getApplicationContext(), SadrzajOdabir.class);
        startActivityForResult(intent, 0);
        return true;
    }
}
