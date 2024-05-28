public class BestTimeToBuyStockes {
    public int maxProfit(int[] prices) {
        
        //Declare Variables
        int pointer = 0;
        int answer = 0;

        for(int i = 0; i < prices.length; i++){

            //Check the value smaller than current pointer
            if(prices[i] < prices[pointer]){
                pointer = i;
            }

            //Get maximum value
            answer = Math.max(answer, prices[i] - prices[pointer]);
        }

        //Return answer
        return answer;
    }
}
