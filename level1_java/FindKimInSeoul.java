public class FindKimInSeoul{
    public static void main(String[] args){
        String[] example = {"Jane", "Kim"};
        String answer = solution(example);
        System.out.println(answer);
    }

    public static String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 " + Integer.toString(i) + "에 있다";
            }
        }
        
        //int x = Arrays.asList(seoul).indexOf("Kim");
        // set, get, contains 메서드는 있지만 원소 추가하는 메서드는 없음
        //ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
        
        return answer;
    }
}