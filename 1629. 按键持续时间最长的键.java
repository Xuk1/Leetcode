class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        char ret = keysPressed.charAt(0);
        int maxTime = releaseTimes[0];
        for(int i = 1; i < n; i++){
            int time = releaseTimes[i] - releaseTimes[i-1];
            char now = keysPressed.charAt(i);
            if(time > maxTime || (time == maxTime && now > ret)){
                maxTime = time;
                ret = now;
            }
        }
        return ret;
    }
}
