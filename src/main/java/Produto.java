import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
public class Produto {
    @Id
    private int id;
    private String descricao;
    private double preco;

    // Construtor e métodos getters e setters
}
