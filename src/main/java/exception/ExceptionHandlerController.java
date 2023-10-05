package exception;

import exception.CustomNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandlerController {
    @GetMapping("/api/nome/{erro}")
    public String getNome(@PathVariable String nome) {
        if(nome.equals("erro")) {
            throw new CustomNotFoundException("erro no serviço");
        }
        return "Nome: " + nome;
    }
    @RequestMapping("/api/generic")
    public String generic() throws Exception {
        throw new Exception("Erro interno do servidor");
    }
}
