package design.patterns.p12.chain.of.responsibility.p02;

//抽象处理器
abstract class Handler {
	private Handler nextHandler = null;

	public void setNextHandler(Handler handler) {
		nextHandler = handler;
	}

	public final Response handlerRequest(Request request) {
		Response response = null;
		if (this.getHandlerLevel().above(request.getLevel())) {
			response = this.response(request);
		} else {
			if (nextHandler != null) {
				response = this.nextHandler.handlerRequest(request);
			} else {
				System.out.println("没有合适的处理器处理该请求...");
			}
		}
		return response;
	}

	protected abstract Level getHandlerLevel();

	public abstract Response response(Request request);
}

//具体的处理器 1
class ConcreteHandler1 extends Handler {
	@Override
	protected Level getHandlerLevel() {
		return new Level(1);
	}

	@Override
	public Response response(Request request) {
		System.out.println("该请求由 ConcreteHandler1 处理");
		return new Response("响应结果 1");
	}
}

//具体的处理器 2
class ConcreteHandler2 extends Handler {
	@Override
	protected Level getHandlerLevel() {
		return new Level(2);
	}

	@Override
	public Response response(Request request) {
		System.out.println("该请求由 ConcreteHandler2 处理");
		return new Response("响应结果 2");
	}
}

//具体的处理器 3
class ConcreteHandler3 extends Handler {
	@Override
	protected Level getHandlerLevel() {
		return new Level(3);
	}

	@Override
	public Response response(Request request) {
		System.out.println("该请求由 ConcreteHandler3 处理");
		return new Response("响应结果 3");
	}
}
