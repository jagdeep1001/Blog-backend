package com.casestudy2.blog.repository;

import com.casestudy2.blog.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<users, Long> {
    users findByEmail(String email);

    users findByUserId(Long user_id);

    users getByEmail(String name);
}

