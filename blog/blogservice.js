app.factory('BlogService',function($http){
	var blogService=this;
	
	blogService.addPost=function(blogPost){
		console.log('addpost in service')
		return $http.post("http://localhost:8080/chat/blog",blogPost);
	}
	
	blogService.getBlogPosts=function(){
		console.log('getBlogposts in service')
		return $http.get("http://localhost:8080/chat/blog/list")
	}
	blogService.getBlogDetail=function(id){
		console.log('getBlogDetails')
		return $http.get("http://localhost:8080/chat/blog/get/"+ id)
	}
	
	blogService.addComment=function(comment){
		return $http.post("http://localhost:8080/chat/blog/comment",comment)
	}
	blogService.getComments=function(blogId){
		console.log('getcomments -- service')
		return $http.get("http://localhost:8080/chat/blog/getcomments/"+blogId)
	}
	return blogService;
})