package pkg;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;

public class FindNearestPointsTesting2 {

    @Test
    public void testInputArray() {
      Scanner testScanner = new Scanner("3 -1 0 3 -1 -1 -1 200 150 100");
      double [][] actualArray = FindNearestPoints.inputArray(testScanner);
      double [][] expectedArray = {
          {-1.0, 0.0, 3.0}, 
          {-1, -1, -1}, 
          {200, 150, 100}
      };
      assertArrayEquals(actualArray, expectedArray);
    }
    
    @Test
    public void testDistance1() {
      
      double actualDistance = FindNearestPoints.distance(-1,-2,-3, -2,3,-4); 
      double expectedDistance = 3 * Math.sqrt(3);
      
      assertEquals(actualDistance, expectedDistance, 0.000001);
    }
    
    @Test
    public void testDistance2() {
      
      double actualDistance = FindNearestPoints.distance(8,8,8, 8,8,8); 
      double expectedDistance = 0;
      
      assertEquals(actualDistance, expectedDistance, 0.000001);
    }
    @Test
    public void testClosestPoints() {
      double [][] testArray = {
          {-1.0, 0.0, 3.0}, 
          {-1, -1, -1}, 
          {200, 150, 100}
      };
      int [] actualIndices = FindNearestPoints.closestPoints(testArray);
      
      int [] expectedIndices = {0,1};
      assertArrayEquals(actualIndices, expectedIndices);
    }
  }
  