/**
 * A class of bags whose entries are stored in a fixed-size array.
 * 
 * @author Frank M. Carrano
 * @author edited by: Terence WIlbert
 * 
 *         The toString method is overwritten to give a nice display of the
 *         items in the bag in this format Bag{Size:# <1> <2> <3> <4> } NOTE:
 *         This version is sub-optimal HPH //- * @version 3.0
 */
public class ArrayBag<T> implements BagInterface<T> {

    private final T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    /** Creates an empty bag whose initial capacity is 25. */
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    } // end default constructor

    /**
     * Creates an empty bag having a given initial capacity.
     * 
     * @param capacity
     *            the integer capacity desired
     */
    public ArrayBag(int capacity) {
        numberOfEntries = 0;

        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Object[capacity]; // unchecked cast
        bag = tempBag;
    } // end constructor

    /**
     * Adds a new entry to this bag.
     * 
     * @param newEntry
     *            the object to be added as a new entry
     * @return true if the addition is successful, or false if not
     */
    public boolean add(T newEntry) {
        boolean result = true;
        if (isFull()) {
            result = false;
        } else { // assertion: result is true here
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        } // end if
        return result;
    } // end add

    /**
     * Retrieves all entries that are in this bag.
     * 
     * @return a newly allocated array of all the entries in the bag
     */
    public T[] toArray() {

        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries]; // unchecked cast
        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        } // end for
        return result;
    } // end toArray

    /**
     * Sees whether this bag is full.
     * 
     * @return true if the bag is full, or false if not
     */
    public boolean isFull() {
        return numberOfEntries == bag.length;
    } // end isFull

    /**
     * Sees whether this bag is empty.
     * 
     * @return true if the bag is empty, or false if not
     */
    public boolean isEmpty() {
        return numberOfEntries == 0;
    } // end isEmpty

    /**
     * Gets the current number of entries in this bag.
     * 
     * @return the integer number of entries currently in the bag
     */
    public int getCurrentSize() {
        return numberOfEntries;
    } // end getCurrentSize

    /**
     * Counts the number of times a given entry appears in this bag.
     * 
     * @param anEntry
     *            the entry to be counted
     * @return the number of times anEntry appears in the bag
     */
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        for (int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(bag[index])) {
                counter++;
            } // end if
        } // end for
        return counter;
    } // end getFrequencyOf

    /**
     * Tests whether this bag contains a given entry.
     * 
     * @param anEntry
     *            the entry to locate
     * @return true if the bag contains anEntry, or false otherwise
     */
    public boolean contains(T anEntry) {
        return getIndexOf(anEntry) > -1;
    } // end contains

    /** Removes all entries from this bag. */
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    } // end clear

    /**
     * Removes one unspecified entry from this bag, if possible.
     * 
     * @return either the removed entry, if the removal was successful, or null
     *         otherwise
     */
    public T remove() {
        T result = null;

        // MODIFY THIS METHOD TO REMOVE A RANDOM ITEM FROM THE BAG

        if (numberOfEntries > 0) {
            numberOfEntries--;
            result = bag[numberOfEntries];
            bag[numberOfEntries] = null;
        } // end if

        return result;
    } // end remove

    /**
     * Removes one occurrence of a given entry from this bag.
     * 
     * @param anEntry
     *            the entry to be removed
     * @return true if the removal was successful, or false if not
     */
    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    } // end remove

    // Removes and returns the entry at a given index within the arraybag.
    // If no such entry exists, returns null.
    private T removeEntry(int givenIndex) {
        T result = null;
        if (!isEmpty() && (givenIndex >= 0)) {
            result = bag[givenIndex]; // entry to remove
            numberOfEntries--;
            bag[givenIndex] = bag[numberOfEntries]; // replace entry with last
                                                    // entry
            bag[numberOfEntries] = null; // remove last entry
        } // end if
        return result;
    } // end removeEntry

    // Locates a given entry within the array bag.
    // Returns the index of the entry, if located, or -1 otherwise.
    private int getIndexOf(T anEntry) {
        int where = -1;
        boolean found = false;
        for (int index = 0; !found && (index < numberOfEntries); index++) {
            if (anEntry.equals(bag[index])) {
                found = true;
                where = index;
            } // end if
        } // end for
        // Assertion: If where > -1, anEntry is in the array bag, and it
        // equals bag[where]; otherwise, anEntry is not in the array
        return where;
    } // end getIndexOf

    /**
     * Override the equals method so that we can tell if two bags contain the
     * same items the contents in the bag.
     * 
     * @return a string representation of the contents of the bag
     */
    public String toString() {

        String result = "Bag{Size:" + numberOfEntries + " ";

        for (int index = 0; index < numberOfEntries; index++) {
            result += "<" + bag[index] + "> ";
        } // end for

        result += "}";
        return result;
    } // end toArray

    /*********************************************************************
     * 
     * METHODS TO BE COMPLETED
     * 
     * 
     * 
     * ***********************************************************************/
    /**
     * Check to see if two bags are equals.
     * 
     * @param aBag
     *            another object to check this bag against
     * @return true the two bags contain the same objects with the same
     *         frequencies
     */
    public boolean equals(ArrayBag<T> aBag) {
        // If the bags are not the same size, they are clearly not equal.
        if (numberOfEntries != aBag.getCurrentSize()){
            return false;
        }

        int thisFreq = 0; // The frequency with which each item appears in this bag.
        int otherFreq = 0; // The frequency with which each item appears in aBag.
        
        // Iterate once for each item in this bag.
        for (int i = 0; i < numberOfEntries; i++) {
            // item is the element of this bag we are checking in this iteration.
            T item = bag[i];
            
            // See how many times this item is found in each bag.
            thisFreq = this.getFrequencyOf(item);
            otherFreq = aBag.getFrequencyOf(item);
            
            // If the item appears in the bags with different frequencies, the
            //  bags are not equal.
            if (thisFreq != otherFreq) {
                return false;
            }
        }
        
        // The bags are the same size and each item occurs the same number of
        //  times in each bag - they are equal.
        return true;
    } // end equals

    /**
     * Duplicate all the items in a bag.
     * 
     * @return true if the duplication is possible
     */
    public boolean duplicateAll() {
        // If the bag is more than half full, we fail.
        if ((numberOfEntries * 2) > bag.length) {
            return false;
        }

        // Store the original bag size for our iteration count.
        int origSize = numberOfEntries;

        // Iterate once for each item in this bag.
        for (int i = 0; i < origSize; i++) {
            // Copy each item to the bag again.
            this.add(bag[i]);
        }
        return true;
    } // end duplicateAll

    /**
     * Remove all duplicate items from a bag
     */
    public void removeDuplicates() {

        int i = 0; // index of items to check
        int d = 0; // index of remaining items to check against
        // Iterate over each item in the bag...
        for (i = 0; i < numberOfEntries; i++) {
            // ...and check all of the following items for duplicates...
            for (d = i + 1; d < numberOfEntries; d++) {
                // ...removing them when found.
                if (bag[d] == bag[i]) {
                    this.removeEntry(d);
                    // We'll have to check the item at this position again
                    //  since the remaining items will shift.
                    d--;
                }
            }
        }
        return;
    } // end removeDuplicates

} // end ArrayBag
