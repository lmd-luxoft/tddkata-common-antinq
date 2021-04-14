import java.util.ArrayList;
import java.util.List;

public class Calc {

    public int sum(String expression) {
        if (expression == null) {
            return -1;
        }
        if(expression.length() == 0){
            return 0;
        }
        if(expression.contains("\n\n") || expression.contains(",,") || expression.contains(",\n") || expression.contains("\n,")){
            return -1;
        }

        String[] firstLevelSplit = expression.split(",");
        List<String> listOfDelimitedData = new ArrayList<>();
        for (String element: firstLevelSplit){
            String[] firstLevelSplitSplit = element.split("\n");
            for (String finalElement: firstLevelSplitSplit){
                listOfDelimitedData.add(finalElement);
            }
        }

        int result = 0;
        for (String number: listOfDelimitedData){
            if(parseStringToInteger(number) == -1){
                return -1;
            }
            result = result + parseStringToInteger(number);
        }
        return result;
    }

    private int parseStringToInteger(String stringToParse){
        if(stringToParse.length() == 0){
            return -1;
        }
        try{
            return Integer.parseInt(stringToParse);
        } catch (NumberFormatException e){
            return -1;
        }

    }
}
