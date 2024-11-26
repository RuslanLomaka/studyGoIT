import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    int[] createAgeArray(int i, int i1, int i2, int i3) {
        return new int[]{i, i1, i2, i3};
    }

    public static void main(String[] args) {
        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));
    }


}