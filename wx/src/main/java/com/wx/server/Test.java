package com.wx.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class Test
 */
@WebServlet("/test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=utf-8");
		/* 设置响应头允许ajax跨域访问 */
		response.setHeader("Access-Control-Allow-Origin", "*");
		/* 星号表示所有的异域请求都可以接受， */
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");

		// 获取微信小程序get的参数值并打印
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username=" + username + " ,password=" + password);

		/*
		 * //返回值给微信小程序 Writer out = response.getWriter(); out.write("进入后台了");
		 * out.flush();
		 */

		/*
		 * src: '/images/cat.jpg', itemName: '稻花鸡', describe: '商品描述', stock:
		 * '库存', salesVolume: '销量:10', price: '￥153'
		 */

		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Cache-Control", "no-cacle");
		PrintWriter out = response.getWriter();

		ArrayList<Cate> cates = new ArrayList<Cate>();

		// 设置商品类别1
		ArrayList<Children> childList1 = new ArrayList<Children>();
		Children child1 = new Children(1, "child1", "/images/cat.jpg");
		Children child2 = new Children(2, "child2", "/images/cat.jpg");
		childList1.add(child1);
		childList1.add(child2);
		Cate cate1 = new Cate(1, "cate1", true, childList1);
		cates.add(cate1);

		// 商品类别2
		ArrayList<Children> childList2 = new ArrayList<Children>();
		Children child3 = new Children(1, "child3", "/images/cat.jpg");
		Children child4 = new Children(2, "child4", "/images/cat.jpg");
		Children child5 = new Children(3, "child5", "/images/cat.jpg");
		Children child6 = new Children(4, "child6", "/images/cat.jpg");
		childList2.add(child3);
		childList2.add(child4);
		childList2.add(child5);
		childList2.add(child6);
		Cate cate2 = new Cate(2, "cate2", true, childList2);
		cates.add(cate2);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cateItems", cates);

		System.out.println(JSONObject.fromObject(map).toString());

		out.print(JSONObject.fromObject(map).toString());
		out.flush();
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
