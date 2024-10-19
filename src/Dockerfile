# 1. İlk aşamada Maven kullanarak projeyi derliyoruz.
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .

# Uygulamayı derliyoruz
RUN mvn clean package -DskipTests

# 2. Daha küçük bir JDK ile uygulamayı çalıştırmak için yeni bir aşama başlatalım.
FROM openjdk:17-jdk-slim

# Uygulamanın çalışacağı dizin
WORKDIR /app

# Build aşamasından çıkan JAR dosyasını kopyala
COPY --from=build /app/target/*.jar app.jar

# Uygulamayı çalıştır
ENTRYPOINT ["java", "-jar", "app.jar"]
