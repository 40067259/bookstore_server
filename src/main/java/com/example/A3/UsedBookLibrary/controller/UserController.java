package com.example.A3.UsedBookLibrary.controller;

import com.example.A3.UsedBookLibrary.domain.User;
import com.example.A3.UsedBookLibrary.service.MyResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("user/")
@CrossOrigin
public class UserController implements Serializable {
    private static ArrayList<User> users = new ArrayList<>();
    private static Map<String, String> tokenUsername = new HashMap<String, String>();
    private static Map<String, Date> tokenExpiration = new HashMap<String, Date>();

    @PostMapping(path = "register", produces = "application/json")
    public String createUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User(username, password);
        users.add(user);
        return "Created user: " + username+ " successfully";
    }

    @PostMapping(path = "login", produces = "application/json")
    public Response login(@FormParam("username") String username, @FormParam("password") String password) {
        System.out.println(username +" : "+password);
        User user = users.stream().filter(user1 -> user1.getUsername().equals(username))
                .findFirst()
                .orElse(null);
        MyResponse authResponse;
        Response.Status status;
        if (user != null) {
            if (user.getPassword().equals(password)) {
                user.generateToken();
                System.out.println("Login token1: "+user.getToken());
                tokenUsername.put(user.getToken(), username);
                tokenExpiration.put(user.getToken(), new Date());
                System.out.println("Login token: "+user.getToken());
                authResponse = new MyResponse(true, user.getToken());
                status = Response.Status.OK;
            } else {
                authResponse = new MyResponse(false, "");
                status = Response.Status.UNAUTHORIZED;
            }
        } else {
            authResponse = new MyResponse(false, "");
            status = Response.Status.FORBIDDEN;
        }
        return Response.status(status).entity(authResponse).build();
    }

    @GetMapping(path = "logout")
    @Produces("application/json")
    public String logout(@RequestHeader(value = "token") String token) {
        String u = null;
        for (String t: tokenUsername.keySet())
        {
            if (t.equalsIgnoreCase(token))
            {
                u = tokenUsername.get(t);
                break;
            }
        }
        final String username = u;
        User user = users.stream().filter(user1 -> user1.getUsername().equals(username))
                .findFirst()
                .orElse(null);
        if (user != null) {
            if (user.getToken().equals("")) {
                return "Not logged in.";
            } else {
                tokenUsername.remove(user.getToken());
                tokenExpiration.remove(user.getToken());
                user.destroyToken();
                return "Logged out. Token successfully destroyed.";
            }
        } else {
            return "User does not exist!";
        }
    }
    @PostMapping(path = "auth", produces = MediaType.APPLICATION_JSON_VALUE)
    public static ResponseEntity<String> validateToken(@RequestHeader("token") String token){
        Map<String, String> body = new HashMap<>();
        if (tokenUsername.containsKey(token)) {
            body.put("success", "true");
            Date timeNow = new Date();
            long diff = timeNow.getTime() - tokenExpiration.get(token).getTime();
            long tokenDuration = TimeUnit.MILLISECONDS.toMinutes(diff);
            System.out.println("Duration: " + tokenDuration);
            if (tokenDuration > 30) {
                tokenUsername.remove(token);
                tokenExpiration.remove(token);
            } else {
                return new ResponseEntity<String>("true", HttpStatus.OK);
            }
        }
        body.put("success", "false");
        return new ResponseEntity<String>("false", HttpStatus.UNAUTHORIZED);
    }
}
