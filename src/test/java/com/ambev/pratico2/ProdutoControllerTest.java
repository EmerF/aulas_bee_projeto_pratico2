package com.ambev.pratico2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ProdutoControllerTest {
    @Autowired
    private MockMvc mockMvc;

@Test
public void testarSalvarProduto() throws Exception {
    String json = "{\"descricao\":\"Cerveja\",\"preco\":10.0,\"comAlcool\":true}";
    mockMvc.perform(MockMvcRequestBuilders.post("/api/produtos")
        .contentType(MediaType.APPLICATION_JSON)
        .content(json))
        .andExpect(MockMvcResultMatchers.status().isCreated())
        .andExpect(MockMvcResultMatchers.jsonPath("$.descricao").value("Cerveja"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.preco").value(10.0))
        .andExpect(MockMvcResultMatchers.jsonPath("$.comAlcool").value(true));
    }
}