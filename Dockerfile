# 1. Maven kullanarak projeyi derleme aşaması.
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /build

# pom.xml ve src klasörünü kopyala
COPY pom.xml ./
COPY src ./src

# Uygulamayı derliyoruz
RUN mvn clean package -DskipTests

# 2. Daha küçük bir JDK ile uygulamayı çalıştırma aşaması.
FROM openjdk:17-jdk-slim

# Build aşamasından çıkan JAR dosyasını kopyala
COPY --from=build /build/target/*.jar /app.jar

# Uygulamayı çalıştır
ENTRYPOINT ["java", "-jar", "/app.jar"]
