class Solution {
    public String solution(String polynomial) {
        int xNum = 0; 
        int num=0;
        String[] strArr = polynomial.split(" ");
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("x")){
                xNum += strArr[i].equals("x") ? 1 : Integer.parseInt(strArr[i].replaceAll("x", ""));
            } else if(!strArr[i].equals("+")){
                num += Integer.parseInt(strArr[i]);
            }
        }
        return (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "")+(num != 0 ? (xNum != 0 ? " + " : "") + num : xNum == 0 ? "0" : "");
    }
}