public class Main {

//CLASSES
public class Workout {
    // Attributes
    private int ID;
    private int userID;
    private String date;
    private String notes;

    //Constructor
    public Workout(int ID, int userID, String date, String notes){
        this.ID = ID;
        this.userID = userID;
        this.date = date;
        this.notes = notes;
    }
    //Getters and setters
    public int getID(){
        return ID;
    }   

    public int getUserID(){
        return userID;
    }

    public String getDate(){
        return date;
    }

    public String getNotes(){
        return notes;
    }

    public void setWorkoutID(int ID){
        this.ID = ID;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }
    
}


public class goal {
    // Attributes
    private int ID;
    private int userID;
    private int targetValue;
    private int currentValue;
    private String targetDate;
    private String type;
    private String status;

    //Constructor
    public void Workout(int ID, int userID, int targetValue, int currentValue, String targetDate, String type, String status){
        this.ID = ID;
        this.userID = userID;
        this.targetValue = targetValue;
        this.currentValue = currentValue;
        this.targetDate = targetDate;
        this.type = type;
        this.status = status;
    }
    //Getters and setters
     public int getID() {
        return ID;
    }

    public int getUserID() {
        return userID;
    }

    public int getTargetValue() {
        return targetValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setTargetValue(int targetValue) {
        this.targetValue = targetValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class exercise {

    // Attributes
    private int ID;
    private int sets;
    private int reps;
    private int weight;
    private String name;

    // Constructor
    public exercise(int ID, int sets, int reps, int weight, String name) {
        this.ID = ID;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.name = name;
    }

    // Getters and setters
    public int getID() {
        return ID;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

public class NutritionLog {
    // Attributes
    private int ID;
    private int userID;
    private String date;
    private int calories;
    private int protein;
    private int carbs;
    private int fat;

    // Constructor
    public NutritionLog(int ID, int userID, String date, int calories, int protein, int carbs, int fat){
        this.ID = ID;
        this.userID = userID;
        this.date = date;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

    // Getters and setters
    public int getID(){
        return ID;
    }

    public int getUserID(){
        return userID;
    }

    public String getDate(){
        return date;
    }

    public int getCalories(){
        return calories;
    }

    public int getProtein(){
        return protein;
    }

    public int getCarbs(){
        return carbs;
    }

    public int getFat(){
        return fat;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public void setProtein(int protein){
        this.protein = protein;
    }

    public void setCarbs(int carbs){
        this.carbs = carbs;
    }

    public void setFat(int fat){
        this.fat = fat;
    }
}


public class UserMeasurement {
    // Attributes
    private int ID;
    private int userID;
    private String date;
    private double chest;
    private double abdomen;
    private double thigh;

    // Constructor
    public UserMeasurement(int ID, int userID, String date, double chest, double abdomen, double thigh){
        this.ID = ID;
        this.userID = userID;
        this.date = date;
        this.chest = chest;
        this.abdomen = abdomen;
        this.thigh = thigh;
    }

    // Getters and setters
    public int getID(){
        return ID;
    }

    public int getUserID(){
        return userID;
    }

    public String getDate(){
        return date;
    }

    public double getChest(){
        return chest;
    }

    public double getAbdomen(){
        return abdomen;
    }

    public double getThigh(){
        return thigh;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setChest(double chest){
        this.chest = chest;
    }

    public void setAbdomen(double abdomen){
        this.abdomen = abdomen;
    }

    public void setThigh(double thigh){
        this.thigh = thigh;
    }
}


public class ProgressTracker {
    // Attributes (month/years progress)
    private int ID;
    private int userID;
    private String timeframe;
    private String metricType;
    private String dataPoints;

    // Constructor
    public ProgressTracker(int ID, int userID, String timeframe, String metricType, String dataPoints){
        this.ID = ID;
        this.userID = userID;
        this.timeframe = timeframe;
        this.metricType = metricType;
        this.dataPoints = dataPoints;
    }

    // Getters and setters
    public int getID(){
        return ID;
    }

    public int getUserID(){
        return userID;
    }

    public String getTimeframe(){
        return timeframe;
    }

    public String getMetricType(){
        return metricType;
    }

    public String getDataPoints(){
        return dataPoints;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }

    public void setTimeframe(String timeframe){
        this.timeframe = timeframe;
    }

    public void setMetricType(String metricType){
        this.metricType = metricType;
    }

    public void setDataPoints(String dataPoints){
        this.dataPoints = dataPoints;
    }
}

    //SECURITY SYSTEM
public static String hashPass(String password) {
    return Integer.toString(password.hashCode());
}

public static boolean authenticatePass(String enteredPass, String hashedPass) {
    return hashPass(enteredPass).equals(hashedPass);
}

public static void main(String[] args) {

    String password = "MyPassword123"; //Example password++++++++++++++++++++++++++++

    String hashedPassword = hashPass(password);

    boolean authenticated = authenticatePass(password, hashedPassword);

    System.out.println(authenticated);
    }
}



public static void main(String[] args){
    MyFrame mainFrame = new MyFrame();
    }
}
