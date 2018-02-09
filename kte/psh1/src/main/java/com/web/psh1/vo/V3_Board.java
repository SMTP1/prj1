
package com.web.psh1.vo;

public class V3_Board {
	private int no = 0;
	private String title = null;
	private String writer = null;
	private int hit = 0;
	private String date1 = null;
	private String content = null;
	private int page1;
	private int page2;
	
	public int getPage1() {
		return page1;
	}
	public void setPage1(int page1) {
		this.page1 = page1;
	}
	public int getPage2() {
		return page2;
	}
	public void setPage2(int page2) {
		this.page2 = page2;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String context) {
		this.content = context;
	}
	
}
