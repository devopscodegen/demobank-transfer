package com.example.bank.transfer.domain.model.common;

import java.io.Serializable;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import jakarta.annotation.Nonnull;

@NoRepositoryBean
public interface BaseRepository<Aggregate extends BaseAggregateRoot<Aggregate, ID>, ID extends Serializable> extends MongoRepository<Aggregate, ID> {

    default @Nonnull Aggregate getById(@Nonnull ID id) {
        return findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
}
