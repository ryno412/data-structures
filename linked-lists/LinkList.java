public class LinkList {
	private Link first;

	//constructor
	public LinkList () {
		first = null;
	}

	public boolean isEmpty () {
		return (first == null);
	}

	public void insertListItem (int id, double data) {
		Link newLink = new Link(id, data);
		newLink.next = first; 
		first = newLink;
	}
	//deletes frist - assumes list is not empty
	public Link deleteListItem () {
		//save ref to first link;
		Link tmp = first;
		first = first.next;
		return tmp;
	}
	public void displayList () {
		System.out.print("first -- > Last");
		//start at the beggining of list
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}


}//end Link List Class