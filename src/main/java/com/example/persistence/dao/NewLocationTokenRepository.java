package com.example.persistence.dao;

import com.example.persistence.model.NewLocationToken;
import com.example.persistence.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}
