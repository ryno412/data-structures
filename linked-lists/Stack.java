class Stack {
	private LinkList list;
	//a stack using a linked list
	public Stack () {
		list = new LinkList();		
	}
	public void push (int key, double value) {
		list.insertListItem(key, value);
	}
	public Link pop () {
		return list.deleteListItem();
	}
	public void displayStack () {
		list.displayList();
	}

}//end class