class Link {
	public int id;  //(key)
	public double data; // data item 
	public Link next;

 	//constuctor
	public Link (int key, double value) {
		id = key;
		data = value;
	}
	public void displayLink () {
		System.out.print("{" + id + " , " + data + '}');
	}
}//end Link Class