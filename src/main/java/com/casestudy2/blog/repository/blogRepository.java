package com.casestudy2.blog.repository;

import com.casestudy2.blog.model.blogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface blogRepository extends JpaRepository<blogs, Long> {
    List<blogs> findAll();
}
