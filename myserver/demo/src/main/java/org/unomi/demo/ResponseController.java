package org.unomi.demo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.io.Writer;

@RestController
public class ResponseController {
    @RequestMapping("/github")
    public void response1(HttpServletResponse response) throws IOException {
        response.setStatus(200);
        response.setHeader("type", "redirect");

        //  Writer writer=response.getWriter();
        // writer.write("response success");
        response.sendRedirect("https://github.com/foxkemo");
    }
}
