import java.util.ArrayList;
import java.util.List;

public class PreprocessDates {
    public static List<String> preprocessDate(List<String> dates) {
        List<String> convertedDates = new ArrayList<>();
        for (String date : dates) {
            String[] splitDate = date.split(" ");
            String day = splitDate[0];
            String month = splitDate[1];
            String year = splitDate[2];

            day = day.replaceAll("[^0-9]", "");

            switch (month) {
                case "Jan":
                    month = "01";
                    break;
                case "Feb":
                    month = "02";
                    break;
                case "Mar":
                    month = "03";
                    break;
                case "Apr":
                    month = "04";
                    break;
                case "May":
                    month = "05";
                    break;
                case "Jun":
                    month = "06";
                    break;
                case "Jul":
                    month = "07";
                    break;
                case "Aug":
                    month = "08";
                    break;
                case "Sep":
                    month = "09";
                    break;
                case "Oct":
                    month = "10";
                    break;
                case "Nov":
                    month = "11";
                    break;
                case "Dec":
                    month = "12";
                    break;
            }

            year = year.substring(0, 4);

            if (day.length() == 1) {
                day = "0" + day;
            }

            String convertedDate = year + "-" + month + "-" + day;

            convertedDates.add(convertedDate);
        }
        return convertedDates;
    }
}
