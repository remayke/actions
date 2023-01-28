package br.com.group.artifact;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {

    
    @GetMapping
    ResponseEntity<String> getHome() {
        return ResponseEntity.ok().body("Hello world");
    }
}
