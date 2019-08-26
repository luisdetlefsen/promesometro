package com.promesometro.repository;

import com.promesometro.entities.PromiseMediaContent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "promiseMedia", path="promiseMediaContent")
public interface PromiseMediaContentRepository extends PagingAndSortingRepository<PromiseMediaContent, Long> {

    @Query("select pmc from PromiseMediaContent pmc where pmc.promise.idPromise = :idPromise")
    List<PromiseMediaContent> findAllByPromise(@Param("idPromise") Long idPromise);
}
