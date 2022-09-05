package maps.services;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import maps.entities.Response;
import maps.entities.Review;

@Service
public class MapsService {

    private String GOOGLE_MAPS_API_KEY = System.getenv("GOOGLE_MAPS_API_KEY");
    private String GOOGLE_MAPS_PLACE_ID = System.getenv("GOOGLE_MAPS_PLACE_ID");
    private String url;
    private final RestTemplate restTemplate;
    private List<Review> reviews = null;
    private Date lastUpdate;

    private static final Logger logger = LoggerFactory.getLogger(MapsService.class);

    public MapsService() {
        this.url = "https://maps.googleapis.com/maps/api/place/details/json?fields=reviews&language=pt-PT&place_id=" + this.GOOGLE_MAPS_PLACE_ID + "&key=" + this.GOOGLE_MAPS_API_KEY;
        logger.info(this.url);
        this.restTemplate = new RestTemplate();
    }

    public List<Review> getReviews() {
        if (reviews != null && lastUpdate != null) {
            Date now = new Date();
            long diff = now.getTime() - lastUpdate.getTime();
            System.out.println(TimeUnit.MILLISECONDS.toHours(diff));

            if (TimeUnit.MILLISECONDS.toHours(diff) <= 24) {
                return reviews;
            }
        }

        lastUpdate = new Date();
        Response response = restTemplate.getForObject(url, Response.class);
        reviews = response.getResult().getReviews();
        System.out.println(reviews);
        reviews.forEach(review -> {
            review.setAuthorName(review.getAuthorName().split(" ").length > 1 ? review.getAuthorName().split(" ")[0] + " " + review.getAuthorName().split(" ")[review.getAuthorName().split(" ").length - 1] : review.getAuthorName().split(" ")[0]);
        });
        return reviews;
    }
}
