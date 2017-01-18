package writer;

import org.springframework.stereotype.Service;

@Service
public class NiceWriter implements Writer {
		public void write(String s) {
			System.out.println("The string is " + s);
		}
}
