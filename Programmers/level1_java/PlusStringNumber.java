public class PlusStringNumber{
    public static void main(String[] args){
        System.out.println(solution(123));
    }

    public static int solution(int n) {
        int answer = 0;

        String number = Integer.toString(n);
        String[] number_word;

        number_word = number.split("");
        for(String word : number_word){
            answer += Integer.parseInt(word);
        }

        return answer;
    }
}