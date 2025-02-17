package com.example.fooddeliveryy.Repositories;

import com.example.fooddeliveryy.Entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
