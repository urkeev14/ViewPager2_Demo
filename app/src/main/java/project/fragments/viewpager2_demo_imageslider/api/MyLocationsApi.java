package project.fragments.viewpager2_demo_imageslider.api;

import java.util.ArrayList;
import java.util.List;

import project.fragments.viewpager2_demo_imageslider.model.TravelLocation;

import static project.fragments.viewpager2_demo_imageslider.constants.Constants.IMAGES_ANDROID_WEBSITE_DOMAIN;

public class MyLocationsApi {

    private static MyLocationsApi instance;
    private List<TravelLocation> locations;

    private MyLocationsApi() {
        generateLocations();
    }

    public static MyLocationsApi getInstance() {
        if (instance == null) {
            instance = new MyLocationsApi();
        }
        return instance;
    }

    private void generateLocations() {
        locations = new ArrayList<>();

        TravelLocation location1 = new TravelLocation();
        location1.setImageUrl(IMAGES_ANDROID_WEBSITE_DOMAIN + "/france_eiffel_tower.jpg");
        location1.setTitle("France");
        location1.setLocation("Eiffel Tower");
        location1.setStarRating(4.8f);

        TravelLocation location2 = new TravelLocation();
        location2.setImageUrl(IMAGES_ANDROID_WEBSITE_DOMAIN + "/indonesia_mountain_view.jpg");
        location2.setTitle("Indonesia");
        location2.setLocation("Mountain View");
        location2.setStarRating(4.5f);

        TravelLocation location3 = new TravelLocation();
        location3.setImageUrl(IMAGES_ANDROID_WEBSITE_DOMAIN + "/india_taj_mahal.jpg");
        location3.setTitle("India");
        location3.setLocation("Taj Mahal");
        location3.setStarRating(4.3f);

        TravelLocation location4 = new TravelLocation();
        location4.setImageUrl(IMAGES_ANDROID_WEBSITE_DOMAIN + "canada_lake_view.jpg");
        location4.setTitle("Canada");
        location4.setLocation("Lake View");
        location4.setStarRating(4f);

        locations.add(location1);
        locations.add(location2);
        locations.add(location3);
        locations.add(location4);
    }

    public List<TravelLocation> getLocations() {
        return locations;
    }
}
