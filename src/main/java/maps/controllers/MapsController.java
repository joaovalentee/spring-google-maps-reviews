package maps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maps.entities.Review;
import maps.services.MapsService;

@RestController
@RequestMapping("/reviews")
public class MapsController {

    @Autowired
    private MapsService service;

    @GetMapping
    public List<Review> getReviews() {
        return service.getReviews();
    }
    
}
