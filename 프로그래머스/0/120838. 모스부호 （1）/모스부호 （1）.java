class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
    "--.","....","..",".---","-.-",".-..",
    "--","-.","---",".--.","--.-",".-.",
    "...","-","..-","...-",".--","-..-",
    "-.--","--.."};
        String[] morseStr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : morseStr){
            for(int i=0; i<morse.length; i++){
                if(str.equals(morse[i])){
                    sb.append(Character.toString(i+'a'));
                }
            }
        }
        return sb.toString();
    }
}