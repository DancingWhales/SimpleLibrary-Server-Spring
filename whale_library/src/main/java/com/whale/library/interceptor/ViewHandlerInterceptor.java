package com.whale.library.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * ViewHandlerInterceptor.java
 *
 * @author miseongShin
 * @version 1.0 /2018. 7. 4.
 */
public class ViewHandlerInterceptor extends HandlerInterceptorAdapter {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(ViewHandlerInterceptor.class);

	@Override
	public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler)
			throws Exception {
		if (LOG.isDebugEnabled()) {
			LOG.debug("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ start" + request.getRequestURI());
		}
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler,
			final ModelAndView modelAndView) throws Exception {
		if (LOG.isDebugEnabled()) {
			LOG.debug("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ end" + request.getRequestURI());
		}
		super.postHandle(request, response, handler, modelAndView);
	}

}
