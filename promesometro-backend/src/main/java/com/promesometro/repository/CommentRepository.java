package com.promesometro.repository;

import com.promesometro.entities.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "comments", path="comments")
public interface CommentRepository extends PagingAndSortingRepository<Comment,Long> {

    @Query("select c from Comment c where c.promise.idPromise=:promiseId and c.approved = true")
    List<Comment> findAllByPromise(@Param("promiseId")Long promiseId);
}
