package maps.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private MyResult result;
    private String status;

    public void setResult(MyResult result) {
        this.result =  result;
    }

    public MyResult getResult() {
        return this.result;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public static class MyResult {
        private List<Review> reviews;

        public MyResult() {
            this.reviews = new ArrayList<>();
        }

        public List<Review> getReviews() {
            return reviews;
        }
    
        public void setReviews(List<Review> reviews) {
            this.reviews = reviews;
        }
    
        public void addReview(Review review) {
            reviews.add(review);
        }
    }
}

