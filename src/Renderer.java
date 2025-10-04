// This interface defines the contract for rendering shapes.
// Concrete renderers (VectorRenderer, RasterRenderer) implement this interface.

public interface Renderer {
    void renderCircle(float radius);  // Method to render a circle
    void renderSquare(float side);    // Method to render a square
}
