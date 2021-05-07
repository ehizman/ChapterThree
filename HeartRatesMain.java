public class HeartRatesMain {

    public static void main(String ... args) {
    
        String firstName = "John";
        String lastName = "Smith";
        int birthDay = 28;
        String birthMonth = "January";
        int birthYear = 1994;

        HeartRates firstPatientHeartRates = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);

        System.out.printf("The patient's first name is: %s%n", firstPatientHeartRates.getFirstName());  
        System.out.printf("The patient's last name is: %s%n", firstPatientHeartRates.getLastName());
        System.out.printf("The patient's date of birth is: %d- %s- %d%n", firstPatientHeartRates.getBirthDay(), firstPatientHeartRates.getBirthMonth(), firstPatientHeartRates.getBirthYear());
        System.out.printf("%s %s is %d years old%n", firstPatientHeartRates.getFirstName(), firstPatientHeartRates.getLastName(), firstPatientHeartRates.calculateAge());
        System.out.printf("%s %s's heart details are as follows: %n", firstPatientHeartRates.getFirstName(), firstPatientHeartRates.getLastName());
        System.out.printf("     Maximum Heart Rate: %d%n", firstPatientHeartRates.calMaximumHeartRate());
        firstPatientHeartRates.calTargetHeartRate();
    } 
}
