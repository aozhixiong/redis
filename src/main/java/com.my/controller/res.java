import redis.clients.jedis.Jedis;

public class Test {

    public void fun1(){
        //开启连接
        Jedis jedis = new Jedis("localhost", 6379);
        //切换库（默认0库）
        jedis.select(0);
        //存放数据
        jedis.set("hello", "你好啊");
        //获取数据
        String string = jedis.get("hello");
        //输出打印
        System.out.println("测试用例");
        System.out.println(string);
        //回收资源
        jedis.close();
    }
}
