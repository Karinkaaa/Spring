package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("main")
public class MainController {

    public MainController() {
        System.out.println("Controller create");
    }

    @RequestMapping(value= "get-some-data", method = RequestMethod.POST)
    @ResponseBody
    public String[] getSomeData(int param1, double param2, String param3) {

        System.out.println("Controller method invoked.");
        return new String[]{"111", "222", "333"};
    }
}