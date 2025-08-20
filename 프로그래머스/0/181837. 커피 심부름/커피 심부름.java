class Solution {
public int solution(String[] order) {
        int totalAmount = 0;

        final int AMERICANO_PRICE = 4500;
        final int LATTE_PRICE = 5000;
        
        for (String menu : order) {
            switch (menu) {
                case "americanoice":
                case "americanohot":
                case "americano":  
                case "iceamericano":  
                case "hotamericano":  
                    totalAmount += AMERICANO_PRICE;
                    break;
                
                case "cafelatteice":
                case "cafelattehot":
                case "cafelatte": 
                case "icecafelatte": 
                case "hotcafelatte": 
                    totalAmount += LATTE_PRICE;
                    break;

                case "anything":
                    totalAmount += AMERICANO_PRICE;
                    break;
            }
        }
        
        return totalAmount;
    }
}