import java.text.SimpleDateFormat;
import java.util.Date;


public class Helper {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd hh mm ss");

    public static boolean still(String date) {

        String currentDate = sdf.format(new Date());
        String dbDate = "";
        String[] arr = new String[6];
        arr[0] = date.split(" ")[0].split("-")[0];
        arr[1] = date.split(" ")[0].split("-")[1];
        arr[2] = date.split(" ")[0].split("-")[2];
        arr[3] = date.split(" ")[1].split(":")[0];
        arr[4] = date.split(" ")[1].split(":")[1];
        arr[5] = date.split(" ")[1].split(":")[2];

        for(String s : arr) {
            dbDate = dbDate.concat(s).concat(" ");
        }
        dbDate = dbDate.trim();

        return checkDates(dbDate , currentDate , 0);
    }

    private static boolean checkDates(String dbDate , String currentDate , int index) {

        if(index>5) return false;

        if(Integer.parseInt(dbDate.split(" ")[index])>Integer.parseInt(currentDate.split(" ")[index])) {

            return true;
        }
        else if(Integer.parseInt(dbDate.split(" ")[index])<Integer.parseInt(currentDate.split(" ")[index])) {

            return false;
        }

        return checkDates(dbDate , currentDate , index+1);
    }
}
