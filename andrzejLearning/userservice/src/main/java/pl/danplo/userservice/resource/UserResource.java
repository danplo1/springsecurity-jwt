package pl.danplo.userservice.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.danplo.userservice.model.User;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{email}")
    public String getUser(@PathVariable("email") final String email){

        ResponseEntity<String> userResponce = restTemplate.exchange("http://localhost:8300//rest/db"
                + email, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {});

        String user = userResponce.getBody();

        return user;
    }

    @GetMapping("/getall")
    public List<User> getAllUsers(){

        ResponseEntity<List<User>> userResponce = restTemplate.exchange("http://localhost:8300//rest/db/all",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {});

        List<User> userList = userResponce.getBody();

        return userList;
    }

    @PostMapping("/saveuser")
    public List<User> sendUser(@RequestBody final User user){

        restTemplate.postForObject("http://localhost:8300//rest/db/adduser", user, String.class);

        List<User> users = getAllUsers();

        return users;

    }

}
