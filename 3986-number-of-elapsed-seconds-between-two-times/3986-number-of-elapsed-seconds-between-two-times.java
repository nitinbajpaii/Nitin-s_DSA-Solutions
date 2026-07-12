class Solution {
    public int convertToSeconds(String time){
        String[] convert = time.split(":");
        int hrs = Integer.parseInt(convert[0]);
        int min = Integer.parseInt(convert[1]);
        int sec = Integer.parseInt(convert[2]);
        return hrs*3600 + min * 60  + sec;
    }
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start = convertToSeconds(startTime);
        int end = convertToSeconds(endTime);
        return end-start;
    }
}