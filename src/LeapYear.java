public class LeapYear {
    public static boolean isLeap(int year) {

        if (year % 4 != 0) return false;

        if (year % 400 == 0) return true;

        if (year % 100 == 0) return false;

        return true;
    }
}
