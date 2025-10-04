// This abstract class represents the shape in the Bridge Design Pattern.
// It uses a Renderer to delegate the rendering of shapes.
public abstract class Shape {
    protected Renderer renderer;  // The Renderer associated with the shape

    // Constructor that accepts a Renderer to be used for rendering the shape
    public Shape(Renderer renderer) {
        this.renderer = renderer;  // Set the renderer for the shape
    }

    // Abstract method to draw the shape. This will be implemented by concrete shapes.
    public abstract void draw();

    // Abstract method to resize the shape. This will be implemented by concrete shapes.
    public abstract void resize(float factor);
}
