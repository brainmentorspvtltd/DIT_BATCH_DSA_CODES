import java.util.ArrayList;

public class DiceGameProblem {

    static ArrayList<String> diceGame(int currentValue, int endValue){
        if(currentValue == endValue){
             // Part of the result (10 Reach)
             ArrayList<String> result = new ArrayList<>();
             result.add("");
             return result;
        }

        if(currentValue>endValue){
            // Exceed 10 (Not Part of the result)
            ArrayList<String> result  = new ArrayList<>();
            return result;
        }
       
        
        // 1 to 6 Calls?
        // Roll the Dice (Can be 1 to 6)
        ArrayList<String> finalResult = new ArrayList<>();
        for(int dice = 1; dice<=6; dice++){
            int newValue = currentValue + dice;
            ArrayList<String> list = diceGame(newValue, endValue);
            for(String s : list){
                finalResult.add(dice + s);
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        ArrayList<String> result = diceGame(0,10);
        System.out.println(result);
    }
}
