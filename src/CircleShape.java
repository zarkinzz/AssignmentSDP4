// This class represents a Circle shape and extends the Shape class.
// It uses the renderer to draw and resize the circle.
public class CircleShape extends Shape {
    private float radius; // Holds the radius of the circle

    // Constructor to initialize the Circle with a renderer and radius
    public CircleShape(Renderer renderer, float radius) {
        super(renderer); // Pass the renderer to the parent class (Shape)
        this.radius = radius; // Set the radius of the circle
    }

    // Method to draw the circle using the renderer
    @Override
    public void draw() {
        renderer.renderCircle(radius);  // Delegate drawing to the renderer
    }

    // Method to resize the circle by a given factor and print the new radius
    @Override
    public void resize(float factor) {
        radius *= factor;  // Multiply the radius by the resize factor
        System.out.println("Resized Circle to radius: " + radius);  // Print the resized radius
    }
}
