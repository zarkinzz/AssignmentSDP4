// This abstract class represents the Shape in the Bridge Design Pattern.
// It is associated with a Renderer, which allows the shape to be drawn or resized
// using different rendering methods. The Shape class defines the common interface
// for all concrete shapes (Circle, Square, etc.), but the actual drawing logic
// is delegated to the renderer.

abstract class Shape {
    protected Renderer renderer;  // Bridge: association with the renderer

    // Constructor that accepts a renderer object
    // The renderer determines how the shape will be drawn or resized
    public Shape(Renderer renderer) {
        this.renderer = renderer; // Set the renderer for the shape
    }

    // Abstract method to draw the shape, to be implemented by concrete shapes
    public abstract void draw();

    // Abstract method to resize the shape, to be implemented by concrete shapes
    public abstract void resize(float factor);
}
