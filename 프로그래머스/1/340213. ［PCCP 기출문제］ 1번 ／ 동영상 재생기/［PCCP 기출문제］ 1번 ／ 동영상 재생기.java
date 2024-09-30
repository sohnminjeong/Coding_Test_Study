import java.util.*;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video_len_num = 0;
        int pos_num = 0, op_start_num=0, op_end_num;
        video_len_num = Integer.parseInt(video_len.split(":")[0])*60+Integer.parseInt(video_len.split(":")[1]);
        pos_num = Integer.parseInt(pos.split(":")[0])*60+Integer.parseInt(pos.split(":")[1]);
         op_start_num = Integer.parseInt(op_start.split(":")[0])*60+Integer.parseInt(op_start.split(":")[1]);
         op_end_num = Integer.parseInt(op_end.split(":")[0])*60+Integer.parseInt(op_end.split(":")[1]);
        
        if(pos_num>=op_start_num&&pos_num<=op_end_num){
            pos_num=op_end_num;
        }
        for(int i=0; i<commands.length; i++){
            if(commands[i].equals("next")){
               pos_num+=10;
                if(video_len_num - pos_num<10){
                    pos_num = video_len_num;
                }
            }else{
                pos_num-=10;
                if(pos_num<10){
                    pos_num=0;
                }
            }
            if(pos_num>=op_start_num && pos_num<=op_end_num){
                pos_num=op_end_num;
            }
        }
        answer = String.format("%02d:%02d", pos_num/60, pos_num%60);
        return answer;
    }
}