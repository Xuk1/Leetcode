class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0 && i != 0){
                ret.add("FizzBuzz");
            }else if(i % 3 == 0 && i != 0){
                ret.add("Fizz");
            }else if(i % 5 == 0 && i != 0){
                ret.add("Buzz");
            }else{
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
}

/*
执行用时:1 ms
内存消耗:39.6 MB
*/
