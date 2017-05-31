package org.dimigo.exception;

public class MovieTest{
	public static void main(String[] args){
		Movie[] movies = {
			new Movie("���̸���:Ŀ����Ʈ", 15),
			new Movie("������� ���� ������", 12)
		};
		int	age = 13;
		for(Movie movie	: movies) {
			try{
				movie.buyTicket(age);
			}
			catch(Exception e){
				System.err.println(e.getMessage());
			}
		}
	}
}
