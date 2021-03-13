package guru.springframework.springrestclientexamples.service;

import guru.springframework.springrestclientexamples.domain.User;
import guru.springframework.springrestclientexamples.domain2.User2;

import java.util.List;

public interface ApiService {

    List<User2> getUsers(Integer limit);
}
