package com.ambev.pratico2.servicos;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ambev.pratico2.produtos.Produto;

public class ProdutoRepository implements MongoRepository {
    public Produto save(final Produto produto) {
        return produto;
    }

    @Override
    public List saveAll(final Iterable iterable) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public List findAll(final Sort sort) {
        return null;
    }

    @Override
    public Page findAll(final Pageable pageable) {
        return null;
    }

    @Override
    public List findAll(final Example example, final Sort sort) {
        return null;
    }

    @Override
    public List findAll(final Example example) {
        return null;
    }

    @Override
    public List insert(final Iterable iterable) {
        return null;
    }

    @Override
    public Object insert(final Object o) {
        return null;
    }

    @Override
    public Optional findOne(final Example example) {
        return Optional.empty();
    }

    @Override
    public Page findAll(final Example example, final Pageable pageable) {
        return null;
    }

    @Override
    public long count(final Example example) {
        return 0;
    }

    @Override
    public boolean exists(final Example example) {
        return false;
    }

    @Override
    public Object findBy(final Example example, final Function queryFunction) {
        return null;
    }
}
