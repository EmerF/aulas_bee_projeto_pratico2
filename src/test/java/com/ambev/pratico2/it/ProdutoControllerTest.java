package com.ambev.pratico2.it;

import com.ambev.pratico2.model.Cerveja;
import com.ambev.pratico2.model.Produto;
import com.ambev.pratico2.repository.ProdutoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class ProdutoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    public void testErroBadRequest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/nome/erro")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testGenerico() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/generic")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testCadastrarProduto() throws Exception {
        Produto cerveja = new Cerveja(1, "Spaten", "One Way 600ml",8.60, true);
        cerveja.setDescricao("One Way 600ml");
        cerveja.setPreco(8.60);
        ((Cerveja) cerveja).setComAlcool(true);

    }

}


