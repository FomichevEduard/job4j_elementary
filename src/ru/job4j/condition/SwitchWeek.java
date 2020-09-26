package ru.job4j.condition;

public class SwitchWeek {
    public String nameOfDay(int day) {
        String nameDay;
        switch (day) {
            case 7 :
                nameDay = "Voskresene";
                break;
            case 6:
                nameDay = "Subbota";
                break;
            case 5:
                nameDay = "Piatnica";
                break;
            case 4:
                nameDay = "Chetverk";
                break;
            case 3:
                nameDay = "Sreda";
                break;
            case 2:
                nameDay = "Vtornik";
                break;
            case 1:
                nameDay = "Ponedelnik";
                break;
            default:
                nameDay = "Ошибка";

        }
        return nameDay;
    }
}

