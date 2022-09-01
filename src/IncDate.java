public class IncDate extends Date {

    public IncDate(int newMonth, int newDay, int newYear) {
        super(newMonth, newDay, newYear);
    }
    public void increment() {
        Date newDate = this.inverseLilian(this.lilian()+1);
        super.month = newDate.getMonth();
        super.day = newDate.getDay();
        super.year = newDate.getYear();
    }
    public void increment(int days) {
        Date newDate = this;
        for(int i = 0; i<days; i++) {
            newDate = newDate.inverseLilian(newDate.lilian()+1);
        }
        super.month = newDate.getMonth();
        super.day = newDate.getDay();
        super.year = newDate.getYear();
    }
}
