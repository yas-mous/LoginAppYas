import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyServiceController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        // Simuler l'identifiant du worker
        String workerId = "Worker " + (int)(Math.random() * 100);
        return "Hello " + name + ", I am " + workerId;
    }

    @GetMapping("/chat")
    public String chat() {
        // Simuler l'identifiant du worker
        String workerId = "Worker " + (int)(Math.random() * 100);
        return workerId + " is chatting";
    }
}
