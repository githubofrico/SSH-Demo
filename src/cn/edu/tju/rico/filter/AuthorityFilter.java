package cn.edu.tju.rico.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorityFilter implements Filter {

	private String loginPath;
	private String registPath;
	private String rootPath;
	private String choicePath;

	public void destroy() {
		// TODO Auto-generated method stub
		loginPath = null;
		registPath = null;
		rootPath = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String servletPath = req.getServletPath();
		System.out.println(servletPath);
		if (loginPath.contains(servletPath) || registPath.contains(servletPath)
				|| rootPath.contains(servletPath) || servletPath.contains(choicePath)
				|| req.getSession().getAttribute("uname") != null) {
			System.out.println(req.getSession().getAttribute("uname"));
			chain.doFilter(req, resp);
		} else {
			resp.sendRedirect(req.getContextPath() + rootPath);
		}
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		loginPath = filterConfig.getInitParameter("loginPath");
		registPath = filterConfig.getInitParameter("registPath");
		rootPath = filterConfig.getInitParameter("rootPath");
		choicePath = filterConfig.getInitParameter("choicePath");
	}
}
