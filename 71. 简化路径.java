class Solution {
    public String simplifyPath(String path) {
        String[] names = path.split("/");                       //按照/分割出每个目录名
        Deque<String> stack = new ArrayDeque<>();               //ArrayDeque是循环双向栈
        for(String name : names){
            if("..".equals(name)){                              //如果这个目录名是‘..’，就是上一级的意思
                if(!stack.isEmpty()){                           //所以当栈不为空时，取出栈顶元素
                    stack.pollLast();
                }
            }else if(name.length() > 0 && !".".equals(name)){   //如果这个目录名不为空，且不是‘.’，就视作真正的文件或目录名，压入栈
                stack.offerLast(name);
            }
        }
        StringBuffer ret = new StringBuffer();                  //用StringBuffer构造String
        if(stack.isEmpty()){                                    //当栈为空时，只需要添加一个/
            ret.append("/");
        }else{                                                  //当栈不为空时，从栈底开始取出目录名并用/分隔
            while(!stack.isEmpty()){
                ret.append("/");
                ret.append(stack.pollFirst());
            }
        }
        return ret.toString();
    }
}

/*
执行用时:5 ms ，在所有Java提交中击败了48.86%的用户
内存消耗:38.6 MB，在所有Java提交中击败了32.59%的用户

思路
题目要求如下：
1. 不能有..和.
2. 每个目录名之间有且仅有一个/作分隔
3. 路径需要以/开头
也就是说，题目要求给了我们一个思路，就是：把每个目录名按照/分隔取出来，判断是否是..和.，最后再用/分隔并连接成字符串。
实现这个思路的比较好的数据结构就是栈，并且在这个题目中我们需要能够在栈的两端都进行操作，所以使用deque是更加方便的。
感悟
- 要根据题目选择适合的数据结构
- 要根据题目选择合适的思路
*/
