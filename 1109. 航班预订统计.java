class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] answer = new int[n];
        Arrays.fill(answer, 0);
        for(int i=0; i < bookings.length; i++){
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seat = bookings[i][2];
            for(int j=first-1; j<=last-1; j++){
                answer[j] += seat;
            }
        }
        return answer;
    }
}

/*
执行用时:875 ms ，在所有Java提交中击败了29.68%的用户
内存消耗:53.7 MB，在所有Java提交中击败了15.93%的用户
*/
