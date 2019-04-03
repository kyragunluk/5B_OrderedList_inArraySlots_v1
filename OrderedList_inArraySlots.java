/**
  OrderedList_inArraySlots

  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */

public class OrderedList_inArraySlots implements OrderedList{

    private List_inArraySlots list_iAS;

    public OrderedList_inArraySlots() {
        list_iAS = new List_inArraySlots();
    }

    /**
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }
    public int size(){
        return list_iAS.size();
    }

  	public int get(int index){
  		  return list_iAS.get(index);
  	}

/*
  	public boolean add( int value){
        for (int index = 0 ; index < orderedList.size() ; index++){
            if (value <= orderedList.get(index)){
                orderedList.add(index , value);
                return true;
            }
        }
        orderedList.add(value);
        return true;
  	}
*/
  	public int remove( int index) {
  		  return list_iAS.remove(index);
  	}

    /**
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( int value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
            ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
     }
}
