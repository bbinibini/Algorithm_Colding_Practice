import java.util.HashMap;

public class Marathon{
    public static void main(String[] args){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        solution(participant, completion);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for(int i=0; i< participant.length; i++){
            map.put(i, participant[i]);
        }

        for(int i=0; i<completion.length; i++){
            if(map.containsValue(completion[i])){
                int key = getKey(map, completion[i]);
                map.remove(key);
            }
        }

        answer = String.valueOf(map.values().toArray()[0]);

        return answer;
    }

    public static int getKey(HashMap<Integer, String> m, Object value) { 
        for(int o: m.keySet()) { 
            if(m.get(o).equals(value)) { 
                return o; 
            } 
        } 
        return 0; 
    }

}