import java.util.Arrays;

public class FlipImage {

    /*
    * Our startup is developing a photo editing app, and we need to implement a feature that allows users
    * to rotate their (squared) images by 180 degrees. The output should be the same 2D matrix with the rotated image.
    *
    * Example 1:
    *   image = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    *   expectedOutput = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    *
    * Example 2:
    *   image = {{1, 2}, {3, 4}};
    *   expectedOutput = {{4, 3}, {2, 1}};
    *
    * Logic: Start swapping from the corners to the innermost number, until we get to the middle.
    *   To achieve this, we need to create a new array with the same dimensions of the original array
    *   start filling the resulting array with the elements of the original array starting from its end.
     * */


    public static int[][] rotateImage(int[][] image){

        //If no 2D array is provided, return it
        if(image.length < 2){
            return image;
        }

        int[][] rotated = new int[image[0].length][image[1].length];

        int end = image[0].length;

        for(int i = 0; i < end; i++){

            for(int j = 0; j < end; j++){

                rotated[i][j] = image[end-i-1][end-j-1];
            }
        }

        return rotated;
    }


}
