package zk.tinyUrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPageController {

    @GetMapping("/customErrorPage")
    public String errorMesage(){
        return "Bu valid bir zurl değildir.";
    }
}
