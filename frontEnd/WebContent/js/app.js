var app=angular.module("myApp",['ngRoute'])
app.config(function($routeProvider){
	console.log('entering configuration')
	$routeProvider
	.when('/login',{
		controller:'UserController',
		templateUrl:'user/login.html'
	})
	.when('/register',{
		controller:'UserController',
		templateUrl:'user/register.html'
	})
	.when('/home',{
		templateUrl:'home/home.html'
	})
	.when('/listOfUsers',{
		controller:'UserController',
		templateUrl:'user/listOfUsers.html'
	})
	.when('/postJob',{
		controller:'JobController',
		templateUrl:'_job/createJob.html'
	})
	.when('/getAllJobs',{
		controller:'JobController',  // write a function to get all jobs from the backend => JobService
		templateUrl:'_job/jobTitles.html'  // to display the job titles in html page
	})
	.when('/uploadPicture',{
		templateUrl:'user/fileUpload.html'
})
.when('/friendsList',{
		controller:'FriendController',
		templateUrl:'_friend/listOfFriends.html'
	})
	.when('/pendingRequest',{
		controller:'FriendController',
		templateUrl:'_friend/pendingRequest.html'
		
	})
	.when('/getAllUsers',{
		controller:'UserController',
		templateUrl:'user/listOfUsers.html'
		
	})
	
	
	.when('/addPost',{
		controller:'BlogController',
		templateUrl:'blog/newPost.html'
	})
	.when('/getAllBlogs',{
		controller:'BlogController',
		templateUrl:'blog/blogList.html'
	})
       .when('/getBlogDetail/:id',{
		controller:'BlogDetailController',
		templateUrl:'blog/getBlogDetail.html'
	})
})