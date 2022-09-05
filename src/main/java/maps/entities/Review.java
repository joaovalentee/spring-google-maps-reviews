package maps.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Review {
    
    @JsonProperty("author_name")
    private String authorName;
    @JsonProperty("author_url")
    private String authorUrl;
    @JsonProperty("language")
    private String language;
    @JsonProperty("profile_photo_url")
    private String profilePhotoUrl;
    @JsonProperty("rating")
    private int rating;
    @JsonProperty("relative_time_description")
    private String relativeTimeDescription;
    @JsonProperty("text")
    private String text;
    @JsonProperty("time")
    private Date time;

    @Override
    public String toString() {
        return "Review [authorName=" + authorName + ", authorUrl=" + authorUrl + ", language=" + language
                + ", profilePhotoUrl=" + profilePhotoUrl + ", rating=" + rating + ", relativeTimeDescription="
                + relativeTimeDescription + ", text=" + text + ", time=" + time + "]";
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorUrl() {
        return authorUrl;
    }
    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }
    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getRelativeTimeDescription() {
        return relativeTimeDescription;
    }
    public void setRelativeTimeDescription(String relativeTimeDescription) {
        this.relativeTimeDescription = relativeTimeDescription;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
}
