import java.util.*;
public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }
    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }
    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }
    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }
    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }
    public String[] changeElectResultAgain(String[] results) {
        return new String[]{results[2],results[3],results[4]};
    }
    public static void main(String[] args) {
        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity().changeElectResultAgain(results);
        System.out.println(Arrays.toString(changedResults));
    }
}