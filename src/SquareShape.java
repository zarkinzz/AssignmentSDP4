// This class represents a Square shape and extends the Shape class.
// It uses the renderer to draw and resize the square.
public class SquareShape extends Shape {
    private float side;  // Holds the side length of the square

    // Constructor to initialize the Square with a renderer and side length
    public SquareShape(Renderer renderer, float side) {
        super(renderer);  // Pass the renderer to the parent class (Shape)
        this.side = side;  // Set the side length of the square
    }

    // Method to draw the square using the renderer
    @Override
    public void draw() {
        renderer.renderSquare(side);  // Delegate drawing to the renderer
    }

    // Method to resize the square by a given factor and print the new side length
    @Override
    public void resize(float factor) {
        side *= factor;  // Multiply the side length by the resize factor
        System.out.println("Resized Square to side: " + side);  // Print the resized side length
    }
}
