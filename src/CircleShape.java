// This class represents a Circle shape that uses the Bridge Design Pattern.
// It extends the Shape class and is associated with a specific Renderer.
// The Circle class can be drawn and resized using the methods from the Renderer.
// The resize method adjusts the radius and prints the new size of the circle.

class CircleShape extends Shape {
    private float radius; // Holds the radius of the circle

    // Constructor to initialize the Circle with a renderer and a radius
    public CircleShape(Renderer renderer, float radius) {
        super(renderer); // Pass the renderer to the parent class (Shape)
        this.radius = radius; // Set the radius of the circle
    }

    // Method to draw the circle using the renderer
    public void draw() {
        renderer.renderCircle(radius); // Delegate drawing to the renderer
    }

    // Method to resize the circle by a given factor and print the new radius
    public void resize(float factor) {
        radius *= factor; // Multiply the radius by the resize factor
        System.out.println("Resized Circle to radius: " + radius); // Print the resized radius
    }
}
