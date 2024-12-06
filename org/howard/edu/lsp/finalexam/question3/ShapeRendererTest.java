package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;


public class ShapeRendererTest {
    @Test
    public void testRenderCircle() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("circle");
        
        assertEquals("Drawing a Circle\n", outContent.toString());
    }

    @Test
    public void testRenderRectangle() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("rectangle");
        
        assertEquals("Drawing a Rectangle\n", outContent.toString());
    }

    @Test
    public void testRenderTriangle() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("triangle");
        
        assertEquals("Drawing a Triangle\n", outContent.toString());
    }

    @Test
    public void testRenderUnknownShape() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("hexagon");
        
        assertEquals("Unknown shape type: hexagon\n", outContent.toString());
    }
}
