package com.topcoder.childhooddream.childhooddreamapp.bean;

public class DataModel {

    private Long id;
    private String name;
    private String description;
    private String distance_between_stop;
    private String max_speed;
    private String sharing_tracks;
    private boolean grade_crossing;
    private String train_frequency;
    private String amenities;

    


    public DataModel() {
    }

    
    public DataModel(Long id, String name, String description, String distance_between_stop, String max_speed,
            String sharing_tracks, boolean grade_crossing, String train_frequency, String amenities) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.distance_between_stop = distance_between_stop;
        this.max_speed = max_speed;
        this.sharing_tracks = sharing_tracks;
        this.grade_crossing = grade_crossing;
        this.train_frequency = train_frequency;
        this.amenities = amenities;
    }


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return String return the distance_between_stop
     */
    public String getDistance_between_stop() {
        return distance_between_stop;
    }

    /**
     * @param distance_between_stop the distance_between_stop to set
     */
    public void setDistance_between_stop(String distance_between_stop) {
        this.distance_between_stop = distance_between_stop;
    }

    /**
     * @return String return the max_speed
     */
    public String getMax_speed() {
        return max_speed;
    }

    /**
     * @param max_speed the max_speed to set
     */
    public void setMax_speed(String max_speed) {
        this.max_speed = max_speed;
    }

    /**
     * @return String return the sharing_tracks
     */
    public String getSharing_tracks() {
        return sharing_tracks;
    }

    /**
     * @param sharing_tracks the sharing_tracks to set
     */
    public void setSharing_tracks(String sharing_tracks) {
        this.sharing_tracks = sharing_tracks;
    }

    /**
     * @return boolean return the grade_crossing
     */
    public boolean isGrade_crossing() {
        return grade_crossing;
    }

    /**
     * @param grade_crossing the grade_crossing to set
     */
    public void setGrade_crossing(boolean grade_crossing) {
        this.grade_crossing = grade_crossing;
    }

    /**
     * @return String return the train_frequency
     */
    public String getTrain_frequency() {
        return train_frequency;
    }

    /**
     * @param train_frequency the train_frequency to set
     */
    public void setTrain_frequency(String train_frequency) {
        this.train_frequency = train_frequency;
    }

    /**
     * @return String return the amenities
     */
    public String getAmenities() {
        return amenities;
    }

    /**
     * @param amenities the amenities to set
     */
    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

}

