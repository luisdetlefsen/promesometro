package com.promesometro.repository;

import com.promesometro.entities.Promise;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "promises", path="promises")
public interface PromiseRepository extends PagingAndSortingRepository<Promise, Long> {


    @Query("select p from Promise p where p.candidate.idCandidate = :idCandidate")
    public List<Promise> findAllByCandidate(@Param("idCandidate") Long idCandidate);
}
