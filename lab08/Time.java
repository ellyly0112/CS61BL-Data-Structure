public class Time {

    private int myHours;
    private int myMinutes;

    public Time(String s) {

        int colonPos = s.indexOf(":");
        myHours = Integer.parseInt(s.substring(0, colonPos));
        myMinutes = Integer.parseInt(s.substring(colonPos + 1));
        String mh2 = String.format("%05d", myHours);
        String mm2 = String.format("%05d", myMinutes);
        if (mh2.length() > 2 || mm2.length() > 2) {
            throw new IllegalArgumentException("Too many zeroes");
        }
    }

    public Time(int hours, int minutes) {
        myHours = hours;
        myMinutes = minutes;
    }

    public boolean equals(Object obj) {
        Time t = (Time) obj;
        return myHours == t.myHours && myMinutes == t.myMinutes;
    }

    public String toString() {
        if (myMinutes < 10) {
            return myHours + ":0" + myMinutes;
        } else {
            return myHours + ":" + myMinutes;
        }
    }
}
