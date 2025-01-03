public class GCDemo {

	int objId;

	GCDemo(int objId) {
		this.objId = objId;
		System.out.println("Created " + this.objId);
	}

	public static void main(String[] args) {
		
		new GCDemo(1);
		new GCDemo(2);

		for (int i = 1; i <= 50; i++) {
			//new GCDemo(i);
			System.gc();
		}
	}//for i=500000 finalized gets called

	@Override
	protected void finalize() {
		System.out.println("Finalized " + objId);
	}
}
