package com.vn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.entity.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {

}
