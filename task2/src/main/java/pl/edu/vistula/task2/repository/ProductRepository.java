package pl.edu.vistula.task2.repository;

import pl.edu.vistula.task2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}