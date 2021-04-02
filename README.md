# Tasks

## A3 Exploring A Picture

1. Modify the `main` method in the `PictureExplorer` class to create and explore a different picture from the images folder.

2. Add a picture to the images folder and then create and explore that picture in the `main` method. If the picture is very large (for instance, one from a digital camera), you can scale it using the scale method in the `Picture` class.

For example, you can make a new picture (`“smallMyPicture.jpg”` in the `images` folder) one-fourth the size of the original (“myPicture.jpg”) using:

```java
Picture p = new Picture("myPicture.jpg"); 
Picture smallP = p.scale(0.25,0.25); 
smallP.write("smallMyPicture.jpg");
```

## A4 Two-dimensional Arrays

1. Write a `getCount` method in the IntArrayWorker class that returns the count of the number of times a passed integer value is found in the matrix. There is already a method to test this in IntArrayWorkerTester. Just uncomment the method `testGetCount()` and the call to it in the main method of `IntArrayWorkerTester`.

2. Write a `getLargest` method in the `IntArrayWorker` class that returns the largest value in the matrix. There is already a method to test this in `IntArrayWorkerTester`. Just uncomment the method `testGetLargest()` and the call to it in the main method of `IntArrayWorkerTester`.

3. Write a `getColTotal` method in the IntArrayWorker class that returns the total of all integers in a specified column. There is already a method to test this in IntArrayWorkerTester. Just uncomment the method testGetColTotal() and the call to it in the main method of IntArrayWorkerTester.

## A5 

1. Open `PictureTester.java` and run its `main` method. You should get the same results as running the `main` method in the `Picture` class. The `PictureTester` class contains class (static) methods for testing the methods that are in the `Picture` class.

2. Uncomment the appropriate test method in the main method of `PictureTester` to test any of the other methods in `Picture.java`. You can comment out the tests you don’t want to run. You can also add new test methods to `PictureTester` to test any methods you create in the `Picture` class.

The following code is the `zeroBlue` method in the `Picture` class.

```java
public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
 }
```

3. Using the `zeroBlue` method as a starting point, write the method `keepOnlyBlue` that will keep only the blue values, that is, it will set the red and green values to zero. Create a class (static) method to test this new method in the class `PictureTester`. Be sure to call the new test method in the `main` method in `PictureTester`.

4. Write the `negate` method to negate all the pixels in a picture. To negate a picture, set the red value to 255 minus the current red value, the green value to 255 minus the current green value and the blue value to 255 minus the current blue value. Create a class (static) method to test this 
new method in the class `PictureTester`. Be sure to call the new test method in the `main` method in `PictureTester`. 

5. Write the `grayscale` method to turn the picture into shades of gray. Set the red, green, and 
blue values to the average of the current red, green, and blue values (add all three values and 
divide by 3). Create a class (static) method to test this new method in the class
`PictureTester`. Be sure to call the new test method in the main method in `PictureTester`.

6. Challenge — Explore the `“water.jpg”` picture in the images folder. Write a method
`fixUnderwater()` to modify the pixel colors to make the fish easier to see. Create a class 
(static) method to test this new method in the class `PictureTester`. Be sure to call the new 
test method in the `main` method in `PictureTester`. 