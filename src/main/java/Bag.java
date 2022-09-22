/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */
/**
 * A Bag
 */
public abstract class Bag {

    /**
     * The bag's colour
     */
    private String color;
    /**
     * The number of contents in the bag
     */
    private int numberOfContents = 0;
    /**
     * The bag's capacity (number of contents the bag can hold)
     */
    private int capacity;
    /**
     * A list of the bag's contents
     */
    private String[] contents;




    /**
     *Initializes this Bag with the given colour and capacity, and no contents
     *
     * @param color  the colour of the Bag
     * @param capacity  the capacity of the Bag
     */
    public Bag (String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.contents = new String[capacity];
    }



    /**
     * Return the Bag's colour
     *
     * @return the Bag's colour attribute
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Return the number of contents in the bag
     *
     * @return the Bag's numberOfContents attribute
     */
    public int getNumberOfContents(){
        return this.numberOfContents;
    }

    /**
     * Return the Bag's capacity
     *
     * @return the Bag's capacity attribute
     */
    public int getCapacity(){
        return this.capacity;
    }

    /**
     * Set the Bag's colour to newColour
     */
    public void setColor(String newColour){
        this.color = newColour;
    }

    public boolean addItem(String item){
        if (this.numberOfContents < this.capacity){
            this.contents[numberOfContents] = item;
            numberOfContents += 1;
            return true;
        }else{
            return false;
        }

    }





    /**
     * Return the last item added to the bag, and remove it from the Bag's contents
     *
     * If there are no items in this Bag, return null.
     *
     * @return a String of the last item added to the Bag or null if this Bag is empty
     */
    public String popItem(){
        if (numberOfContents == 0){
            return null;
        }else{
            this.numberOfContents -= 1;
            String to_return = this.contents[numberOfContents];
            this.contents[numberOfContents] = "";
            return to_return;
        }
    }



    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;
        String[] new_contents = new String[capacity];
        for (int i = 0; i < this.contents.length; i++){
            new_contents[i] = this.contents[i];
        }
        this.contents = new_contents;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return a String representation of the bag including its colour, number of contents, and capacity
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}
