// This interface defines the Renderer for shapes in the Bridge Design Pattern.
// It declares methods to render different shapes (Circle and Square).
// The actual implementation of these methods will be provided by concrete renderers (e.g., VectorRenderer, RasterRenderer).

interface Renderer {
    // Method to render a circle with a given radius
    void renderCircle(float radius);

    // Method to render a square with a given side length
    void renderSquare(float side);
}
