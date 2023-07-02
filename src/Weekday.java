public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private String day;

    public boolean isWeekday() {
        switch (this) {
            case SATURDAY:
            case SUNDAY:
                return false;
            default:
                return true;
        }
    }

    public boolean isHoliday() {
        return !isWeekday();
    }

}
