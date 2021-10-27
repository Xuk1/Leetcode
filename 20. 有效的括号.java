class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n % 2 != 0){                 //长度不是2的倍数的话一定不可能是有效的括号
            return false;
        }

        Map<Character, Character> map = new HashMap<>();    //存储合法的括号对
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Deque<Character> stack = new LinkedList<>();        //用栈存储左括号
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){                         //如果map的key中有这个字符，就说明它是右括号
                if(stack.isEmpty() || stack.peek() != map.get(c)){      //当栈为空或者栈顶的左括号和右括号不匹配的时候，就可以说明这个不是有效的括号
                    return false;
                }
                stack.pop();                                //如果此次匹配上了，就弹出栈顶的左括号，表示已经完成了匹配
            }else{
                stack.push(c);                              //如果map的key中没有这个字符，就说明它是左括号
            }
        }
        return stack.isEmpty();
    }
}

/*
执行用时: 2 ms ,在所有Java提交中击败了 57.27%的用户
内存消耗:36.3 MB，在所有Java提交中击败了84.01%的用户

使用了栈和哈希表
*/
