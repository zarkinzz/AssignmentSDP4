// This class is a concrete implementation of the Renderer interface.
// It provides rendering logic for shapes (Circle and Square) using vector graphics.
public class VectorRenderer implements Renderer {

    // Render a circle using vector graphics, given its radius
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rendering Circle using Vector Renderer with radius: " + radius);
    }

    // Render a square using vector graphics, given its side length
    @Override
    public void renderSquare(float side) {
        System.out.println("Rendering Square using Vector Renderer with side: " + side);
    }
}
