
class LinkedListApp {
	public static void main (String[] args) {
		LinkList theList = new LinkList();
		theList.insertListItem(22, 2.99);
		theList.insertListItem(44, 4.99);
		theList.insertListItem(66, 6.99);
		theList.insertListItem(88, 8.99);
		theList.displayList();
		System.out.println("Linked lists here we come!");
	}
}