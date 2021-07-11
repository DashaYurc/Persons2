package lv.sda;

public class Average {
    public static float averageOfValues(Person[] persons){
        float sum = 0;
        for (int i = 0; i < persons.length ; i++) {
            sum += persons[i].getAge();
        }
        return sum / persons.length;
    }

}
