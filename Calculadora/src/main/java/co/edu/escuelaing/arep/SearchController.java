package co.edu.escuelaing.arep;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin("*")
public class SearchController {

    @GetMapping("/linearSearch")
    public Answer linearSearch(@RequestParam(value = "inputlist") List<Integer> inputlist,
                               @RequestParam(value = "value") int value) {
        linearSearch linearsearch = new linearSearch(inputlist, value);
        return new Answer("linearSearch", inputlist, value, linearsearch.getOutput());
    }

    @GetMapping("/binarySearch")
    public Answer binarySearch(@RequestParam(value = "inputlist") List<Integer> inputlist,
                               @RequestParam(value = "value") int value) {
        binarySearch binarySearch = new binarySearch(inputlist, value);
        return new Answer("binarySearch", inputlist, value, binarySearch.getOutput());
    }
}
