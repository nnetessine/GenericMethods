package cmsc256;


public class GenericPractice<T extends Comparable<T>> {



    // Method 1

// If the array is non-empty, then this function returns an element // from near the middle of the array; otherwise, it returns null

    public static <T> T middle(T[] data) {



         T result = null;

        int numElements = data.length;



        if(numElements > 0) {

            // return an element near the center of the array
            result = data[(numElements/2)];

        }


        return result;

    }



// Method 2

// counts the number of occurrences of the target in the given array

    public static <T extends Comparable<T>> int countTarget(T[] data, T target ) {

        int numOccurrences = 0;

            for (int i = 0; i < data.length; i++) {
                if (data[i] != null && target != null) {
                    if (data[i].equals(target)) {
                        numOccurrences++;
                    }
                }
                else if(target == null && data[i] == target){
                    numOccurrences++;
                }

            }

        return numOccurrences;

    }



// Method 3

// returns the smallest element in the array

    public static <T extends Comparable<T>> T findSmallest( T[] values) {

        T smallest = values[0];

        for(int i = 1; i < values.length; i++){
            if(values[i] != null){
                if(smallest.compareTo(values[i]) > 0){
                    smallest = values[i];
                }
            }


        }

        return smallest;

    }






}
