/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testKeepOnlyBlue()
  {
    Picture gorge = new Picture("images/gorge.jpg");
    gorge.explore();
    gorge.keepOnlyBlue();
    gorge.explore();
  }

  public static void testNegate()
  {
    Picture koala = new Picture("images/koala.jpg");
    koala.explore();
    koala.negate();
    koala.explore();
  }

  public static void testGrayscale()
  {
    Picture lion = new Picture("images/femaleLionAndHall.jpg");
    lion.explore();
    lion.grayscale();
    lion.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture water = new Picture("images/water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture arch = new Picture("images/arch.jpg");
    arch.explore();
    arch.mirrorHorizontal();
    arch.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images/water.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void runTests()
  {
    /** uncomment a call here to run a test
    and comment out the ones you don't want
    to run */
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    // testMirrorDiagonal();
    // testCollage();
    // testCopy();
    // testEdgeDetection();
    // testEdgeDetection2();
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}