package Ruhuna.resturant.Controller;

import Ruhuna.resturant.Model.Resturant;
import Ruhuna.resturant.Services.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/resturant")
public class ResturantController {

    @Autowired
    private ResturantService resturantService;

    @GetMapping("/get-all-resturants")
    public List<Resturant> getAllResturants() {
        return resturantService.getAllResturants();
    }

    @PostMapping("/add-resturant")
    public Resturant addRestaurant(@RequestBody Resturant resturant) {
        return resturantService.saveResturant(resturant);
    }

    @PutMapping("/update-resturant/{id}")
    public ResponseEntity<Resturant> updateRestaurant(@PathVariable Long id, @RequestBody Resturant updated) {
        Resturant existing = resturantService.getResturantById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        existing.setName(updated.getName());
        existing.setLocation(updated.getLocation());
        existing.setCuisine(updated.getCuisine());
        existing.setRating(updated.getRating());
        return ResponseEntity.ok(resturantService.saveResturant(existing));
    }

    @DeleteMapping("/delete-resturant/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable Long id) {
        if (resturantService.getResturantById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        resturantService.deleteResturantById(id);
        return ResponseEntity.noContent().build();
    }
}
