package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import writer.Writer;

@Service
public class WriterService {
	private Writer writer;

	@Autowired
	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public void run() {
		String s = "This is my test";
		writer.write(s);
	}
}

	