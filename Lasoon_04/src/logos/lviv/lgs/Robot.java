package logos.lviv.lgs;

public class Robot {

		public String text;
		public Robot() {
			text = "� Robot, � ������ ������";
		}
		
		public String work(Object obj) {
			
			return obj.toString();
		}
		
		public String work() {
			return this.text;
		}

		@Override
		public String toString() {
			return text;
		} 
		
}
