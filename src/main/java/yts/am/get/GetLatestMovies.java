package yts.am.get;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class GetLatestMovies {

	
	public static void main(String args[]){
		RestTemplate req = new RestTemplate();
		String a = req.getForObject("https://yts.am/api/v2/list_upcoming.json", String.class);
		System.out.println(a);
	}
}
