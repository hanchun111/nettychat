package dao;

import redis.clients.jedis.Jedis;

public class RedisDao {

    private Jedis jedis;

    public RedisDao(){
        this.jedis = new Jedis("127.0.0.1");
    }

    public void testJedis(){

        System.out.print("Redis 链接："+jedis.ping());
    }

    public Jedis getJedis(){
        return this.jedis;
    }
}
