package telran.user.dao;

import telran.user.data.*;

public class Forum {
	private Post[] posts;
	 int size;
	 
	 public Forum (int capasity) {
		 posts= new Post[capasity];
		 size=0;
	 }
	 
	 public int getSize() {
		 return size;
	 }
	 
	 public boolean addPost(Post post) {
		 if(size<posts.length) {
				posts[size]=post;
				size++;
				return true;
			}
			return false;
		}
	 
	 public boolean removePost(int postID) {
		 

			for (int i = 0; i < size; i++) {
				if(posts[i].getPostId()==postID){
					posts[i]=posts[size-1];
					size--;
					return true;
					
				}
				
			}
			return false;
		}

	public Post getPostById(int postID) {
		for (int i = 0; i <size ; i++) {
			if(posts[i].getPostId()==postID) {
				return posts[i];
			}
			
		}
		return null;
	}
	 
	 
	 public Post[] getPostbyAuthor(String author,int numbersOfPost) {
		 Post[] p2= new Post[numbersOfPost];
			int size=0;
			for (int i = 0; i < size; i++) {
				if(posts[i].getAuthor()==author){
					p2[size]=posts[i];
					size++;
				}
				
			}
			return p2;
	 }

}
