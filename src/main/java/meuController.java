import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class meuController {
    @GetMapping("/nome/{nome}")
    public void endpointNome(@PathVariable String nome) {
        if ("erro".equals(nome)) {
            throw new CustomException("erro no serviço", 400);
        }
    }

    @GetMapping("/generic")
    public void endpointGeneric() {
        throw new Exception("Ocorreu  um erro genérico", 500);
    }
}
