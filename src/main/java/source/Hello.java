package source;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

    @GetMapping("/sayhello")
    public String sayHello() {
        System.out.println("Hello!");
        return "Hello";
    }

    @PostMapping("/sayok")
    public String sayOk(){
        //
        System.out.println("OK");
        return "Hello";
    }
    
   /* @DeleteMapping("/username")
    public String getUserName(){
        System.out.println("Try to get user name");
        return "get user name successfully!";
    }*/

   @GetMapping("/userinfo")
    public String getUserInfo(@RequestParam String userId) {
        return "Hello";
    }
}
