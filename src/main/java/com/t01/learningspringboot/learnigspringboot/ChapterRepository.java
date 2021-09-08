package com.t01.learningspringboot.learnigspringboot;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository 
             extends ReactiveCrudRepository<Chapter, String> {

}
