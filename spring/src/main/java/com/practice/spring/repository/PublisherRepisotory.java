package com.practice.spring.repository;

import com.practice.spring.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepisotory extends JpaRepository<Publisher, Long> {

}
