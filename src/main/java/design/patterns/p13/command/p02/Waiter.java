package design.patterns.p13.command.p02;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	private List<AbstractCommand> order = new ArrayList<AbstractCommand>();

	/**
	 * 设置订单
	 * 
	 * @param command
	 *            具体命令，也就是具体烤什么
	 */
	public void setOrder(AbstractCommand command) {
		order.add(command);
		System.out.println("增加订单：" + command.toString());
	}

	/**
	 * 取消订单
	 * 
	 * @param command
	 */
	public void cancelOrder(AbstractCommand command) {
		order.add(command);
		System.out.println("取消订单：" + command.toString());
	}

	/**
	 * 通知全部执行
	 */
	public void notifyX() {
		for (AbstractCommand cmd : order) {
			cmd.excuteCommand();
		}
	}
}