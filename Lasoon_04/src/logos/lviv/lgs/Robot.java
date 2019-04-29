package logos.lviv.lgs;

public class Robot {

		public String text;
		public Robot() {
			text = "Я Robot, я просто працюю";
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
