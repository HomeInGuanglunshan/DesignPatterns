package design.patterns.p03.prototype.p03;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket socket = null;
		OutputStream outputStream = null;
		try {
			socket = new Socket("127.0.0.1", 9527);
			outputStream = socket.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

			Clothes clothes = new Clothes("YISHION");
			Closet closet = new Closet("IKEA", clothes);
			objectOutputStream.writeObject(closet);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (Exception e2) {
			}
			try {
				socket.close();
			} catch (Exception e2) {
			}
		}
	}

}
