# Simple Spring Boot app wit MongoDB
This is a simple project which uses spring boot and mongodb. Docker-compose will be used to get the app up and running in own container
```
docker-compose build # build the backend app
docker-compose up -d # pull mongodb image and start the backend app
```

The app will be reachable under port 9091: e.g. http://localhost:9091/fruits
