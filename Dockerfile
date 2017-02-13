FROM openjdk:8u92-jre-alpine
WORKDIR /catalog-service
ARG version
ADD ./build/libs/catalog-service-${version:-1.0.0.RELEASE}.jar /catalog-service/catalog-service.jar
CMD java -jar catalog-service.jar