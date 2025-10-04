// This class is a concrete implementation of the Renderer interface.
// It provides rendering logic for shapes (Circle and Square) using raster graphics.
public class RasterRenderer implements Renderer {

    // Render a circle using raster graphics, given its radius
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rendering Circle using Raster Renderer with radius: " + radius);
    }

    // Render a square using raster graphics, given its side length
    @Override
    public void renderSquare(float side) {
        System.out.println("Rendering Square using Raster Renderer with side: " + side);
    }
}
