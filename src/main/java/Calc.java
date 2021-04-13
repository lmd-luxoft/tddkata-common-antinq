
public class Calc {

    public int sum(String expression) {
        if (expression == null) {
            return -1;
        }

        String[] splitExpressionArr = expression.split(",");
        int result = 0;

//        if(splitExpressionArr.length == 0){
//            return 0;
//        }

        for (String number: splitExpressionArr){
            if(parseStringToInteger(number) == -1){
                return -1;
            }
            result = result + parseStringToInteger(number);
        }
        return result;
    }

    private int parseStringToInteger(String stringToParse){
        if(stringToParse.length() == 0){
            return 0;
        }
        try{
            return Integer.parseInt(stringToParse);
        } catch (NumberFormatException e){
            return -1;
        }

    }
}
