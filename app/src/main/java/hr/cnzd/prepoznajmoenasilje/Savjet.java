package hr.cnzd.prepoznajmoenasilje;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

import hr.cnzd.prepoznajmoenasilje.viewpager2.SliderAdapter;
import hr.cnzd.prepoznajmoenasilje.viewpager2.SliderItem;

public class Savjet extends AppCompatActivity {

    private ViewPager2 viewPager2;
    String vrsta_savjeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_savjet);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        List<SliderItem> sliderItems = new ArrayList<>();

        if (getIntent() != null && getIntent().getStringExtra("savjeti") != null) {
            vrsta_savjeta = getIntent().getStringExtra("savjeti");

            if (vrsta_savjeta.equals("djeca")){
                sliderItems.add(new SliderItem(R.drawable.djeca01));
                sliderItems.add(new SliderItem(R.drawable.djeca02));
                sliderItems.add(new SliderItem(R.drawable.djeca03));
                sliderItems.add(new SliderItem(R.drawable.djeca04));
                sliderItems.add(new SliderItem(R.drawable.djeca05));
                sliderItems.add(new SliderItem(R.drawable.djeca06));
                sliderItems.add(new SliderItem(R.drawable.djeca07));
                sliderItems.add(new SliderItem(R.drawable.djeca08));
            }else{
                sliderItems.add(new SliderItem(R.drawable.roditelji01));
                sliderItems.add(new SliderItem(R.drawable.roditelji02));
                sliderItems.add(new SliderItem(R.drawable.roditelji03));
                sliderItems.add(new SliderItem(R.drawable.roditelji04));
                sliderItems.add(new SliderItem(R.drawable.roditelji05));
                sliderItems.add(new SliderItem(R.drawable.roditelji06));
                sliderItems.add(new SliderItem(R.drawable.roditelji07));
                sliderItems.add(new SliderItem(R.drawable.roditelji08));
            }
        }

        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), SavjetiOdabir.class);
        startActivityForResult(myIntent, 0);
        return true;
    }

}
