package project.fragments.viewpager2_demo_imageslider.binding;

import androidx.databinding.BindingAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import project.fragments.viewpager2_demo_imageslider.adapter.TravelLocationAdapter;

public class MyDatabindingAdapter {

    @BindingAdapter("android:loadImage")
    public static void loadImage(KenBurnsView view, String imageUrl) {
        Picasso.get().load(imageUrl).into(view);
    }

    @BindingAdapter("android:viewPagerAdapter")
    public static void viewPagerAdapter(ViewPager2 viewPager, TravelLocationAdapter adapter) {
        viewPager.setAdapter(adapter);
    }

}
