package project.fragments.viewpager2_demo_imageslider.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.List;

import project.fragments.viewpager2_demo_imageslider.R;
import project.fragments.viewpager2_demo_imageslider.api.MyLocationsApi;
import project.fragments.viewpager2_demo_imageslider.databinding.ActivityMainBinding;
import project.fragments.viewpager2_demo_imageslider.model.TravelLocation;
import project.fragments.viewpager2_demo_imageslider.adapter.TravelLocationAdapter;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<TravelLocation> locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setViewPagerAdapter(new TravelLocationAdapter(
                MyLocationsApi.getInstance().getLocations())
        );
        binding.executePendingBindings();
    }


}