public class reverse_integer {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE || x == Integer.MAX_VALUE){
            return 0;
        }
        StringBuilder s = new StringBuilder();

        boolean neg = false;
        if(x < 0){
            neg = true;
            x = x*-1;
        }

        s.append(x);
        int start = 0; int end  = s.length() - 1;
        while(start < end){
            char a = s.charAt(start);
            char b = s.charAt(end);
            s.setCharAt(start, b);
            s.setCharAt(end, a);
            start++;
            end--;
        }
        
        String str = s.toString();
        long ans = (neg == true) ? Long.parseLong(str)*-1 : Long.parseLong(str);
        
        System.out.println(str);
        return (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) ? 0 : (int) ans;
    }
}
