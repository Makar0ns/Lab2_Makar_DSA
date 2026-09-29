

public class Test{
    public static void main(String[] args){

    ListReferenceBased list = new ListReferenceBased(); 
    //testing if list is empty
    System.out.println("The list is empty: " + list.isEmpty());

    //testing size()
    System.out.println("The size of the list is: " + list.size());
    
    //testing adding elements to the list
    list.add(1, "First");
    list.add(2, "Second");
    list.add(3, "Third");
    System.out.println("The size of the list after adding elements is: " + list.size());


    //testing removing elements from the list
    list.remove(1);
    System.out.println("The size of the list after deleting an element is: " + list.size());
    }
}