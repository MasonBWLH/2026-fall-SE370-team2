package model;

public class UserProfile {
    private int profileId;
    private int userId;

    private int age;
    private double height;
    private double weight;

    private String activityLevel;

    // Constructor
    public UserProfile(
            int profileId,
            int userId,
            int age,
            double height,
            double weight,
            String activityLevel
    ) {

        this.profileId = profileId;
        this.userId = userId;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.activityLevel = activityLevel;
    }

    // Getters

    public int getProfileId() {
        return profileId;
    }

    public int getUserId() {
        return userId;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    // Setters

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }
}

