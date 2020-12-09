package com.capgemini.greetingappnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.greetingappnew.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
