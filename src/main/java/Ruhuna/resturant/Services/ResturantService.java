package Ruhuna.resturant.Services;

import Ruhuna.resturant.Model.Resturant;
import Ruhuna.resturant.Repository.ResturantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResturantService {
    @Autowired
    private ResturantRepository resturantRepository;

    // 1. Get all restaurants
    public List<Resturant> getAllResturants() {
        return resturantRepository.findAll();
    }

    // 2. Save a new restaurant (Business Rule: capitalize the name)
    public Resturant saveResturant(Resturant resturant) {
        return resturantRepository.save(resturant);
    }

    // 3. Find by ID
    public Resturant getResturantById(Long id) {
        return resturantRepository.findById(id).orElse(null);
    }

    // 4. Delete
    public void deleteResturantById(Long id) {
        resturantRepository.deleteById(id);
    }
}
