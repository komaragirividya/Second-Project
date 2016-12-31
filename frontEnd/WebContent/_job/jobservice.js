app.factory('JobService',function($http){
	var jobService={};
	var BASE_URL ="http://localhost:8080/chat"
	jobService.saveJob=function(job){
		return $http.post(BASE_URL + "/postJob" , job)
		.then(function(response){
			console.log('job service sucess')
			console.log(response.status)
			console.log(response.headers.location)
			return response.status
		},function(response){
			console.log('job service failure')
			console.log(response.status)
			return response.status
		})
	}
	
	
	jobService.getAllJobs=function(){
		return $http.get(BASE_URL + "/getAllJobs");
	}
	return jobService;
})