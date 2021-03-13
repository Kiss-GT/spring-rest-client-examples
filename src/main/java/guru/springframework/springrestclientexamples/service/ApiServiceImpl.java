package guru.springframework.springrestclientexamples.service;


import guru.springframework.springrestclientexamples.domain2.User2;
import guru.springframework.springrestclientexamples.domain2.UserData2;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService{

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public List<User2> getUsers(Integer limit) {


        UserData2 userData=restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?limit="+limit, UserData2.class);
        return userData.getData();
    }
}
