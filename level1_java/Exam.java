import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Exam{
    public static void main(String[] args){
        int[] example = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
        int[] answer = solution(example);
        System.out.println("size : " + answer.length);
        for(int a : answer) {
        	System.out.println(a);	
        }
    }

    public static int[] solution(int[] answer) {
        ArrayList<Integer> return_answer = new ArrayList<>();
    	
        int[][] exam_answers = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<exam_answers.length; i++) {
        	map.put(i, 0);
        	for(int j=0; j<answer.length; j++) {
        		if(answer[j] == exam_answers[i][j%exam_answers[i].length]) {
        			map.put(i, map.getOrDefault(i, 0) + 1);
        		}
        	}
        }
        
        //max 값 구하기
        //int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        //ArrayList로 .. ! 
//        ArrayList<Integer> list = new ArrayList<>();
//        if(maxScore == score[0]) {list.add(1);}
//        if(maxScore == score[1]) {list.add(2);}
//        if(maxScore == score[2]) {list.add(3);}
        
        //Integer Arraylist array로 변경
//        return list.stream().mapToInt(i->i.intValue()).toArray();
//        
        int max = 0;
        for(int i=0; i<map.size(); i++) {
        	if(max < map.get(i)) {
        		System.out.println("max change : " + i);
        		max = map.get(i);
        		return_answer.clear();
        		return_answer.add(i);
        	} else if(max == map.get(i)) {
        		return_answer.add(i);
        	}
        }
        
        int[] my = new int[return_answer.size()];
        for(int i=0; i<return_answer.size(); i++) {
        	my[i] = return_answer.get(i).intValue()+1;
        }
        
        return my;
    }
}