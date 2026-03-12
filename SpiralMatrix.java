/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spiralmatrix;

class SpiralMatrix
{
    public static void main(String args[])
    {
        int mat[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1;

        while(top <= bottom && left <= right)
        {
            // left → right
            for(int i = left; i <= right; i++)
                System.out.print(mat[top][i] + " ");
            top++;

            // top → bottom
            for(int i = top; i <= bottom; i++)
                System.out.print(mat[i][right] + " ");
            right--;

            // right → left
            for(int i = right; i >= left; i--)
                System.out.print(mat[bottom][i] + " ");
            bottom--;

            // bottom → top
            for(int i = bottom; i >= top; i--)
                System.out.print(mat[i][left] + " ");
            left++;
        }
    }
}