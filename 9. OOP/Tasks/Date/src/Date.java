public class Date {
    private int day;
    private int month;
    private int year;

    Date(String date) {
        String[] data = date.split("\\.");
        this.day = Integer.parseInt(data[0]);
        this.month = Integer.parseInt(data[1]);
        this.year = Integer.parseInt(data[2]);
    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void AddDay() {
        this.day++;
        int days = getDayCount(this.month, this.year);
        if (this.day > days) {
            this.day = 1;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    private int getDayCount(int month, int year) {
        int a = (1 - (year % 4 + 2) % (year % 4 + 1));
        int b = (1 - (year % 400 + 2) % (year % 400 + 1));
        int c = a * ((year % 100 + 2) % (year % 100 + 1)) + b;
        return 28 + ((month + (month / 8)) % 2) + 2 % month + ((1 + c) / month) + (1 / month) - (c / month);
    }

    @Override
    public String toString() {

        return String.format("%d.%d.%d", this.day, this.month, this.year);
    }
}


