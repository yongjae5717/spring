package hello.hellospring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        // key: data, value: hello!!
        model.addAttribute("data", "hello!");
        // return name: hello (resources > templates > hello.html)
        return "hello";
    }

    @GetMapping("hello-mvc")
    // input: param을 통해서 localhost:{port}/key ? name = 입력하고싶은 string입력
    public String hellowMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
}
