package com.lai.staybooking.location;


import com.lai.staybooking.model.GeoPoint;
import org.springframework.stereotype.Service;


@Service
public class GeocodingService {


    public GeoPoint getGeoPoint(String address) {
        // TODO: call Google Geocoding API to get geo point
        return new GeoPoint(0, 0);
    }
}
