import java.util.*;

public class AddInsertDeleteArrays
{
    public static void main(String[] args)
    {
        // create a string array and initialize it with values
        String[] foodsIDoNotLike = {"eggplant","zucchini","durian","plums","mandarin oranges","chestnuts"};

        // use the printStringArray method to iterate through the string array and print the contents
        printStringArray(foodsIDoNotLike);

        // use the append method to add 2 more foods to the string array
        foodsIDoNotLike = append(foodsIDoNotLike, "kale");
        foodsIDoNotLike = append(foodsIDoNotLike, "quinoa");

        // use the printStringArray method to iterate through the string array and print the contents (again)
        printStringArray(foodsIDoNotLike);

        // use the pop method to delete the last value of the array (and return a smaller array)
        foodsIDoNotLike = pop(foodsIDoNotLike);

        // use the printStringArray method to iterate through the string array and print the contents (again++)
        printStringArray(foodsIDoNotLike);

        // use the insert method to insert another value at the specified index
        foodsIDoNotLike = insert(foodsIDoNotLike, 3, "broccolflower");

        // use the printStringArray method to iterate through the string array and print the contents (again++)
        printStringArray(foodsIDoNotLike);
    }

    public static String[] append(String[] args, String newstring)
    {
        // create a new array with 1 additional index position
        String[] newarray = new String[args.length+1];
        // use arraycopy to copy the old array to the new
        System.arraycopy(args, 0, newarray, 0, newarray.length - 1);
        // add the new data the the last index of the array
        newarray[newarray.length-1] = newstring;

        return newarray;
    }

    public static String[] pop(String[] args)
    {
        // create an array which is 1 less than the original
        String[] newarray = new String[args.length-1];
        // copy the old array to the new, having the last index being clipped off
        System.arraycopy(args, 0, newarray, 0, newarray.length);

        return newarray;
    }

    public static String[] insert(String[] args, int index, String newstring)
    {
        // create an array one larger than the pre-existing one
        String[] stringArray = new String[args.length+1];
        // create a list containing the contents of the array
        List<String>stringArrayList = new ArrayList<>(Arrays.asList(args));
        // insert a new value into the list
        stringArrayList.add(index, newstring);
        // convert the list into an array again
        stringArray = stringArrayList.toArray(stringArray);

        // return the updated array!
        return stringArray;
    }

    public static void printStringArray(String[] args)
    {
        System.out.println("size of the array: " + args.length);
        System.out.println();
        System.out.println(Arrays.toString(args));
        System.out.println("----------------------------------");
    }

}
