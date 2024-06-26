package com.example.demo.repository;

import com.example.demo.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
    @Query("SELECT s FROM Shop s JOIN FETCH s.user u WHERE u.email = :email")
    Shop getShopFromUserEmail(@Param("email") String email);
}
