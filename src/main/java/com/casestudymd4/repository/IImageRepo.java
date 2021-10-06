package com.casestudymd4.repository;

import com.casestudymd4.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageRepo extends JpaRepository<Image,Long> {
}
