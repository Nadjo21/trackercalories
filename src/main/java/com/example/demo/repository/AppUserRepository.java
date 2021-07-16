package com.example.demo.repository;

import com.example.demo.model.Appuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<Appuser,Integer> {
}
