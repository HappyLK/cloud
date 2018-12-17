package springcloud.feignconsumer.dto.commmon;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 20:33
 *
 * feign 日志基本枚举类
 */
public enum LoggerLevel {
    /**
     * No logging.不记录日志
     */
    NONE,

    /**
     *只记录请求方法和URL，以及响应状态代码和执行时间。
     * Log only the request method and URL and the response status code and execution time.
     */
    BASIC,

    /**
     *记录请求和响应头基本信息。
     * Log the basic information along with request and response headers.
     */
    HEADERS,

    /**
    *记录请求和响应的标头、正文和元数据
    * Log the headers, body, and metadata for both requests and responses.
    */
    FULL;
}
