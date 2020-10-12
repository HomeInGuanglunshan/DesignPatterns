package design.patterns.p12.chain.of.responsibility.p02;

//请求
class Request {
	Level level;

	public Request(Level level) {
		System.out.println("开始请求...");
		this.level = level;
	}

	public Level getLevel() {
		return level;
	}
}

//响应
class Response {
	private String message;

	public Response(String message) {
		System.out.println("处理完请求");
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
