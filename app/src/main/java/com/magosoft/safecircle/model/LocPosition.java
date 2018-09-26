package com.magosoft.safecircle.model;

public class LocPosition {

    private double lat;
    private double lng;


    public LocPosition(){

    }

    public LocPosition(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
