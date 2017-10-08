package com.encureit.gpstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*try {
            GPSTracker gps = new GPSTracker(SettingActivity.this, true);
            double latitude = gps.getLatitude(); // returns latitude
            double longitude = gps.getLongitude(); // returns longitude
            LatLng location = new LatLng(latitude, longitude);
            getConfiguration().setLocation(location);
            Save_setting(String.valueOf(latitude), String.valueOf(longitude));

            LatLng updated_location = getConfiguration().get_LatLog(SettingActivity.this);
            service_intent.putExtra(GeoDataConstants.LOCATION_LATITUDE_DATA_EXTRA, updated_location.latitude);
            service_intent.putExtra(GeoDataConstants.LOCATION_LONGITUDE_DATA_EXTRA, updated_location.longitude);
            progressDialog.show();
            startService(service_intent);
            Utils.location_change = true;
            HomeInteractorImp.items = new ArrayList<Post.Item>();
            HomeActivity.presenter.getPosts(true, false, String.valueOf(longitude), String.valueOf(latitude), getConfiguration().getRadius() + "", getConfiguration().getExclusions(), *//*Calendar.getInstance().getTimeInMillis() +*//* "", getConfiguration().getUnits() == Configuration.KM ? "K" : "M");
        } catch (Exception e) {
            e.printStackTrace();
        }*//*jhdjslkfld*/




    }



}
