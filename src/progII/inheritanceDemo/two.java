package inheritanceDemo;

class two extends one{
	int no = 3;
	public static void main(String[] args)
	{ 
		two t = new two();
		t.print();
	}

	// optional: @Override
	public void print()
	{
		super.print(); // 1 - the one.print() doesn't know we override no
		System.out.println(super.no); // 1 - the "old" declaration
		System.out.println(no); // 3 - our no declaration!
		System.out.println(((one)this).no); // 1 - no late binding
		super.print(); // 1 - same

		no = 2;

		System.out.println(no); // 2 - our declaration was changed
		System.out.println(super.no); // 1 - the super.no is a different variable
		
		//((one)this).print(); // calls this method - endless loop!
	}
}
