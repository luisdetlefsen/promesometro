package com.promesometro.repository;

import com.promesometro.entities.PromiseMediaContent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "promiseMedia", path="promiseMediaContent")
public interface PromiseMediaContentRepository extends PagingAndSortingRepository<PromiseMediaContent, Long> {
}
