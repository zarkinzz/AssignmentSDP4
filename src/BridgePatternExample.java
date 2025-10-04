// This class demonstrates the Bridge Design Pattern.
// It uses two types of renderers (VectorRenderer and RasterRenderer)
// to draw and resize two shapes: a Circle and a Square.
// The renderer is separated from the shapes, allowing flexibility
// to change the rendering method without modifying the shape classes.

public class BridgePatternExample {
    public static void main(String[] args) {
        // Create two renderers: vector and raster
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        // Create a circle and a square with different renderers
        Shape circle = new CircleShape(vectorRenderer, 5);
        Shape square = new SquareShape(rasterRenderer, 3);

        // Draw the shapes
        circle.draw();
        square.draw();

        // Resize the shapes and show the updated result
        circle.resize(1.5f);
        square.resize(2.0f);

        // Draw the shapes again after resizing
        circle.draw();
        square.draw();
    }
}
