import com.ambev.pratico2.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ErroController {

    @GetMapping("/nome/{nome}")
    public ResponseEntity<String> erroEndpoint(@PathVariable String nome) {
        if ("erro".equals(nome)) {
            // Dispara uma custom Exception com código de retorno 400 (Bad Request)
            throw new CustomException("erro no serviço");
        } else {
            return ResponseEntity.ok("Nome válido: " + nome);
        }
    }

    @GetMapping("/generic")
    public ResponseEntity<String> genericEndpoint() {
        // Dispara uma Exception com código 500 (Internal Server Error)
        throw new RuntimeException("Erro genérico no servidor");
    }

    // Manipula a CustomException lançada no endpoint /api/nome/{nome}
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}

