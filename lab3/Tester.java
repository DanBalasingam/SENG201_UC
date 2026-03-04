package lab3;

public class Tester {

    public static void main(String[] args) {
        MarsHoliday holiday = new MarsHoliday();
        holiday.activityChooser(MarsActivities.MOUNTAINS);
        holiday.activityChooser(MarsActivities.VALLEYS);
        holiday.activityChooser(MarsActivities.ICE_CAPS);
        holiday.activityChooser(MarsActivities.CURIOSITY);
        holiday.activityChooser(MarsActivities.RED_SAND);
    }
}
