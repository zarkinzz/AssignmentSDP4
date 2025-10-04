// This class represents a Square shape that uses the Bridge Design Pattern.
// It extends the Shape class and is associated with a specific Renderer.
// The Square class can be drawn and resized using the methods from the Renderer.
// The resize method adjusts the side length and prints the new size of the square.

class SquareShape extends Shape {
    private float side; // Holds the side length of the square

    // Constructor to initialize the Square with a renderer and a side length
    public SquareShape(Renderer renderer, float side) {
        super(renderer); // Pass the renderer to the parent class (Shape)
        this.side = side; // Set the side length of the square
    }

    // Method to draw the square using the renderer
    public void draw() {
        renderer.renderSquare(side); // Delegate drawing to the renderer
    }

    // Method to resize the square by a given factor and print the new side length
    public void resize(float factor) {
        side *= factor; // Multiply the side length by the resize factor
        System.out.println("Resized Square to side: " + side); // Print the resized side length
    }
}
