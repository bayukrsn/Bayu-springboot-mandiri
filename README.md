# Bayu-springboot-mandiri

Technical Assessment - Bayu Krisna Adi Winata

CI/CD flow:

![mandiri-flow drawio (2)](https://user-images.githubusercontent.com/96294690/170949553-b0adae3b-6a33-45c9-bf5b-5d5432fbe251.png)

Docker Container Registry : https://hub.docker.com/r/bayukrsn/bayu-springboot/tags

1. Push source code ke GitHub
2. Jenkins pull dari repository GitHub
3. Jenkins melakukan push ke Container Registry
4. Jenkins melakukan deploy dari source code yang di pull dari GitHub
5. App bisa diakses melalui mobile

![docker-image_bayu-springboot](https://user-images.githubusercontent.com/96294690/170938946-db281164-980f-444a-a0b5-5f8e35e9fe8c.png)
