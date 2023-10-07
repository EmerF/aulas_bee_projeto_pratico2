package com.ambev.pratico2;

import com.ambev.pratico2.controller.ProdutoController;
import com.ambev.pratico2.model.Cerveja;
import com.ambev.pratico2.model.Produto;
import com.ambev.pratico2.model.Refrigerante;
import com.ambev.pratico2.repository.ProdutoRepository;
import com.ambev.pratico2.service.ProdutoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class Pratico2ApplicationTests {

	@Mock
	private ProdutoRepository produtoRepository;

	private ProdutoService produtoService;
	private ProdutoController produtoController;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this); // Inicializa os mocks

		produtoService = new ProdutoService(produtoRepository);
		produtoController = new ProdutoController();
		produtoController.produtoService = produtoService;
	}

	@Test
	public void testProduto() {
		Produto produto = new Produto(1L, "Produto de Teste", 10.0);
		assertEquals(1L, produto.getId());
		assertEquals("Produto de Teste", produto.getDescricao());
		assertEquals(10.0, produto.getPreco(), 0.001);
	}

	@Test
	public void testCerveja() {
		Cerveja cerveja = new Cerveja(2L, "Cerveja IPA", 5.99, true);
		assertEquals(2L, cerveja.getId());
		assertEquals("Cerveja IPA", cerveja.getDescricao());
		assertEquals(5.99, cerveja.getPreco(), 0.001);
		assertTrue(cerveja.isComAlcool());
	}

	@Test
	public void testRefrigerante() {
		Refrigerante refrigerante = new Refrigerante(3L, "Refrigerante Diet", 3.99, false);
		assertEquals(3L, refrigerante.getId());
		assertEquals("Refrigerante Diet", refrigerante.getDescricao());
		assertEquals(3.99, refrigerante.getPreco(), 0.001);
		assertFalse(refrigerante.isComAcucar());
	}

	@Test
	public void testProdutoService() {
		Produto produto = new Produto(4L, "Produto Novo", 12.99);

		when(produtoRepository.save(produto)).thenReturn(produto);

		ProdutoService produtoService = new ProdutoService(produtoRepository);
		Produto produtoSalvo = produtoService.salvarProduto(produto);

		verify(produtoRepository, times(1)).save(produto);

		assertEquals(produto, produtoSalvo);
	}

	@Test
	public void testProdutoController() {
		Produto produto = new Produto(5L, "Produto de Teste", 10.0);

		when(produtoRepository.save(produto)).thenReturn(produto);

		ResponseEntity<Produto> response = produtoController.createProduct(produto);

		assertEquals(HttpStatus.CREATED, response.getStatusCode());
		assertEquals(produto, response.getBody());
	}

}


