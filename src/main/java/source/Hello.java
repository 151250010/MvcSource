package source;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import utils.PropertiesReader;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class Hello {

    @GetMapping("/sayhello")
    public String sayHello(HttpServletRequest request) {

        /**
         * 尝试一下获取tempdir
         */
        getCurrentWebTempDir(request);

        getPropertiesOfName("test.name");

        System.out.println("Hello!");
        return "Hello";
    }

    private void getPropertiesOfName(String s) {
        //get the value of properties
        System.out.println(PropertiesReader.getProperValue(s));
    }

    private void getCurrentWebTempDir(HttpServletRequest request) {
        //get the dir of current web application in the servlet container
        File file = (File) request.getServletContext().getAttribute("javax.servlet.context.tempdir");
        System.out.println(file.getAbsolutePath());
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
