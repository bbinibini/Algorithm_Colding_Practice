import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
//hashmap http://tech.javacafe.io/2018/12/03/HashMap/


public class Marathon{
    public static void main(String[] args){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        String answer = solution(participant, completion);
        System.out.println(answer);
    }

    public static String solution(String[] participant, String[] completion){

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[completion.length];
    }

    public String solution_hashmap(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        //getOrDefault(key, defaultValue)
        //처음인사람 = 0 , 중복 = 값반환 + 1
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        //key값으로 get해서, -1씩 수를 줄여나간다.
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){ //value가 0이 아니라면
                answer = key;
            }
        }
        return answer;
    }

}