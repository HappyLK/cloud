package springcloud.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


/**
 * @author V_Happy.L.K
 * @date 2018/12/18 10:34
 * 判断是否含有token
 */
@Component
public class AccessFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

//        dosomething();
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            System.out.println("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
//        try{
//            dosomething();
//        } catch (Exception e) {
////            ctx.set("error.message", "test error info");
//            ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//            ctx.set("error.exception", e);
//        }

        System.out.println("access token ok");
        return null;
    }

    private void dosomething() {
        throw  new RuntimeException("test error info.......");
    }
}
