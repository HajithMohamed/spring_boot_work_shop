package Ruhuna.resturant.Repository;

import Ruhuna.resturant.Model.Resturant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResturantRepository extends JpaRepository<Resturant, Long> {
}
