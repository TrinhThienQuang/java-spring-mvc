package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Fuck you!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "only user can access this site";
    }
    
    @GetMapping("/admin")
    public String adminPage() {
        return "only admin can access this site";
    }
}