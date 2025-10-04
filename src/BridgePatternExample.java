// This class demonstrates the Bridge Design Pattern using Circle and Square shapes
// with different renderers (Vector and Raster).
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
