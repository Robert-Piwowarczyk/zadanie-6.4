class CalendarConverter {

    static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "1 dzień tygodnia to Poniedziałek";
            case 2:
                return "2 dzień tygodnia to Wtorek";
            case 3:
                return "3 dzień tygodnia to Sroda";
            case 4:
                return "4 dzień tygodnia to Czwartek";
            case 5:
                return "5 dzień tygodnia to Piątek";
            case 6:
                return "6 dzień tygodnia to Sobota";
            case 7:
                return "7 dzień tygodnia to Niedziela";
            default:
                return "null";
        }
    }
}





