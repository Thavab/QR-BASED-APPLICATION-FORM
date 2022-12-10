package com.example.persistence.dao;

import com.example.persistence.model.User;
import com.example.persistence.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
