<a name="readme-top"></a>

<div align="center">

  <h1><b>Java Spring Boot Movie API</b></h1>

</div>
<br>

# 📗 Table of Contents

- [📖 About the Project](#about-project)
  - [🛠 Built With](#built-with)
    - [Tech Stack](#tech-stack)
    - [Key Features](#key-features)
  - [🚀 Live Demo](#live-demo)
- [💻 API Documentation](#api-documentation)
- [📷 Preview](#Preview)
- [👥 Author](#authors)
- [🤝 Contributing](#contributing)
- [⭐️ Show your support](#support)

<br>

# 📖 Java Spring Boot Movie API <a name="about-project"></a>

This project is a Spring Boot API written in Java that connects to a MongoDB database containing movies. The API allows you to get a single, or multiple movies using a GET Request, which will return data back as JSON objects. You can also use a POST Request which will allow you to post a review to the database.

<br>

## 🛠 Built With <a name="built-with"></a>

- Java
- Spring Boot
- Maven
- Docker

### Tech Stack <a name="tech-stack"></a>

I am using Java, Spring Boot, Maven, and Docker.

<details>
  <summary>Client</summary>
  <ul>
    <li><a href="https://dev.java/">Java</a></li>
    <li><a href="https://docs.spring.io/spring-boot/documentation.html">Spring Boot</a></li>
    <li><a href="https://maven.apache.org/">Maven</a></li>
    <li><a href="https://docs.docker.com/">Docker</a></li>
  </ul>
</details>

### Key Features <a name="key-features"></a>

- There are two GET Methods, one for getting all movies, and one for getting a single movie.
- There is one POST Method to create a review for a movie.
- The project contains a Dockerfile for deployment.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## 🚀 Live Demo <a name="live-demo"></a>

[Hosted on Koyeb](https://golden-mignonne-justin-pope-beb53e33.koyeb.app/api/v1/movies)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## 💻 API Documentation <a name="api-documentation"></a>

### Retrieving Movies

**Base URL:** `https://golden-mignonne-justin-pope-beb53e33.koyeb.app`

Get a list of all movies as an array of JSON objects:

**Endpoint:** `/api/v1/movies`

Get a single movie as a JSON object using the imdbId as a parameter:

**Endpoint:** `/api/v1/movies/[imdbId]`

Both of these endpoints will use a GET Request, and will return the data in JSON format.

<br>

### Posting Reviews

You can post reviews at the following endpoint, using a POST method:

**Endpoint:** `/api/v1/reviews`

Reviews must be posted by specifying the reviewBody which is the content of the review and the imdbId so it can be mapped to a specific movie.

**Example Code:**

      const response = await api.post("/api/v1/reviews", {
        reviewBody: rev.value,
        imdbId: movieId,
      });

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## 📷 Preview <a name="Preview"></a>

### Multiple Movies

<br>
<img width="739" alt="Screenshot of Justin Pope's Java Spring Boot Movie API with an array of multiple movies as JSON objects" src="https://github.com/user-attachments/assets/42442d01-59bc-40d9-9deb-b9b29903066d">

<br>

### Single Movie

<br>
<img width="739" alt="Screenshot of Justin Pope's Java Spring Boot Movie API with a JSON object of a single movie" src="https://github.com/user-attachments/assets/53c13e4f-7060-459b-910c-9c94d3ba4c10">

<br>
<br>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## 👥 Author <a name="authors"></a>

👤 **Justin Pope**

- GitHub: [@justinpope99](https://github.com/justinpope99)
- LinkedIn: [LinkedIn](https://www.linkedin.com/in/justin-pope-2a040a102/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## 🤝 Contributing <a name="contributing"></a>

Contributions, issues, and feature requests are welcome!

Feel free to check the [issues page](../../issues/).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## ⭐️ Show your support <a name="support"></a>

If you like this project give it a star

<p align="right">(<a href="#readme-top">back to top</a>)</p>
