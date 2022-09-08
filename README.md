# spring-google-maps-reviews
Spring Boot endpoint to get reviews from Google Maps

## Run docker with
```docker build -t spring-google-maps-reviews```

## mvn install & mvn test
In order to install or test the software with Maven, it is required to set the environtment variables so that the tests don't fail.
To do that, in the terminal, just use the following commands:
```
export GOOGLE_MAPS_PLACE_ID=any_place_id
export GOOGLE_MAPS_API_KEY=any_api_key

mvn install

unset GOOGLE_MAPS_PLACE_ID
unset GOOGLE_MAPS_API_KEY
```