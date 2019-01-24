package chain;

public class Test {

    public static void main(String[] args) {
        //请求参数
        Request request = new Request(Handler.Level.THIRD);
        //执行器
        HandlerExecutor executor = new HandlerExecutor();
        //返回信息
        Response response = executor.handler(request);
        System.out.println("response = " + response.getMessage());
    }
}
