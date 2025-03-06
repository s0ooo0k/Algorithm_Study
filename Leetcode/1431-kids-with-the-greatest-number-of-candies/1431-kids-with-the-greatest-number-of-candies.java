class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList();
        int maxCandy = 0;

        for(int i=0; i<candies.length; i++){
            if(maxCandy < candies[i]) maxCandy=candies[i];
        }

        for(int i=0; i<candies.length; i++){
            answer.add(maxCandy<=candies[i]+extraCandies);
        }

        return answer;
    }
}