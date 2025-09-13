```markdown
# Geometry Shapes Application

## Description
This Java application allows users to interactively create geometric shapes, specifically circles and rectangles, and calculate their areas. The shapes created can also be visually represented in the console using basic text drawing.

## Project Structure

```
src/
├── application/
│   └── Program.java
├── entities/
│   ├── Circulo.java
│   ├── Forma.java
│   └── Retangulo.java
└── repository/
    └── Desenhavel.java
```

- **`application/`**: Contains main application logic.
  - `Program.java`: Main class for application execution.
- **`entities/`**: Contains classes that represent different geometric shapes and their functionalities.
  - `Forma.java`: Abstract base class for all shapes.
  - `Circulo.java`: Circle implementation including area calculation and drawing method.
  - `Retangulo.java`: Rectangle implementation including area calculation and drawing method.
- **`repository/`**: Interfaces and shared resources.
  - `Desenhavel.java`: Interface for drawable objects.

## Technologies Used
- Java

## Dependencies and Installation

This project does not require any external dependencies apart from the Java Development Kit (JDK). Ensure you have JDK installed on your machine.

1. **Install JDK**: Follow the official documentation to install JDK: [JDK Installation](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. **Clone the Repository**:
   ```bash
   git clone https://your-repository-url.git
   cd your-project-folder
   ```
3. **Compile the Java files**:
   ```bash
   javac src/application/Program.java
   ```

## Running the Application

To run the application, use the following command from the root directory of the project:

```bash
java src/application/Program
```

Follow the command prompts to input the number of shapes, types of shapes (circle or rectangle), and their dimensions.

## Running Tests

As this project does not currently include a formal testing framework, testing is conducted manually by inputting values into the running application and verifying the output.

## Detailed Code Explanation

### `Program.java`
- **Main method**: Entry point, orchestrates user input, shape creation and calculations.
- **User Input Processing**: Uses `Scanner` to obtain shape information from the user.
- **Shape Creation and Management**: Based on user input, creates instances of `Circulo` or `Retangulo` and stores them in a list.

### `Circulo.java` and `Retangulo.java`
- **Area Calculation**: Implements the area method from `Forma`.
- **Drawing**: Implements drawing functionality from `Desenhavel` to provide a visual representation.

### `Forma.java`
- **Abstract Base Class**: Sets a contract for derived shapes to implement the `area()` method.

### `Desenhavel.java`
- **Interface**: Requires implementing classes (like `Circulo` and `Retangulo`) to provide a `desenhar()` method for drawing the shape.

## Examples of Usage

```plaintext
How many shapes will you create?: 2
Enter shape type (c for Circle, r for Rectangle): c
Radius of the circle?: 5
Enter shape type (c for Circle, r for Rectangle): r
Width of the rectangle?: 4
Height of the rectangle?: 3
Drawing Circle:
     *****
  *********
 ***********
  *********
     *****
Area: 78.54
Drawing Rectangle:
****
****
****
Area: 12.0
```

## Contribution Guidelines

- **Pull Requests**: Always create a new branch for your changes and submit a pull request against the `main` branch.
- **Coding Standards**: Follow standard Java coding conventions and include comments where necessary.
- **Feature Suggestions**: Use issues to propose new features or enhancements.

## Tips for Contributing

1. Familiarize yourself with the project structure and Java codebase.
2. Test your changes thoroughly before pushing them.
3. Keep the codebase clean and well-documented to maintain readability.

## License

[MIT License](LICENSE.md)
```

This `README.md` provides a comprehensive overview of the project, making it easier for new users and contributors to understand and navigate the application structure and codebase.