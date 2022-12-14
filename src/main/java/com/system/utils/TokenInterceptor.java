package com.system.utils;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Token拦截器
 *
 * @author : Bei-Zhen
 * @date : 2020-12-26 9:27
 */
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        /*url.endsWith 把url拿来做比较*/

       if(!url.endsWith("/crm-api/")){
           //从http请求头中取出token
           String token = request.getHeader("token");


           //执行认证
           if (TokenUtil.verify(token)) {
               return true;
           } else {
               response.setCharacterEncoding("UTF-8");
               response.setContentType("application/json; charset=utf-8");
               ObjectMapper objectMapper = new ObjectMapper();
               response.getWriter().println(objectMapper.writeValueAsString(Result.fail("token验证失败", null)));
               return false;
           }
       }

       return true;

    }


    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

