<!-- README.md -->

<h1>Controle_JEE</h1>

<p>
  <strong>Controle_JEE</strong> is a basic Spring Boot Java web application that uses H2 in-memory database and JPA.
  It's a sample project designed to demonstrate essential concepts like REST APIs, validation, Swagger documentation, and more.
</p>

<h2>🚀 Features</h2>
<ul>
  <li>Spring Boot 3.x with Java 17</li>
  <li>Spring Web & JPA</li>
  <li>H2 in-memory database</li>
  <li>RESTful APIs</li>
  <li>Validation with Jakarta</li>
  <li>Swagger UI using SpringDoc OpenAPI</li>
</ul>

<h2>🛠️ Technologies</h2>
<ul>
  <li>Java 17</li>
  <li>Spring Boot</li>
  <li>H2 Database</li>
  <li>Maven</li>
  <li>Swagger / OpenAPI</li>
</ul>

<h2>🔧 How to Run</h2>
<ol>
  <li>Clone the repository:</li>
  <pre><code>git clone https://github.com/WaveXagency/Controle_JEE.git</code></pre>

  <li>Navigate to the project directory:</li>
  <pre><code>cd Controle_JEE</code></pre>

  <li>Run the project:</li>
  <pre><code>mvn spring-boot:run</code></pre>

  <li>Access Swagger UI at:</li>
  <pre><code>http://localhost:8080/swagger-ui.html</code></pre>

  <li>Access H2 Console at:</li>
  <pre><code>http://localhost:8080/h2-console</code></pre>
  <small>Use JDBC URL: <code>jdbc:h2:mem:testdb</code></small>
</ol>

<h2>📂 Project Structure</h2>
<ul>
  <li><code>controller</code> - Contains REST controllers</li>
  <li><code>service</code> - Business logic</li>
  <li><code>repository</code> - Data access layer</li>
  <li><code>model</code> - Entity classes</li>
  <li><code>dto</code> - Data Transfer Objects</li>
</ul>

<h2>📄 License</h2>
<p>Free to use and modify.</p>
