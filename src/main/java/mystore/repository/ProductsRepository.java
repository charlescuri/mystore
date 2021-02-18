package mystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mystore.model.Products;

/**
 * @author Charles Curi
 * Interface DAO para acesso ao bd
 */

public interface ProductsRepository extends JpaRepository<Products,Long> {

}
