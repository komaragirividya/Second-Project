app.factory('UserService',function($http){
	console.log('entering UserService')
	var BASE_URL="http://localhost:8080/chat/"
	var userService=this;
	
	
	userService.fetchAllUsers=function(){
		console.log('entering fetchallusers in service')
		return $http.get("http://localhost:8080/chat/user")
		.then(function(response){
			//response is an object returened from the back end
			//data,status,headers,statustext
			//data-list of person
			console.log(response.data)
			console.log(response.status)
			return response.data
		},
		function(response)
		{
			console.log(response.data)
			return response.data
		})
	};
	
	userService.authenticate=function(user){
		console.log('entering servce login')
		return $http.post(BASE_URL + "/login",user);
		
	};
	
	userService.registerUser=function(user){
		console.log('entering userservice register page')
		return $http.post(BASE_URL + "/register",user) 
		.then(function(response){
			console.log(response.status)
			console.log(response.headers.location)
			return response.status
		},function(response){
			console.log(response.status)
			return response.status
		})
	}
	
	
	
	userService.logout=function(){
		console.log('entering logout service')
		return $http.put(BASE_URL + "/logout")
	};
	
	
	
	userService.getAllUsers=function(){
		console.log('entering getallusers in user service')
		return $http.get(BASE_URL +"/getUsers")
	}
	
	userService.friendRequest=function(username){
		console.log('service --- friendRequest');
		return $http.post(BASE_URL+ '/friendRequest',username);
	}
	
	return userService;
})