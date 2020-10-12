package design.patterns.p03.prototype.p03;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream inputStream = null;
		try {
			serverSocket = new ServerSocket(9527);
			socket = serverSocket.accept();
			inputStream = socket.getInputStream();

			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			Object closet = objectInputStream.readObject();
			System.out.println(closet);

			Method method = closet.getClass().getMethod("getName");
			System.out.println(method.invoke(closet));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (Exception e2) {
			}
			try {
				socket.close();
			} catch (Exception e2) {
			}
			try {
				serverSocket.close();
			} catch (Exception e2) {
			}
		}
	}

}
