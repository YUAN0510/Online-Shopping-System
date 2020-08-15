package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //如果收到http get请求根目录，这个方法处理
    public String home(){
        return "home";
    }
}
