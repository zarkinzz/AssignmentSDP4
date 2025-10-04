// VectorRenderer.java
// This class is a concrete implementation of the Renderer interface.
// It provides rendering logic for shapes (Circle and Square) using vector graphics.
// The methods renderCircle and renderSquare print messages showing the rendering process.

class VectorRenderer implements Renderer {
    // Render a circle using vector graphics, given its radius
    public void renderCircle(float radius) {
        System.out.println("Rendering Circle using Vector Renderer with radius: " + radius);
    }

    // Render a square using vector graphics, given its side length
    public void renderSquare(float side) {
        System.out.println("Rendering Square using Vector Renderer with side: " + side);
    }
}

// RasterRenderer.java
// This class is another concrete implementation of the Renderer interface.
// It provides rendering logic for shapes (Circle and Square) using raster graphics.
// The methods renderCircle and renderSquare print messages showing the rendering process.

class RasterRenderer implements Renderer {
    // Render a circle using raster graphics, given its radius
    public void renderCircle(float radius) {
        System.out.println("Rendering Circle using Raster Renderer with radius: " + radius);
    }

    // Render a square using raster graphics, given its side length
    public void renderSquare(float side) {
        System.out.println("Rendering Square using Raster Renderer with side: " + side);
    }
}
