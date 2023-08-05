class Solution {
    public int romanToInt(String s) {
        int[] value = {1,5,10,50,100,500,1000};
        int[] index = new int[s.length()+1];
        String Symbol = "IVXLCDM";
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j = 0;j<Symbol.length();j++){
                if(s.charAt(i)==Symbol.charAt(j) ){
                    index[i] = j;
                    break;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(index[i]<index[i+1]){
                sum +=value[index[i+1]] - value[index[i]];
                i++;
            }else
                sum+=value[index[i]];
        }
        return sum;
    }
}