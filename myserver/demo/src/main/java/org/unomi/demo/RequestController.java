package org.unomi.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @RequestMapping("/login")
    public String request(HttpServletRequest request){

        String name=request.getParameter("name");
        String password=request.getParameter("password");
        System.out.printf("name %s,pass %s",name,password);
    if(name.equals("admin") && password.equals("admin")) {
        return "<script>alert('Success!');</script>";
    }else
    { return  "<script>alert('Fail!');</script>";}


    }
    @RequestMapping("/register")
    public String register(HttpServletRequest request){
//        String method=request.getMethod();
//        String uri=request.getRequestURI();
//        String url=request.getRequestURL().toString();
//        String query=request.getQueryString();
//        String protocol=request.getProtocol();
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        System.out.printf("name %s,pass %s,email %s\n",name,password,email);

        return "Successfully registered";
    }


}
