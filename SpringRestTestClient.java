package com.tsys.client;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tsys.model.Response;
import com.tsys.model.User;

public class SpringRestTestClient {

	public static final String REST_SERVICE_URI = "http://localhost:8080/SpringRest";
	
	/* GET */
	@SuppressWarnings("unchecked")
/*	private static void listAllUsers(){
		System.out.println("Testing listAllUsers API-----------");
		
		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/user/", List.class);
		
		if(usersMap!=null){
			for(LinkedHashMap<String, Object> map : usersMap){
	            System.out.println("User : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
	        }
		}else{
			System.out.println("No user exist----------");
		}
	}*/
	
	/* GET */
	private static void getUser(){
		System.out.println("Testing getUser API----------");
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<Response> response = restTemplate.exchange(REST_SERVICE_URI+"/user/1", HttpMethod.GET, entity, Response.class);
		if(response.getStatusCode().equals(HttpStatus.OK)){
			
			Response res = response.getBody();
	        System.out.println(res);

		}
	}
	
/*	 POST 
    private static void createUser() {
		System.out.println("Testing create User API----------");
    	RestTemplate restTemplate = new RestTemplate();
        User user = new User(0,"Sarah",51,134);
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/user/", user, User.class);
        System.out.println("Location : "+uri.toASCIIString());
    }

     PUT 
    private static void updateUser() {
		System.out.println("Testing update User API----------");
        RestTemplate restTemplate = new RestTemplate();
        User user  = new User(1,"Tomy",33, 70000);
        restTemplate.put(REST_SERVICE_URI+"/user/1", user);
        System.out.println(user);
    }

     DELETE 
    private static void deleteUser() {
		System.out.println("Testing delete User API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/user/3");
    }


     DELETE 
    private static void deleteAllUsers() {
		System.out.println("Testing all delete Users API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/user/");
    }
*/
    public static void main(String args[]){
/*		listAllUsers();
*/	/*	getUser();*/
		getUser();
/*		listAllUsers();
		updateUser();
		listAllUsers();
		deleteUser();
		listAllUsers();
		deleteAllUsers();
		listAllUsers();*/
    }
}