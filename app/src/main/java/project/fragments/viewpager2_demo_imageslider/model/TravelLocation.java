package project.fragments.viewpager2_demo_imageslider.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import project.fragments.viewpager2_demo_imageslider.BR;

public class TravelLocation extends BaseObservable {

    private String title;
    private String location;
    private String imageUrl;
    private Float starRating;

    public TravelLocation(String title, String location, String imageUrl, Float starRating) {
        this.title = title;
        this.location = location;
        this.imageUrl = imageUrl;
        this.starRating = starRating;
    }

    public TravelLocation() {
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    @Bindable
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        notifyPropertyChanged(BR.imageUrl);
    }

    @Bindable
    public Float getStarRating() {
        return starRating;
    }

    public void setStarRating(Float starRating) {
        this.starRating = starRating;
        notifyPropertyChanged(BR.starRating);
    }
}
