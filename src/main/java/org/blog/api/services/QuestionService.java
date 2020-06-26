package org.blog.api.services;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {

	
	public String question2(String text) {
		String firstNonRepeated = "";
		Map<String,Integer> textString = new HashMap<>();
		for(int i=0;i<text.length();i++) {
			if(textString.containsKey((text.charAt(i))+"")) {
				textString.put((text.charAt(i)+""), (textString.get(text.charAt(i)+"")+1));
			}
			else
			textString.put((text.charAt(i)+""), 1);
		}
		//Test for first non-repeatable
		for(int j=0;j<text.length();j++) {
			if(textString.get((text.charAt(j)+"")) == 1) {
			firstNonRepeated = 	text.charAt(j)+"";
			break;
			}
		}
		System.out.println(firstNonRepeated);
		return firstNonRepeated;	
		}
	
}
