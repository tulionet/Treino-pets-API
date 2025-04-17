package org.backend_pets.safe_pets.repository;

import org.backend_pets.safe_pets.model.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnimalRepository extends MongoRepository<Animal, String> {
}
