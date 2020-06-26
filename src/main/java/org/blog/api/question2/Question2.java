package org.blog.api.question2;
import org.blog.api.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/upperLink/question2")
public class Question2 {
	
	@Autowired
	QuestionService qs;

	@GetMapping("{text}")
	public String getComment(@PathVariable("text") String text) {
		return qs.question2(text);
	}
	
}
