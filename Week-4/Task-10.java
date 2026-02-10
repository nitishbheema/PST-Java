import java.util.*;

public class Solution {

    static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int bottom = m - layer - 1;
            int left = layer;
            int right = n - layer - 1;

            // top row
            for (int j = left; j <= right; j++)
                elements.add(matrix.get(top).get(j));

            // right column
            for (int i = top + 1; i < bottom; i++)
                elements.add(matrix.get(i).get(right));

            // bottom row
            for (int j = right; j >= left; j--)
                elements.add(matrix.get(bottom).get(j));

            // left column
            for (int i = bottom - 1; i > top; i--)
                elements.add(matrix.get(i).get(left));

            int len = elements.size();
            int rot = r % len;

            // rotate anti-clockwise
            Collections.rotate(elements, -rot);

            int idx = 0;

            // put back top row
            for (int j = left; j <= right; j++)
                matrix.get(top).set(j, elements.get(idx++));

            // put back right column
            for (int i = top + 1; i < bottom; i++)
                matrix.get(i).set(right, elements.get(idx++));

            // put back bottom row
            for (int j = right; j >= left; j--)
                matrix.get(bottom).set(j, elements.get(idx++));

            // put back left column
            for (int i = bottom - 1; i > top; i--)
                matrix.get(i).set(left, elements.get(idx++));
        }

        // print result
        for (List<Integer> row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        matrixRotation(matrix, r);
    }
}
