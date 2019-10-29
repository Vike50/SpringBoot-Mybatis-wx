package com.imooc.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: GlobalExceptionHandler
 * Description:
 * date: 2019/10/29 14:31
 *
 * @author Wusihao
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	private Map<String,Object> exceptionHandler(HttpServletRequest request,Exception e){
		Map<String,Object> map = new HashMap<>();
		map.put("success",false);
		map.put("errMsg",e.getMessage());
		return map;
	}
}
