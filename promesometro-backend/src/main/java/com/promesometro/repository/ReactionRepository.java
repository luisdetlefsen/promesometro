package com.promesometro.repository;

import com.promesometro.entities.Reaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "reactions", path = "reactions")
public interface ReactionRepository extends PagingAndSortingRepository<Reaction, Long> {

    @Query(value = "select r from Reaction r where r.userEmail=:emailAddress and r.promise.idPromise=:promiseId", nativeQuery = false)
    Reaction findReactionByUserEmailIsAndPromise(@Param("emailAddress") String email, @Param("promiseId") Long promiseId);
}
