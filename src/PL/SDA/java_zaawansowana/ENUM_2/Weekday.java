package PL.SDA.java_zaawansowana.ENUM_2;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    boolean isWeekDay() {
        return !isHoliday();
    }
}
