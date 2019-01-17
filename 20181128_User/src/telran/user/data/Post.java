package telran.user.data;

public class Post {
	private User author;
	private int postId;
	private String title;
	private String content;
	private int likes;
	
	public Post(User author, int postId, String title, String content, int likes) {
		super();
		this.author = author;
		this.postId = postId;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getAuthor() {
		return author;
	}

	public int getPostId() {
		return postId;
	}

	public String getTitle() {
		return title;
	}

	public int getLikes() {
		return likes;
	}
	
	//public int addLike() {
		
	//}
//	public void setContent(String newContent) {
		
	//}
	
	

}
