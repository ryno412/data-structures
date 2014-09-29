
class LinkedListApp {
	public static void main (String[] args) {
		LinkList theList = new LinkList();
		theList.insertListItem(22, 2.99);
		theList.insertListItem(44, 4.99);
		theList.insertListItem(66, 6.99);
		theList.insertListItem(88, 8.99);
		theList.displayList();

		//stack with alinked list
		Stack theStack = new Stack();
		theStack.push(1, 1.99);
		theStack.push(2, 2.99);
		theStack.push(3, 3.99);
		theStack.push(4, 4.99);
		theStack.displayStack();
		System.out.println("lets remove an item");

		Link removedItem = theStack.pop();
		System.out.print("removed item:" + removedItem.id);
		System.out.println(" ");
		theStack.displayStack();

		System.out.println("Linked lists here we come!");
	}
}