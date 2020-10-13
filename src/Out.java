
public class Out {
	
private int intOne = 2;

	public class In {
		
		private int intTwo;
		
		public In(int myInnerInt) {
			this.intTwo = myInnerInt;
		}
		public int getMyInnerInt() {
			return this.intTwo;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Out o = new Out();
Out.In in = o.new In(2);
System.out.println(o.intOne + in.intTwo);

	}

}
