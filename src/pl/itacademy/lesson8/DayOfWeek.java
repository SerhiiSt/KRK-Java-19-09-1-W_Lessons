package pl.itacademy.lesson8;

import java.util.ArrayList;


public enum DayOfWeek {

    MON("Poniedziałek", "Monday", 1, true),
    TUE("Wtorek", "Tuesday", 2, true),
    WED("Środa", "Wednesday", 3, true),
    THU("Czwartek", "Thusday", 4, true),
    FRI("Piątek", "Friday", 5, true),
    SAT("Sobota", "Saturday", 6, true),
    SUN("Niedziela", "Sunday", 7, true);


    private String polishName;
    private String englishName;
    private boolean workingDay;
    private int index;
    private ArrayList<DayOfWeek> workingDays = new ArrayList<>();
    private ArrayList<DayOfWeek> nonWorkingDays = new ArrayList<>();

    DayOfWeek(String polishName, String englishName, int index, boolean workingDay) {

        this.polishName = polishName;
        this.englishName = englishName;
        this.workingDay = workingDay;
        this.index = index;
    }


    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setPolishName(String polishName) {
        this.polishName = polishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        this.workingDay = workingDay;
    }


    public static DayOfWeek fromPolishName(String polishName) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.polishName.equals(polishName)) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with Polish name " + polishName);
    }

    public static DayOfWeek fromEnglishName(String englishName) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.englishName.equals(englishName)) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with English name " + englishName);
    }

    public boolean isWeekend(String day) {
        if (day.equals(DayOfWeek.SAT) || day.equals(DayOfWeek.SUN)) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<DayOfWeek> getWorkingDays() {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.workingDay) {
                workingDays.add(dayOfWeek);
            }
        }
        return workingDays;
    }

    public ArrayList<DayOfWeek> getNonWorkingDays() {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.workingDay) {
                nonWorkingDays.add(dayOfWeek);
            }
        }
        return nonWorkingDays;
    }
}
