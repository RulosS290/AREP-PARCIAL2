package co.edu.escuelaing.arep;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class linealController {


	@GetMapping("/linealSearch")
	public Answer answer(@RequestParam(value = "inputlist") List<Integer> inputlist,  @RequestParam(value = "value") int value){
		linearSearch linearsearch = new linearSearch(inputlist, value);
		return new Answer("linealSearch", inputlist, value, linearsearch.getOutput());
	}
}
