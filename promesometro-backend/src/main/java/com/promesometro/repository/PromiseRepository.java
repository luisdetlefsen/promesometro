package com.promesometro.repository;

import com.promesometro.entities.Promise;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "promises", path="promises")
public interface PromiseRepository extends PagingAndSortingRepository<Promise, Long> {
}
