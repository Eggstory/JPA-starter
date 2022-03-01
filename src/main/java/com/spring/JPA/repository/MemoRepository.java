package com.spring.JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.JPA.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {

}
