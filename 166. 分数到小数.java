class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long numeratorLong = (long)numerator;
        long denominatorLong = (long)denominator;
        if(numeratorLong % denominatorLong == 0){
            return String.valueOf(numeratorLong / denominatorLong);
        }

        StringBuffer sb = new StringBuffer();
        if(numeratorLong < 0 ^ denominatorLong < 0){
            sb.append("-");
        }
        
        //整数部分
        numeratorLong = Math.abs(numeratorLong);
        denominatorLong = Math.abs(denominatorLong);
        long integerPart = numeratorLong / denominatorLong;
        sb.append(integerPart);
        sb.append(".");

        //小数部分
        long remainder = numeratorLong % denominatorLong;
        StringBuffer functionPart = new StringBuffer();
        Map<Long, Integer> remainderIndexMap = new HashMap<>();
        int index = 0;
        while(remainder != 0 && !remainderIndexMap.containsKey(remainder)){
            remainderIndexMap.put(remainder, index);
            remainder *= 10;
            functionPart.append(remainder / denominatorLong);
            remainder %= denominatorLong;
            index++;
        }
        if(remainder != 0){
            int insertIndex = remainderIndexMap.get(remainder);
            functionPart.insert(insertIndex, "(");
            functionPart.append(")");
        }
        sb.append(functionPart);
        return sb.toString();
    }
}

/*
执行用时: 1 ms，在所有Java提交中击败了100.00%的用户
内存消耗:35.9 MB ，在所有Java提交中击败了43.12%的用户

模拟竖式计算
*/
