/* create class HeartRates
define instance variables:
    first name 
    last name 
    birth day
    birth month
    birth year
    
create a constructor that receives this data as parameters.
For each attribute provide set and get methods. 
The class also should include a method that
calculates and returns the person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that calculates and returns the person’s target heart rate. */


public class HeartRates {

    String firstName;
    String lastName;
    int birthDay;
    String birthMonth;
    int birthYear;

    public HeartRates(String firstName, String lastName, int birthDay, String birthMonth, int birthYear) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;

        if ((birthDay >= 1) && (birthDay <= 31)) {
            this.birthDay = birthDay;
        }
        
        if (birthYear > 0) {
            this.birthYear = birthYear;
        }
    }

    public void setFirstName(String newFirstName) {
    
        firstName = newFirstName;
    }    

    public String getFirstName() {
        return firstName;     
    }

    public void setLastName(String newLastName) {
    
        lastName = newLastName;
    }    

    public String getLastName() {
        return lastName;     
    }

    public int setBirthDay(int newBirthDay) {

        if ((newBirthDay >= 1) && (newBirthDay <= 31)) {
            birthDay = newBirthDay;
        }
        return birthDay;    
    }

    public int getBirthDay() {
    
        return birthDay;        
    }

    public void setBirthMonth(String newBirthMonth) {
    
        birthMonth = newBirthMonth;
    }

    public String getBirthMonth() {

        return birthMonth;    
    }

    public void setBirthYear(int newBirthYear) {
    
        birthYear = newBirthYear;
    }

    public int getBirthYear() {

        return birthYear;    
    }
    
    public int calculateAge() {
       
        return (2021 - birthYear);
    }

    public int calMaximumHeartRate() {
        int personAge = calculateAge();
        int maximumHeartRate = 220 - personAge;
        return maximumHeartRate;
    }

    public void calTargetHeartRate() {
        
        float upperBoundTargetHeartRate = (float) (85.0/100) * calMaximumHeartRate();
        float lowerBoundTargetHeartRate = (float) (50.0/100) * calMaximumHeartRate();
        System.out.printf ("     Target Heart Rate: %.2f - %.2f%n", upperBoundTargetHeartRate, lowerBoundTargetHeartRate);
    }
}




