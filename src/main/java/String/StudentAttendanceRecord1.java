package String;

public class StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        for (Character c : s.toCharArray()) {
            if (!c.equals('L')) {
                late = 0;
            }
            if(c.equals('L')){
                late++;
            }
            if(c.equals('A')) {
                absent++;
            }
            if(late > 2) {
                return false;
            }
        }
        if(absent > 1) {
            return false;

        }
        return true;
    }

    public static void main(String[] args) {
        new StudentAttendanceRecord1().checkRecord("PPALLP");
    }
}