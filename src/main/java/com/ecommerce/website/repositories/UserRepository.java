package com.ecommerce.website.repositories;

import com.ecommerce.website.entities.user.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UserRepository extends
        CrudRepository<UserEntity, Long>,
        PagingAndSortingRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);
    boolean existsByEmail(String email);
}