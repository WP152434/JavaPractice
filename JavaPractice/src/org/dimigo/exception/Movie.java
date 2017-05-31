package org.dimigo.exception;

public class Movie{
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
	public void buyTicket(int age) throws Exception{
        if(age < this.limitAge) {
            throw new Exception(this.title+"��/�� "+this.limitAge+"�� �̻� �������Դϴ�.");
        }
        else{
        	System.out.println(this.title+" ���ϼ���.");
        }
	}
}
