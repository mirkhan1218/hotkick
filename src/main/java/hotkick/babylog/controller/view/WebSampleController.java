package hotkick.babylog.controller.view;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class WebSampleController {

    @GetMapping("/main1")
    public String main(){
        return "views/test";
    }

}